package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeDashboardRepo {
    public WebDriver driver1;

    public AutomationPracticeDashboardRepo(WebDriver driver2) {

        System.out.println("Inside repo constraction "+driver2);
        driver1 = driver2;
        PageFactory.initElements(driver1, this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signInButton;


    public void clickOnSignInButton()
    {
        signInButton.click();
    }

}
