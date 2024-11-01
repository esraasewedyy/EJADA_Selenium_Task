package EjadaPages.module2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P04_CheckoutPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public P04_CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By headertitle = By.xpath("//span[@class='title']");
    private final By fnamefield = By.id("first-name");
    private final By lnamefield = By.id("last-name");
    private final By postalcode = By.id("postal-code");
    private final By continuebutton = By.id("continue");

    // method for check header and Fill all the displayed form (first name , last name , zip code)
    public P05_OverviewPage fillform(String FirstName, String LastName ,String Zip){

        // store header title in header
        WebElement header = driver.findElement(headertitle);

        // wait to locate Dom page until header page present with Checkout: Your Information
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBePresentInElement(header,"Checkout: Your Information"));

        // to verify that you have been navigated to the “Checkout” page
        Assert.assertEquals(header.getText(),"Checkout: Your Information" );

        // to fill form with data
        driver.findElement(fnamefield).sendKeys(FirstName);
        driver.findElement(lnamefield).sendKeys(LastName);
        driver.findElement(postalcode).sendKeys(Zip);
        driver.findElement(continuebutton).click();

        return new P05_OverviewPage(driver);

    }
}
