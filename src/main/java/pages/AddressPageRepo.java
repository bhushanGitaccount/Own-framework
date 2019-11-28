package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPageRepo {

    WebDriver driver2;

    public AddressPageRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }

    @FindBy(xpath = "//button[@name='processAddress']")
    WebElement proceedToCheckoutAddressRepo;

    public void addressPagechecklist()
    {
        proceedToCheckoutAddressRepo.click();
    }
}
