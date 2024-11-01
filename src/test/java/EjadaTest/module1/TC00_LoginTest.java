package EjadaTest.module1;
import EjadaPages.module1.P00_LoginPage;
import EjadaTest.TestBase;
import data.DataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.io.IOException;

public class TC00_LoginTest extends TestBase {

    public P00_LoginPage loginPage;

    @Test(description = "User Can Not Login")
    public void loginWithInvalidData() throws InterruptedException, IOException, ParseException {
        DataReader dataReader = new DataReader();
        dataReader.Reader1();

        loginPage = new P00_LoginPage(driver);
        loginPage.userLogin(dataReader.UserName,dataReader.Password);
    }
}
