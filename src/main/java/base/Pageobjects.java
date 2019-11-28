package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.*;

public class Pageobjects extends BaseClass {
      public WebDriver driver;

    @BeforeTest
    @Parameters("browserName")
    public void init(String browserName)
    {
        initialization(browserName);
        driver =  super.driver;
        System.out.println(driver+"*********INSIDE BEFORE TEST*****");
        apdOBJ = new AutomationPracticeDashboardRepo(driver);
        enterEmailOBJ = new EnterEmailRepo(driver);
        apdOBJ = new AutomationPracticeDashboardRepo(driver);
        loginOBJ = new LoginPageRepo(driver);
        myAccOBJ = new MyAccountRepo(driver);
        regOBJ = new RegistrationPageRepo(driver);
        apdOBJ = new AutomationPracticeDashboardRepo(driver);
        enterEmailOBJ = new EnterEmailRepo(driver);
        wpOBJ = new WomenProductsRepo(driver);
        shoppingSOBJ = new ShoppingSummaryRepo(driver);
        addressPageSOBJ = new AddressPageRepo(driver);
        shippingOBJ = new ShippingPageRepo(driver);
        paymentPageOBJ = new PaymentPageRepo(driver);
        orderOBJ    = new OrderSummaryRepo(driver);
    }



    public AutomationPracticeDashboardRepo apdOBJ;
    public EnterEmailRepo enterEmailOBJ;
    public MyAccountRepo myAccOBJ;
    public RegistrationPageRepo regOBJ;
    public WomenProductsRepo wpOBJ;
    public ShoppingSummaryRepo shoppingSOBJ;
    public AddressPageRepo addressPageSOBJ;
    public ShippingPageRepo shippingOBJ;
    public PaymentPageRepo paymentPageOBJ;
    public OrderSummaryRepo orderOBJ;
    public LoginPageRepo loginOBJ;


    public WebDriver getDriver()
    {
       return driver;
    }
}
