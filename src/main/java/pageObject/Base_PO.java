package pageObject;

import driver.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Globa_Vars;

import java.time.Duration;

public class Base_PO {

    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    public void navigateToUrl(String url) {
        getDriver().get(url);
    }

    public void clickElement(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        WebElement element = retryUntilOneConditionIsMet(wait, by,
                ExpectedConditions.elementToBeClickable(by),
                ExpectedConditions.presenceOfElementLocated(by),
                ExpectedConditions.visibilityOfElementLocated(by)
        );
        element.click();
    }

    //waiting until at least one of the ExpectedCondition is true to be used for click method
    private WebElement retryUntilOneConditionIsMet(WebDriverWait wait, By by, ExpectedCondition<WebElement>... conditions) {
        for (ExpectedCondition<WebElement> condition : conditions) {
            try {
                return wait.until(condition);
            } catch (Exception ignored) {
            }
        }
        throw new TimeoutException("All conditions failed for element located by: " + by);
    }

    public void sendKeys(By by, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Globa_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }

    public void sendKeys(WebElement element, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Globa_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }

    //handling dynamic list by imitating keyboard user actions DOWN + ENTER for choice confirmation
    public void confirmFromExpandableOptions() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        Thread.sleep(100);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(100);
        actions.sendKeys(Keys.ENTER).perform();

    }

}
