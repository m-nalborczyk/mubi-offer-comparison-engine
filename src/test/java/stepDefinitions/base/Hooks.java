package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Date;
import java.text.SimpleDateFormat;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }

    //creating screenshot in report at step that has failed
    @AfterStep
    public void captureExceptionImage(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            // Convert timestamp to Date object
            long timestamp = System.currentTimeMillis();
            Date date = new Date(timestamp);
            // Format the date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedTime = dateFormat.format(date);
            scenario.attach(screenshot, "image/png", "Attached Image - " + formattedTime);
        }
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }

}
