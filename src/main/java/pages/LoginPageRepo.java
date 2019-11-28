package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageRepo {
    WebDriver driver2;

    public LoginPageRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);
    }

    //*************************LOGIN PAGE REPOSITORY *****************************
    @FindBy(tagName = "h1")
    public WebElement headerOfLoginPage;

    @FindBy(tagName = "h2")
    public WebElement loginHeader;

    @FindBy(xpath = "//form/p[contains(text(),'UserName')]")
    public WebElement userNameText;

    @FindBy(xpath = "//form/p[contains(text(),'Password')]")
    public WebElement passwordText;

    @FindBy(xpath = "//form/p/input[@name='UserName']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//form/p/input[@name='Password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    //*************************LOGIN PAGE METHODS *****************************

    public boolean verifyLoginPageTitle() {
        String title = driver2.getTitle();
        System.out.println("-----------title : "+title);
        try {
            boolean result = title.equalsIgnoreCase("Execute Automation");
            System.out.println("Result in boolean : "+result);
            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean verifyHeader1floginPage() {
        try {
            boolean result = headerOfLoginPage.getText().equalsIgnoreCase("Execute Automation Selenium Test Site");
            return result;
        } catch (Exception e) {
            return true;
        }

    }

    public boolean verifyHeader2loginPage() {
        try {
            boolean result = loginHeader.getText().equalsIgnoreCase("Login");
            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean verifyUserNameText() {
        try {
            System.out.println(userNameText.getText());
            boolean result = userNameText.getText().equalsIgnoreCase("UserName  ");
            System.out.println("Verify user name text : "+result);
            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean verifyPasswordText() {
        try {
            boolean result = passwordText.getText().equalsIgnoreCase("Password    ");
            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean loginUser() {
        try {
            userNameInputBox.sendKeys("Bhushan more");
            passwordInputBox.sendKeys("bhushan");
            loginButton.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}