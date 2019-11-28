package test;

import base.BaseClass;
import base.Pageobjects;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

public class WomenProductsTest extends Pageobjects
{
//    EnterEmailRepo enterEmailOBJ;
//    AutomationPracticeDashboardRepo apdOBJ;
//    MyAccountRepo myAccOBJ;
//    RegistrationPageRepo regOBJ;
//    WomenProductsRepo wpOBJ;
//
//
//    //temp solution
//    ShoppingSummaryRepo shoppingSOBJ;
//    AddressPageRepo addressPageSOBJ;
//    ShippingPageRepo shippingOBJ;
//    PaymentPageRepo paymentPageOBJ;
//    OrderSummaryRepo orderOBJ;

//    public WomenProductsTest(WebDriver driver) {
//        super (driver);
//    }


//    @BeforeClass
//    public void setUp(){
////        myAccOBJ = new MyAccountRepo(driver);
////        regOBJ = new RegistrationPageRepo(driver);
////        apdOBJ = new AutomationPracticeDashboardRepo(driver);
////        enterEmailOBJ = new EnterEmailRepo(driver);
////        wpOBJ = new WomenProductsRepo(driver);
////
////        //temp solution
////        shoppingSOBJ = new ShoppingSummaryRepo(driver);
////        addressPageSOBJ = new AddressPageRepo(driver);
////        shippingOBJ = new ShippingPageRepo(driver);
////        paymentPageOBJ = new PaymentPageRepo(driver);
////        orderOBJ    = new OrderSummaryRepo(driver);
//
//
//
//    }
//    @BeforeTest
//    @Parameters("browserName")
//    public void init(String browserName)
//    {
//        initialization(browserName);
//    }

    @Test(priority = 0)
    public void landOnWomenCategory()
    {
        apdOBJ.clickOnSignInButton();
        enterEmailOBJ.enterEmailId();
        regOBJ.fillRegistratinForm();
        myAccOBJ.clickOnWomenLink();
        wpOBJ.orderShortSleevtShirt();

        //temp solution

        shoppingSOBJ.summaryPagechecklist();
        addressPageSOBJ.addressPagechecklist();
        shippingOBJ.shippingPagechecklist();
        paymentPageOBJ.payByBankWirePagechecklist();
        orderOBJ.payByBankWirePagechecklist();

    }
}
