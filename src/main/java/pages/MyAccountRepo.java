package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MyAccountRepo {
    WebDriver driver2;
    RegistrationPageRepo robj;
    Faker faker;

    public MyAccountRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);
        robj = new RegistrationPageRepo(driver2);
        faker = new Faker();

    }
    @FindBy(xpath = "//a[@title='View my customer account']/span")
    WebElement userNameCheck;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenLink;



    public boolean checkUsername()
    {
        String uName = robj.firstName;
        try
        {
            String uname = userNameCheck.getText();
            System.out.println(uname);
            System.out.println("user name = "+userNameCheck.getText());
            boolean result = uname.contains(uName);



            System.out.println(result);
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }

    public void clickOnWomenLink()
    {
        womenLink.click();
    }




}
