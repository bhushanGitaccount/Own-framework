package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageRepo {
    WebDriver driver2;

    public PaymentPageRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    WebElement selectOptionPayByBankWire;

    public void payByBankWirePagechecklist()
    {

        selectOptionPayByBankWire.click();
    }
}
