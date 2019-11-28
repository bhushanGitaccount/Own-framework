package Helpers;

import base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class HelperClass extends BaseClass {


    public String[] splitString(String s) {
        String[] browserArray = s.split(",");
        return browserArray;
    }

    public void selectValueFromDropDown(List<WebElement> listOfElements, String selectValue) {
        for (int i = 0; i <= listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            if (element.getText().equalsIgnoreCase(selectValue)) {
                element.click();
            }

        }

    }

    public static String getScreenShot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + File.separator + "Screenshot" + File.separator + System.currentTimeMillis() + ".png";
        File destination = new File(path);
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("CAPTURE FAILED " + e.getMessage());
        }
        return path;
    }

    public boolean selectByPartOfVisibleTextMethod1(WebElement element, String visibleText)
    {
        List<WebElement> options = null;
        visibleText = visibleText.toLowerCase();
        Select select = null;
        String sSelectedText = "";
        try {
                select = new Select(element);
                if (select!=null){
                    options = select.getOptions();
                    for (int i = 0;i<=options.size();i++){
                        if (options.get(i).getText().toLowerCase().contains(visibleText)){
                            select.selectByVisibleText(options.get(i).getText());

                            break;
                        }
                    }
                }else {
                    return false;
                }
//                Thread.sleep(1000);
                sSelectedText = select.getFirstSelectedOption().getText();
                if (sSelectedText.toLowerCase().contains(visibleText)){
                    return true;
                }else {
                    return false;
                }
        }catch (Exception e){
            return false;
        }
    }

}
