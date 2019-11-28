package test;

import base.Pageobjects;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.AutomationPracticeDashboardRepo;
import pages.EnterEmailRepo;
import pages.MyAccountRepo;
import pages.RegistrationPageRepo;

public class MyAccountTest extends Pageobjects {
    EnterEmailRepo enterEmailOBJ;
    AutomationPracticeDashboardRepo apdOBJ;
    MyAccountRepo myAccOBJ;
    RegistrationPageRepo regOBJ;

//    public MyAccountTest(WebDriver driver) {
//        super(driver);
//    }

//    @BeforeClass
//    public void setUp(){
//        myAccOBJ = new MyAccountRepo(driver);
//        regOBJ = new RegistrationPageRepo(driver);
//        apdOBJ = new AutomationPracticeDashboardRepo(driver);
//        enterEmailOBJ = new EnterEmailRepo(driver);
//
//    }
//    @BeforeTest
//    @Parameters("browserName")
//    public void init(String browserName)
//    {
//        initialization(browserName);
//    }
    @Test(priority = 0)
    public void landOnregistrationPage()
    {
        apdOBJ.clickOnSignInButton();
        enterEmailOBJ.enterEmailId();
        regOBJ.fillRegistratinForm();
    }

    @Test(priority = 1)
    public void checckUserName()
    {
        Assert.assertTrue(myAccOBJ.checkUsername());
    }

    @Test(priority = 1)
    public void clickOnAllCategories()
    {
        myAccOBJ.clickOnWomenLink();
    }


}
