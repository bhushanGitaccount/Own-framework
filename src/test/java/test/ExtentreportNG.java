package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.lang.reflect.Method;

class ExtentreportNG
{
    ExtentReports reports;
    ExtentTest testinfo;
    ExtentHtmlReporter htmlReporter;

    @BeforeTest
    public void setup()
    {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"FirstReport.html");
        htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/ExtentReportNG/extent-config.xml"));
        reports = new ExtentReports();
        reports.setSystemInfo("ENVIRONMENT","QA");
        reports.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void register(Method method)
    {
        String testName = method.getName();
        testinfo= reports.createTest(testName);
    }
    @AfterMethod
    public void captureStatus(ITestResult result)
    {
        if (result.getStatus()==ITestResult.SUCCESS)
        {
            testinfo.log(Status.PASS,"THE TEST METHOD NAMED AS "+result.getName()+" IS PASSED");

        }else if (result.getStatus()==ITestResult.FAILURE)
        {
            testinfo.log(Status.FAIL,"THE TEST METHOD NAMED AS "+result.getName()+" IS FAILED");

        }
    }
    @AfterTest
    public void cleanUp()
    {
        reports.flush();
    }
}