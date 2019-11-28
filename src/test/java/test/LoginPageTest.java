package test;

import base.BaseClass;
import base.Pageobjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPageRepo;

public class LoginPageTest extends Pageobjects
{

//     LoginPageRepo loginOBJ;

//    public LoginPageTest(WebDriver driver) {
//        super(driver);
//    }

//    @BeforeClass
//    public void setUp(){
//        loginOBJ = new LoginPageRepo(driver);
//        System.out.println("test driver is "+driver);
//    }
//    @BeforeTest
//    @Parameters("browserName")
//    public void init(String browserName)
//    {
//        initialization(browserName);
//    }
    @Test(priority = 0)
    public void logInPageUITestCase()
    {
        testinfo = extent.createTest("log In Page UI Test Cases");
        Assert.assertTrue(loginOBJ.verifyLoginPageTitle());
        Assert.assertTrue(loginOBJ.verifyHeader1floginPage());
        Assert.assertTrue(loginOBJ.verifyHeader2loginPage());
        Assert.assertTrue(loginOBJ.verifyUserNameText());
        Assert.assertTrue(loginOBJ.verifyPasswordText());
        Assert.assertTrue(false);
    }

    @Test(priority = 1)
    public void verifLoginSuccessfully()
    {
        testinfo = extent.createTest("verify Login Successfully");
        Assert.assertTrue(loginOBJ.loginUser());
       // Assert.assertTrue(false);
    }
    @Test(priority = 3)
    public void teardawn()
    {
        testinfo = extent.createTest("Close browser");
        driver.close();
    }
}
