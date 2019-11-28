package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenProductsRepo {
    WebDriver driver2;

    public WomenProductsRepo(WebDriver driver2) {
        this.driver2 = driver2;
        PageFactory.initElements(driver2, this);

    }

    @FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
    WebElement shortSleevTShirt;


    @FindBy(xpath = "//div[@class='button-container']/a[@data-id-product='1']")
    WebElement addtoCartButton;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement proceedToCheckOut;


    public void orderShortSleevtShirt()
    {
        Actions builder = new Actions(driver2);
        builder.moveToElement(shortSleevTShirt).moveToElement(addtoCartButton).click().build().perform();
        proceedToCheckOut.click();
    }



}
