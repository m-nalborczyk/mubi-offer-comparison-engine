package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compare_Car_Insurance_PO extends Base_PO{

    public Compare_Car_Insurance_PO(){
        super();
    }

    private @FindBy(xpath = "//input[@placeholder=\"Rok produkcji\"]")
    WebElement rokProdukcji_TextField;

    private @FindBy(xpath = "//input[@placeholder=\"Marka\"]")
    WebElement marka_TextField;


    public void navigateTo_Compare_Car_Insurance_Page(){
        navigateToUrl("https://mubi.pl/");
    }
    public void sendRokProdukcji(String rokProdukcji) throws InterruptedException {
        sendKeys(rokProdukcji_TextField, rokProdukcji);
        confirmFromExpandableOptions();
    }
    public void sendMarka(String marka) throws InterruptedException {
        sendKeys(marka_TextField, marka);
        confirmFromExpandableOptions();
    }
}
