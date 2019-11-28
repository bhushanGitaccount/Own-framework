package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingSummaryRepo {
    WebDriver driver2;

    public ShoppingSummaryRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }

    @FindBy(xpath = "//div[@id='center_column']/p//a[@title='Proceed to checkout']")
    WebElement proceedToCheckoutSummaryRepo;

    public void summaryPagechecklist()
    {
        proceedToCheckoutSummaryRepo.click();
    }

}
