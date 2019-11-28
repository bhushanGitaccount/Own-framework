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
import pages.UserFormRepo;

public class UserFormTest extends Pageobjects {

    UserFormRepo userFormOBJ;
    LoginPageRepo loginOBJ;


//    @BeforeClass
//    public void setUp(){
//        userFormOBJ = new UserFormRepo(driver);
//         loginOBJ = new LoginPageRepo(driver);
//
//    }
//    @BeforeTest
//    @Parameters("browserName")
//    public void init(String browserName)
//    {
//        initialization(browserName);
//    }
//**************************TEST CASES***************************************
    @Test(priority = 0)
    public void loginForUserForm()
    {
        System.out.println("OBJECT OF extent ******"+extent);
        testinfo = extent.createTest("Verify log in functionality");
        Assert.assertTrue(loginOBJ.loginUser());
    }
    @Test(priority = 1)
    public void userFormUI()
    {
        testinfo = extent.createTest("Verify user form UI elements");
        Assert.assertTrue(userFormOBJ.verifyUserFormHeaderH1());
        Assert.assertTrue(userFormOBJ.verifyDetailBlockContain());
        Assert.assertTrue(userFormOBJ.verifyUserFormHeaderH2());
        Assert.assertTrue(userFormOBJ.verifyTitletext());
        Assert.assertTrue(userFormOBJ.verifyFirstNameText());
        Assert.assertTrue(userFormOBJ.verifyMiddleNameText());
        Assert.assertTrue(userFormOBJ.verifyInitialText());
        Assert.assertTrue(userFormOBJ.verifyLanguageKnownText());


    }
    @Test(priority = 3)
    public void teardawn()
    {
        testinfo = extent.createTest("Close browser");
        driver.close();
    }



}
