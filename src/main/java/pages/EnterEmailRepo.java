package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterEmailRepo {
    WebDriver driver2;
    Faker faker;

    public EnterEmailRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);
         faker = new Faker();

    }

    @FindBy(id = "email_create")
    public WebElement emailInputBox;
    @FindBy(id = "SubmitCreate")
    public WebElement createAnAccountButton;
    @FindBy(id = "create_account_error")
    public WebElement create_account_error;



    public void enterEmailId()
    {
        emailInputBox.clear();
        emailInputBox.sendKeys(faker.name().firstName()+"@gmail.com");
        createAnAccountButton.click();
    }

    public boolean createAccountWithEmptyEmailId()
    {
        try {

            createAnAccountButton.click();
            Thread.sleep(1000);
            boolean result =create_account_error.isDisplayed();
            System.out.println(result);

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }

    public boolean enterWrongEmailId()
    {
        try
        {
            createAnAccountButton.clear();
            createAnAccountButton.sendKeys("neosoft");
            Thread.sleep(1000);
            boolean result =create_account_error.isDisplayed();
            return result;
        }catch (Exception e) {
            return true;
        }
    }


}
