package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Base_PO;
import java.time.Duration;


public class Compare_Car_Insurance extends Base_PO {

    private WebDriver driver = getDriver();

    @Given("I access Mubi insurance offer comparison page")
    public void i_access_mubi_insurance_offer_comparison_page() {
        navigateToUrl("https://mubi.pl/");
    }
    @When("I accept cookies popup")
    public void i_accept_cookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
        WebElement element = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        element.click();
    }

    @And("I choose OC AC Insurance")
    public void i_choose_oc_ac_insurance() {
        driver.findElement(By.xpath("//input[@id=\"oc\"]")).click();
    }
    @And("I click on 'Compare offers'")
    public void i_click_on_compare_offers() {
        driver.findElement(By.cssSelector(".button.compare-btn.font-bold.font-ms.shift-arrow")).click();
    }
    @And("I choose car insurance")
    public void i_choose_car_insurance() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-field-key='vehicleType'] input.jss253[value='car']")));
        radioButton.click();
    }
    @And("I choose a specific year from the drop down list 2002")
    public void i_choose_a_specific_year_from_the_drop_down_list_2002() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement svgIcon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html//div[@id='root']/div[@class='jss1']/div[3]/div[@class='jss77']/main[@class='jss78']/form/fieldset[@class='jss129']//div[@class='jss139 jss140']//div[@role='combobox']//input")));
        svgIcon.click();
        Actions actions = new Actions(driver);
        int numClicks = 11;
        for (int i = 0; i<numClicks; i++){
            actions.sendKeys(Keys.DOWN).perform();
            Thread.sleep(300);
        }
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1500);
    }
    @And("I choose a specific brand from the drop down list VOLKSWAGEN")
    public void i_choose_a_specific_brand_from_the_drop_down_list_VOLKSWAGEN() throws InterruptedException {
        Actions actions = new Actions(driver);
        int numClicks = 6;
        for (int i = 0; i<numClicks; i++){
            actions.sendKeys(Keys.DOWN).perform();
            Thread.sleep(300);
        }
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1500);
    }
    @And("I choose a specific model from the drop down list PASSAT")
    public void i_choose_a_specific_model_from_the_drop_down_list_PASSAT() throws InterruptedException {
        Actions actions = new Actions(driver);
        int numClicks = 8;
        for (int i = 0; i<numClicks; i++){
            actions.sendKeys(Keys.DOWN).perform();
            Thread.sleep(300);
        }
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1500);
    }
    @And("I choose a specific fuel from the drop down list")
    public void i_choose_a_specific_fuel_from_the_drop_down_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose a specific engine size from the drop down list")
    public void i_choose_a_specific_engine_size_from_the_drop_down_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose a specific doors amount from the drop down list")
    public void i_choose_a_specific_doors_amount_from_the_drop_down_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose a specific version from the drop down list")
    public void i_choose_a_specific_version_from_the_drop_down_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific date for start of the insurance")
    public void i_enter_a_specific_date_for_start_of_the_insurance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose for personal use")
    public void i_choose_for_personal_use() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific mileage")
    public void i_enter_a_specific_mileage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific {int}-month prediction distance")
    public void i_enter_a_specific_month_prediction_distance(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific date of first registration")
    public void i_enter_a_specific_date_of_first_registration() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose a specific date of car ownership start")
    public void i_choose_a_specific_date_of_car_ownership_start() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific registration plate number")
    public void i_enter_a_specific_registration_plate_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose common garage parking spot from drop down list")
    public void i_choose_common_garage_parking_spot_from_drop_down_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose {string} as present car insurer from drop down list")
    public void i_choose_as_present_car_insurer_from_drop_down_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose less amount of offers without providing personal details")
    public void i_choose_less_amount_of_offers_without_providing_personal_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter owner's specific date of birth")
    public void i_enter_owner_s_specific_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose a specific year of getting driver's licence")
    public void i_choose_a_specific_year_of_getting_driver_s_licence() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I enter a specific address postal code")
    public void i_enter_a_specific_address_postal_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose male gender")
    public void i_choose_male_gender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose single martial status")
    public void i_choose_single_martial_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose not having children below {int} years old")
    public void i_choose_not_having_children_below_years_old(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose {int} additional owners of the car")
    public void i_choose_additional_owners_of_the_car(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I no additional users of the car")
    public void i_no_additional_users_of_the_car() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose {string} of buying car insurance from drop down list")
    public void i_choose_of_buying_car_insurance_from_drop_down_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose {string} from drop down list")
    public void i_choose_from_drop_down_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I choose no AC insurance history")
    public void i_choose_no_ac_insurance_history() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I click on {string} button")
    public void i_click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be presented with successful offers page")
    public void i_should_be_presented_with_successful_offers_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
