package EjadaPages.module2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class P01_LoginPage {

        public WebDriver driver;


        public P01_LoginPage(WebDriver driver){
            this.driver=driver;
        }


        private final By usernamefield = By.id("user-name");
        private final By passwordfield = By.id("password");
        private final By loginbutton = By.id("login-button");
        private final By titlename = By.xpath("//div[@class='app_logo']");



        public P02_ProductPage userLogin(String user,String pass) throws InterruptedException{


            driver.findElement(usernamefield).sendKeys(user);
            driver.findElement(passwordfield).sendKeys(pass);
            driver.findElement(loginbutton).click();



            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement header = driver.findElement(titlename);
            wait.until(ExpectedConditions.textToBePresentInElement(header,"Swag Labs"));


            Assert.assertEquals(header.getText(),"Swag Labs" );

            return new P02_ProductPage(driver);
        }
}
