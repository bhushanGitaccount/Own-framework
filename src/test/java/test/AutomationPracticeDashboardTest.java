package test;
import base.Pageobjects;

import org.testng.annotations.Test;
public class AutomationPracticeDashboardTest extends Pageobjects {


    @Test(priority = 0)
    public  void cickOnSignInButton()
    {
//        testinfo = extent.createTest("Sign In Page UI Test Cases");
        apdOBJ.clickOnSignInButton();
    }
    @Test(priority = 1)
    public void teardawn()
    {
//        testinfo = extent.createTest("Close browser");
        driver.close();
    }
}
