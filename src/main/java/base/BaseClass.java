package base;

import Helpers.HelperClass;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;
    public static HelperClass help;
    public ExtentReports extent;
    public ExtentTest testinfo;
    public ExtentHtmlReporter htmlReporter;


    public BaseClass() {
        String url;
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\configPackage\\config");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void initialization(String browserName) {

        String browser = browserName.toLowerCase().trim();
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get(prop.getProperty("url"));

                System.out.println("Driver chrome supposed to init---->>" + driver);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get(prop.getProperty("url"));
                System.out.println("Firefox driver supposed to init");
                break;

        }
//        return driver;
//
//    }
//
//
////
////    @BeforeClass
////    public void setup()
//    {
//        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/FirstReport.html");
//        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
//
//        extent = new ExtentReports();
//        extent.setSystemInfo("ENVIRONMENT","QA");
//        extent.setSystemInfo("TESTED BY","BHUSHAN");
//        extent.attachReporter(htmlReporter);
//    }
//    @AfterMethod
//    public void captureStatus(ITestResult ITestResult result;
//            result) throws IOException {
//        if (result.getStatus()==ITestResult.FAILURE)
//        {
//          //  testinfo.fail(MarkupHelper.createLabel(result.getName()+"Test case Failed",ExtentColor.RED));
//            String path = help.getScreenShot(driver);
////            System.out.println("************************"+path);
//            testinfo.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());
//
//            testinfo.fail(result.getThrowable());
//
//        }else if (result.getStatus()==ITestResult.SUCCESS)
//        {
////            testinfo.pass(MarkupHelper.createLabel(result.getName()+" Test case pass ",ExtentColor.GREEN));
//          //  testinfo.pass(result.getThrowable());
//        }else
//        {
//            testinfo.skip(MarkupHelper.createLabel(result.getName()+"Test case Skip ",ExtentColor.YELLOW));
//            //testinfo.skip(result.getThrowable());
//        }
//    }


//    @AfterClass
//    public void cleanUp()
//    {
//        extent.flush();
//    }

    }
}