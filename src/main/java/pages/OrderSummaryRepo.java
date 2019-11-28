package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryRepo {
    WebDriver driver2;

    public OrderSummaryRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement confirmMyOrder;

    public void payByBankWirePagechecklist()
    {

        confirmMyOrder.click();
    }
}
