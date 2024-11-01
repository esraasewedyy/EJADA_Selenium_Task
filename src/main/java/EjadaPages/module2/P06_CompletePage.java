package EjadaPages.module2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P06_CompletePage {

    public WebDriver driver;


    public P06_CompletePage(WebDriver driver){
        this.driver=driver;
    }


    private final By headertitle = By.xpath("//span[@class='title']");
    private final By  firstmessage = By.xpath("//h2[@class='complete-header']");
    private final By  secondmessage = By.xpath("//div[@class='complete-text']");


    public void checkSuccessMessage(){


        WebElement header = driver.findElement(headertitle);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBePresentInElement(header,"Checkout: Complete!"));


        Assert.assertEquals(header.getText(),"Checkout: Complete!" );



        WebElement SuccessM = driver.findElement(firstmessage);
        Assert.assertEquals(SuccessM.getText(),"Thank you for your order!" );


        WebElement dispatchedM = driver.findElement(secondmessage);
        Assert.assertEquals(dispatchedM.getText(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!" );

    }
}
