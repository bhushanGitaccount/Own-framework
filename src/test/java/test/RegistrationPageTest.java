package test;
import base.Pageobjects;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RegistrationPageTest extends Pageobjects {



    @Test(priority = 0)
    public void landOnregistrationPage()
    {
        apdOBJ.clickOnSignInButton();
        enterEmailOBJ.enterEmailId();
    }
    @Test(priority = 1)
    public void registerFormPage()
    {
        Assert.assertTrue(regOBJ.registerwithoutFirstName());
//        Assert.assertTrue(regOBJ.fillRegistratinForm());
       Assert.assertTrue(regOBJ.verifydataFirstName());
       Assert.assertTrue(regOBJ.verifydataLastName());
       Assert.assertTrue(regOBJ.checklandingOnMyAccountPage());
    }


    @Test(priority = 2)
    public void  registerwithoutLastName() {
        Assert.assertTrue(regOBJ.registerwithoutLastName());
    }

    @Test(priority = 3)
    public void registerwithoutPassword() {
        Assert.assertTrue(regOBJ.registerwithoutPassword());
    }

    @Test(priority = 4)
    public void registerwithoutAddress() {
        Assert.assertTrue(regOBJ.registerwithoutAddress());
    }

    @Test(priority = 5)
    public void registerwithoutCity() {
        Assert.assertTrue(regOBJ.registerwithoutCity());
    }

    @Test(priority = 6)
    public void registerwithoutZipCode() {
        Assert.assertTrue(regOBJ.registerwithoutZipCode());
    }

    @Test(priority = 7)
    public void registerwithoutmobilePhone() {
        Assert.assertTrue(regOBJ.registerwithoutMobilePhone());
    }




    @Test(priority = 8)
    public void teardawn()
    {
//        testinfo = extent.createTest("Close browser");
//        driver.close();
    }

}
