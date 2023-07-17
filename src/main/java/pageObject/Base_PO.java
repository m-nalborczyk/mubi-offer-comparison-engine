package pageObject;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class Base_PO {

    public Base_PO(){

    }

    public WebDriver getDriver(){
        return DriverFactory.getDriver();
    }

    public void navigateToUrl (String url){
        getDriver().get(url);
    }


}
