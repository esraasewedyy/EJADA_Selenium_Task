package EjadaTest.module2;
import EjadaPages.module2.*;
import EjadaTest.TestBase;
import data.DataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC06_CompleteTest extends TestBase {

    public P01_LoginPage loginPage;
    public P02_ProductPage productPage;
    public P03_CartPage cartPage;
    public P04_CheckoutPage checkoutPage;
    public P05_OverviewPage overviewPage;
    public P06_CompletePage completePage;

    @Test(description = "check the success message and Your order has been dispatched message")
    public void checkItems() throws InterruptedException, IOException, ParseException {

        DataReader dataReader = new DataReader();
        dataReader.Reader2();

        loginPage = new P01_LoginPage(driver);
        loginPage.userLogin(dataReader.UserName,dataReader.Password);

        productPage = new P02_ProductPage(driver);
        productPage.checkProduct();

        cartPage = new P03_CartPage(driver);
        cartPage.navigateToCheckout();

        checkoutPage = new P04_CheckoutPage(driver);
        checkoutPage.fillform("Youssef","Elshemy","315125");

        overviewPage = new P05_OverviewPage(driver);
        overviewPage.itemTotals();

        completePage = new P06_CompletePage(driver);
        completePage.checkSuccessMessage();

    }

}
