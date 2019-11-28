package pages;

import Helpers.HelperClass;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class RegistrationPageRepo {
    WebDriver driver2;
    Faker faker;
    HelperClass helpOBJ;


    public RegistrationPageRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);
        faker = new Faker();
        helpOBJ = new HelperClass();
    }

    @FindBy(id = "uniform-id_gender1")
    WebElement MRradiobutton;
    @FindBy(id = "uniform-id_gender2")
    WebElement MRSradiobutton;
    @FindBy(id = "customer_firstname")
    WebElement firstNameInputBox;
    @FindBy(id = "customer_lastname")
    WebElement lastNameInputBox;
    @FindBy(id = "email")
    WebElement emailnputBox;
    @FindBy(id = "passwd")
    WebElement passwordInputBox;
    @FindBy(id = "days")
    WebElement daysDropdown;
    @FindBy(id = "months")
    WebElement monthDropdown;
    @FindBy(id = "years")
    WebElement yearDropdown;
    @FindBy(id = "newsletter")
    WebElement newsletterCheckBox;
    @FindBy(id = "optin")
    WebElement optinCheckBox;
    @FindBy(id = "firstname")
    WebElement firstnameInputBox;
    @FindBy(id = "lastname")
    WebElement lastnamelastnameInputBox;
    @FindBy(id = "company")
    WebElement companyInputBox;
    @FindBy(id = "address1")
    WebElement addressInputBox;
    @FindBy(id = "address2")
    WebElement addressInputBox2;
    @FindBy(id = "city")
    WebElement cityInputBox;
    @FindBy(id = "id_state")
    WebElement stateDropdown;
    @FindBy(id = "postcode")
    WebElement postcodeInputBox;
    @FindBy(id = "id_country")
    WebElement countryDropdown;
    @FindBy(id = "other")
    WebElement additionalInfo;
    @FindBy(id = "phone")
    WebElement homePhoneInputBox;
    @FindBy(id = "phone_mobile")
    WebElement phoneMobile;
    @FindBy(id = "alias")
    WebElement addressAlias;
    @FindBy(id = "submitAccount")
    WebElement submitButton;
    @FindBy(xpath = "//ol/li/b[text()]")
    WebElement ErrorMSgforOneError;



    static String firstName;
    String lastName;
    String companyName;
    String address1;
    String address2;
    String city;
    String postcode;
    String homePhoneNumber;
    String mobileNumber;
    String password;

    //-----------Methodds----------------------------------------------------
    public boolean fillRegistratinForm() {
        firstName = faker.name().firstName();
        System.out.println(firstName + "000000000000000");
        lastName = faker.name().lastName();
        companyName = faker.company().name();
        address1 = faker.address().fullAddress();
        address2 = faker.address().secondaryAddress();
        city = faker.address().city();
        postcode = faker.address().zipCode();
        homePhoneNumber = faker.phoneNumber().cellPhone();
        mobileNumber = faker.phoneNumber().phoneNumber();
        password = "Bhushan123";


        MRradiobutton.click();
        firstNameInputBox.sendKeys(firstName);
        lastNameInputBox.sendKeys(lastName);
        passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
        newsletterCheckBox.click();
        optinCheckBox.click();
        companyInputBox.sendKeys(companyName);
        addressInputBox.sendKeys(address1);
        addressInputBox2.sendKeys(address2);
        cityInputBox.sendKeys(city);
        helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
        postcodeInputBox.sendKeys("00000");
        helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
        additionalInfo.sendKeys("Hello");
        homePhoneInputBox.sendKeys(homePhoneNumber);
        phoneMobile.sendKeys("8805579558");
        addressAlias.sendKeys("address1");

        return true;

    }

    public boolean verifydataFirstName() {
        try {

            System.out.println(firstNameInputBox.getAttribute("value") + " = " + firstName);
            boolean result = firstNameInputBox.getAttribute("value").contains(firstName);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifydataLastName() {
        try {
            Assert.assertTrue(lastnamelastnameInputBox.getAttribute("value").contains(lastName));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checklandingOnMyAccountPage() {
        try {
            submitButton.click();
            boolean result = driver2.getTitle().equalsIgnoreCase("My account - My Store");
            System.out.println(driver2.getTitle().equalsIgnoreCase("My account - My Store"));
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean registerwithoutFirstName()
    {
        try {


            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.clear();
//            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }

    public boolean registerwithoutLastName()
    {
        try {

            firstName = faker.name().firstName();

//            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.clear();
//            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();
            System.out.println(result);
            return result;
        }catch (Exception e)
        {
            return false;
        }
    }

    public boolean registerwithoutPassword()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.clear();
//            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }
    public boolean registerwithoutAddress()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.clear();
//            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }
    public boolean registerwithoutCity()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.clear();
//            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }
    public boolean registerwithoutState()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
//            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }
    public boolean registerwithoutZipCode()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.clear();
//            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }
    public boolean registerwithoutMobilePhone()
    {
        try {

            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            companyName = faker.company().name();
            address1 = faker.address().fullAddress();
            address2 = faker.address().secondaryAddress();
            city = faker.address().city();
            postcode = faker.address().zipCode();
            homePhoneNumber = faker.phoneNumber().cellPhone();
            mobileNumber = faker.phoneNumber().phoneNumber();
            password = "Bhushan123";


            MRradiobutton.click();
            firstNameInputBox.sendKeys(firstName);
            lastNameInputBox.sendKeys(lastName);
            passwordInputBox.sendKeys(password);
//        helpOBJ.selectByPartOfVisibleTextMethod1(daysDropdown,"10");
//        helpOBJ.selectByPartOfVisibleTextMethod1(monthDropdown,"January");
//        helpOBJ.selectByPartOfVisibleTextMethod1(yearDropdown,"1994");
            newsletterCheckBox.click();
            optinCheckBox.click();
            companyInputBox.sendKeys(companyName);
            addressInputBox.sendKeys(address1);
            addressInputBox2.sendKeys(address2);
            cityInputBox.sendKeys(city);
            helpOBJ.selectByPartOfVisibleTextMethod1(stateDropdown, "California");
            postcodeInputBox.sendKeys("00000");
            helpOBJ.selectByPartOfVisibleTextMethod1(countryDropdown, "United States");
            additionalInfo.sendKeys("Hello");
            homePhoneInputBox.sendKeys(homePhoneNumber);
            phoneMobile.clear();
//            phoneMobile.sendKeys("8805579558");
            addressAlias.sendKeys("address1");
            submitButton.click();
            boolean result = ErrorMSgforOneError.isDisplayed();

            return result;
        }catch (Exception e)
        {
            return false;
        }
    }

}
