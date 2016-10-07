package Tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import Tests.GenLogs;
import pages.web.LoginPage;

/**
 * Created by AParmar on 18-Aug-2016.
 */
public class TestLogin
{

    public static WebDriver driver;
    public static Logger log;

    @BeforeSuite
    void initialized()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://www.hostgator.in/login.php");
        driver.get("https://mail.google.com/mail/");
        log = Logger.getLogger(this.getClass().getName());
        
    }

    @AfterMethod
	@AfterSuite
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
