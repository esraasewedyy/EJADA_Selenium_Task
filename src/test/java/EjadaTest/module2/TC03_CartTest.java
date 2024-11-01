package EjadaTest.module2;

import EjadaPages.module2.P01_LoginPage;
import EjadaPages.module2.P02_ProductPage;
import EjadaPages.module2.P03_CartPage;
import EjadaTest.TestBase;
import data.DataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC03_CartTest extends TestBase {

    public P01_LoginPage loginPage;
    public P02_ProductPage productPage;
    public P03_CartPage cartPage;

    @Test(description = "check the previously selected products are displayed at the page and navigate to checkout page")
    public void toCheckoutPage() throws InterruptedException, IOException, ParseException {

        DataReader dataReader = new DataReader();
        dataReader.Reader2();

        loginPage = new P01_LoginPage(driver);
        loginPage.userLogin(dataReader.UserName,dataReader.Password);

        productPage = new P02_ProductPage(driver);
        productPage.checkProduct();

        cartPage = new P03_CartPage(driver);
        cartPage.navigateToCheckout();

    }
}
