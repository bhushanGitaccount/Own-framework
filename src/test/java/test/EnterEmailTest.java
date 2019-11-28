package test;
import base.Pageobjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EnterEmailTest extends Pageobjects {
//    EnterEmailRepo enterEmailOBJ;
//    AutomationPracticeDashboardRepo apdOBJ;

//    public EnterEmailTest(WebDriver driver) {
//        super(driver);
//    }

//    @BeforeClass
//    public void setUp(){
//         enterEmailOBJ = new EnterEmailRepo(driver);
//        System.out.println("test driver is "+driver);
//        apdOBJ = new AutomationPracticeDashboardRepo(driver);
//    }
//    @BeforeTest
//    @Parameters("browserName")
//    public void init(String browserName)
//    {
//        initialization(browserName);
//    }

    @Test(priority = 0)
    public void clickOnSignInButton()
    {
        apdOBJ.clickOnSignInButton();
    }

    @Test(priority = 1)
    public void negativeEmailIdCheck()
    {
        Assert.assertTrue(enterEmailOBJ.createAccountWithEmptyEmailId());

    }

    @Test(priority = 2 )
    public void negativeEmailId()
    {
        Assert.assertTrue(enterEmailOBJ.enterWrongEmailId());
    }

    @Test(priority = 3)
    public void enterEmailId()
    {
//        testinfo = extent.createTest("Enter Email ID Test Cases");
        enterEmailOBJ.enterEmailId();

    }
    @Test(priority = 3)
    public void teardawn()
    {
//        testinfo = extent.createTest("Close browser");
        driver.close();
    }
}
