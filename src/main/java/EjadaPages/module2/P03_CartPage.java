package EjadaPages.module2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_CartPage {

    public WebDriver driver;


    public P03_CartPage(WebDriver driver){
        this.driver=driver;
    }


    private final By headername = By.xpath("//span[@class='title']");
    private final By checkoutButton = By.id("checkout");



    public P04_CheckoutPage navigateToCheckout(){


        WebElement header = driver.findElement(headername);
        Assert.assertEquals(header.getText(),"Your Cart" );


        driver.findElement(checkoutButton).click();

        return new P04_CheckoutPage(driver);

    }
}
