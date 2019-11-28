package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserFormRepo {
    WebDriver driver2;

    public UserFormRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);
    }

    //*************************USER FORM REPOSITORY *****************************
    @FindBy(tagName = "h1")
    public WebElement userFormHeader1;

    @FindBy(xpath = "//div[@id='cssmenu']/following-sibling::p")
    public WebElement detailBlock;

    @FindBy(tagName = "h2")
    public WebElement userFormHeader2;

    @FindBy(xpath = "//label[contains(text(),'Title')]")
    public WebElement titleText;

    @FindBy(xpath = "//label[contains(text(),'Initial')]")
    public WebElement initialText;

    @FindBy(xpath = "//label[contains(text(),'First Name ')]")
    public WebElement firstNameText;

    @FindBy(xpath = "//label[contains(text(),'Middle Name')]")
    public WebElement middleNametext;

    @FindBy(xpath = "//span[contains(text(),'Gender ')]")
    public WebElement genderText;

    @FindBy(xpath = "//span[contains(text(),'Languages Known ')]")
    public WebElement languageKnownsText;

    @FindBy(xpath = "//input[@name='Male']")
    public WebElement maleText;

    @FindBy(xpath = "//input[@value='female']")
    public WebElement femaleText;

    @FindBy(xpath = "//input[@name='english']")
    public WebElement englishText;

    @FindBy(xpath = "//input[@value='hindi']")
    public WebElement hindiText;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//b[contains(text(),'Click For')]")
    public WebElement clickForText;

    @FindBy(xpath = "//b[contains(text(),' Click for Generating JavaScript Alert ')]")
    public WebElement javaScriptAlertText;

    @FindBy(xpath = "//input[@onclick='JScriptAlert()']")
    public WebElement javaScriptpopupButton;

    @FindBy(xpath = "//a[contains(text(),'HtmlPopup')]")
    public WebElement htmlPopupLink;

    @FindBy(id = "TitleId")
    public WebElement mrDropdown;

    @FindBy(id = "Initial")
    public WebElement initialInputBox;

    @FindBy(id = "FirstName")
    public WebElement firstNameInputBox;

    @FindBy(id = "MiddleName")
    public WebElement middleNameInputBox;

    public boolean verifyUserFormHeaderH1() {
        try {

            boolean result = userFormHeader1.getText().equalsIgnoreCase("Execute Automation Selenium Test Site");
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyDetailBlockContain() {
        try {
            boolean result = detailBlock.getText().equalsIgnoreCase("This is a demo website, which act as a mock site for trying out different automation tools");
            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean verifyUserFormHeaderH2() {
        try {

            boolean result = userFormHeader2.getText().equalsIgnoreCase("User Form");

            return result;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean verifyTitletext() {
        try {
            boolean result = titleText.getText().equalsIgnoreCase("Title  *");
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyInitialText() {
        try {
            boolean result = initialText.getText().equalsIgnoreCase("Initial");
            return result;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean verifyFirstNameText()
    {
        try{
            boolean result = firstNameText.getText().equalsIgnoreCase("First Name *");
            return result;
        }catch (Exception e)
        {return false;}
    }
    public boolean verifyMiddleNameText()
    {
        try{

           boolean result =middleNametext.getText().equalsIgnoreCase("Middle Name");
           return result;
        }catch(Exception e)
        {
            return false;
        }
    }
    public boolean verifyGenderText()
    {
        try{

            boolean result = genderText.getText().equalsIgnoreCase("Gender ");
            return result;
        }
        catch (Exception e)
        {return false;}
    }
    public boolean verifyLanguageKnownText() {
        try {
                       boolean result = languageKnownsText.getText().equalsIgnoreCase("Languages Known");
            return result;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean verifyMaleText()
    {
        try{
            System.out.println("male rext"+maleText.getText());
           boolean result =maleText.getText().equalsIgnoreCase("Male  ");
            System.out.println(result);
            return result;
        }catch (Exception e)
        {return false;}
    }
    public boolean verifyFemaleText()
    {
        try {
            boolean result = femaleText.getText().equalsIgnoreCase("Female");
            return result;
        }catch (Exception e){
            return false;
        }
    }
    public boolean verifyEnglishText()
    {
        try{
            System.out.println(englishText.getText());
            boolean result =englishText.getText().equalsIgnoreCase("English  ");
            System.out.println(result);
            return result;
        }catch(Exception e)
        {return false;}
    }
    public boolean verifyHindiText()
    {
        try{

            boolean result =hindiText.getText().equalsIgnoreCase("Hindi");
            return result;
        }catch(Exception e)
        {return false;}
    }
}