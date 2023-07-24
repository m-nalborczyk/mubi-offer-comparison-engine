package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Base_PO;
import java.time.Duration;
import java.util.List;


public class Compare_Car_Insurance extends Base_PO {

    private WebDriver driver = getDriver();

    @Given("I access Mubi insurance offer comparison page")
    public void i_access_mubi_insurance_offer_comparison_page() {
        navigateToUrl("https://mubi.pl/");
    }
    @When("I accept cookies popup")
    public void i_accept_cookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Rok produkcji\"]"))).sendKeys("2002");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

    }
    @And("I choose a specific brand from the drop down list VOLKSWAGEN")
    public void i_choose_a_specific_brand_from_the_drop_down_list_volkswagen() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Marka\"]"))).sendKeys("VOLKSWAGEN");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();


    }
    @And("I choose a specific model from the drop down list PASSAT")
    public void i_choose_a_specific_model_from_the_drop_down_list_PASSAT() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Model\"]"))).sendKeys("PASSAT");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @And("I choose a specific fuel from the drop down list DIESEL")
    public void i_choose_a_specific_fuel_from_the_drop_down_list_diesel() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Rodzaj paliwa\"]"))).sendKeys("DIESEL");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @And("I choose a specific engine size from the drop down list 1896cm3")
    public void i_choose_a_specific_engine_size_from_the_drop_down_list_1896cm3() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Pojemność silnika\"]"))).sendKeys("1896");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @And("I choose a specific doors amount from the drop down list 5doors")
    public void i_choose_a_specific_doors_amount_from_the_drop_down_list_5doors() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Liczba drzwi\"]"))).sendKeys("5");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @And("I choose a specific version from the drop down list COMFORTLINE")
    public void i_choose_a_specific_version_from_the_drop_down_list_comfortline() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Wersja\"]"))).sendKeys("COMFORTLINE");
        Thread.sleep(300);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(300);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
    }
    @And("I enter a specific date for start of the insurance 01082023")
    public void i_enter_a_specific_date_for_start_of_the_insurance() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement insurenceDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"insurance.startDate\"]")));
        insurenceDate.sendKeys("01082023");
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@type='submit']//span[@class='jss30']")).click();
        Thread.sleep(500);
        WebElement consentRegulations = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"consent.regulations\"]")));
        consentRegulations.click();
        driver.findElement(By.xpath("//button[@type='submit']//span[@class='jss30']")).click();
    }
    @And("I choose for private usage")
    public void i_choose_for_private_usage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='plannedUsage.wayOfUse'][1]")));
        radioButton.click();

    }
    @And("I enter a specific mileage 330 thousands km")
    public void i_enter_a_specific_mileage() {
        driver.findElement(By.xpath("//input[@name=\"car.mileage\"]")).sendKeys("330");

    }
    @And("I enter a specific 12-month prediction distance up to 20k km")
    public void i_enter_a_specific_month_prediction_distance()  {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"plannedUsage.yearlyMileage\"]"))).sendKeys("25");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }
    @And("I enter a specific date of first registration 29042002")
    public void i_enter_a_specific_date_of_first_registration() {
        driver.findElement(By.xpath("//input[@name=\"car.firstRegistrationDate\"]")).sendKeys("29042002");
    }
    @And("I choose a specific year of car purchase 2003")
    public void i_choose_a_specific_year_of_car_purchase() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"car.ownerPurchaseYear\"]"))).sendKeys("2003");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(500);
    }

    @And("I choose a specific country of first registration Poland")
    public void i_choose_a_specific_country_of_first_registration_poland() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='car.firstRegistrationCountry'][1]")));
        radioButton.click();
    }

    @And("I enter a specific registration plate number SB49033")
    public void i_enter_a_specific_registration_plate_number() {
        driver.findElement(By.xpath("//input[@name=\"car.registrationNumber\"]")).sendKeys("SB49033");
    }
    @And("I choose common garage parking spot from drop down list")
    public void i_choose_common_garage_parking_spot_from_drop_down_list() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"plannedUsage.nightParkingPlace\"]"))).sendKeys("We wspólnym garażu");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(500);
    }
    @And("I choose a specific previous Insurer Euroins")
    public void i_choose_a_specific_previous_insurer() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"car.previousInsurer\"]"))).sendKeys("Euroins");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath("//button[@type='submit']//span[@class='jss30']")).click();
        Thread.sleep(1500);

    }
    @And("I choose less amount of offers without providing personal details")
    public void i_choose_less_amount_of_offers_without_providing_personal_details() {
        By elementLocator = By.cssSelector("input[name='personalDataPath']");
        List<WebElement> elements = driver.findElements(elementLocator);
        elements.get(1).click();

    }
    @And("I enter owner's specific date of birth 01.01.1990")
    public void i_enter_owner_s_specific_date_of_birth() {
        driver.findElement(By.xpath("//input[@name=\"owner.birthDate\"]")).sendKeys("01011990");
    }
    @And("I choose a specific year of getting driver's licence 2008")
    public void i_choose_a_specific_year_of_getting_driver_s_licence() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"owner.driverLicenseYear\"]"))).sendKeys("2008");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(500);
    }
    @And("I enter a specific address postal code 43-300")
    public void i_enter_a_specific_address_postal_code() {
        driver.findElement(By.xpath("//input[@name=\"owner.legalAddress.zipCode\"]")).sendKeys("43300");
    }
    @And("I choose male gender")
    public void i_choose_male_gender() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='owner.gender'][1]")));
        radioButton.click();
        Thread.sleep(500);
    }
    @And("I choose single martial status")
    public void i_choose_single_martial_status() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='owner.maritalStatus'][1]")));
        radioButton.click();
        Thread.sleep(500);
        }
    @And("I choose not having children below 26 years old")
    public void i_choose_not_having_children_below_years_old() {
        List<WebElement> radioButtons = driver.findElements(By.name("owner.hasChildren"));
        WebElement radioButton = radioButtons.get(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(radioButton).click().perform();

    }
    @And("I choose 0 additional owners of the car")
    public void i_choose_0_additional_owners_of_the_car() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='car.coownersCount'][1]")));
        radioButton.click();
    }
    @And("I choose no additional users of the car")
    public void i_choose_no_additional_users_of_the_car() {
        By elementLocator = By.cssSelector("input[name='car.hasAdditionalDrivers']");
        List<WebElement> elements = driver.findElements(elementLocator);
        elements.get(1).click();
    }
    @And("I choose as the owner buying OC insurance for at least 6 years")
    public void i_choose_of_buying_car_insurance_from_drop_down_list() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"owner.ocInsuranceHistory.length\"]"))).sendKeys("co najmniej sześć lat");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(500);
    }
    @And("I choose no OC insurance ever claimed")
    public void i_choose_from_drop_down_list() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"owner.ocInsuranceHistory.claimsCount\"]"))).sendKeys("Nie, nie było");
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }
    @And("I choose no AC insurance history")
    public void i_choose_no_ac_insurance_history() {
        By elementLocator = By.cssSelector("input[name='owner.acHistorySame']");
        List<WebElement> elements = driver.findElements(elementLocator);
        elements.get(2).click();
    }
    @And("I click on CALCULATE button")
    public void i_click_on_button() {
        driver.findElement(By.xpath("//button[@type='submit']//span[@class='jss30']")).click();
    }
    @Then("I should be presented with successful offers page")
    public void i_should_be_presented_with_successful_offers_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement offersHeading = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Znaleźliśmy']")));
        if (offersHeading.isDisplayed()) {
            System.out.println("Offers have been found for provided data");
        }else {
            System.out.println("Offers have not been found or test failed");
        }
    }


}
