import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.web.LoginPage;

/**
 * Created by AParmar on 18-Aug-2016.
 */
public class TestLogin
{

    public static WebDriver driver;

    @BeforeTest
    void initialized()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://www.hostgator.in/login.php");
        driver.get("https://mail.google.com/mail/");
    }

    @AfterTest
    void tearDown()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    void Login()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }

}
