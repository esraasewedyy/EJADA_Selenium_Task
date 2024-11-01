package EjadaPages.module2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P05_OverviewPage {

    public WebDriver driver;


    public P05_OverviewPage(WebDriver driver){
        this.driver=driver;
    }



    private final By  headertitle = By.xpath("//span[@class='title']");
    private final By  finishbutton = By.id("finish");



    public P06_CompletePage itemTotals(){


        WebElement header = driver.findElement(headertitle);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBePresentInElement(header,"Checkout: Overview"));


        Assert.assertEquals(header.getText(),"Checkout: Overview" );



        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.saucedemo.com/checkout-step-two.html" );

        driver.findElement(finishbutton).click();

        return new P06_CompletePage(driver);

    }
}
