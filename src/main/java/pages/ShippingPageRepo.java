package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPageRepo {
    WebDriver driver2;

    public ShippingPageRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }
    @FindBy(id = "cgv")
    WebElement termsCheckbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement proceedToCheckoutShippingRepo;

    public void shippingPagechecklist()
    {
        termsCheckbox.click();
        proceedToCheckoutShippingRepo.click();
    }
}
