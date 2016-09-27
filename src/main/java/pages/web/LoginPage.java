package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AParmar on 18-Aug-2016.
 */
public class LoginPage
{

    public LoginPage(WebDriver aDriver)
    {
        PageFactory.initElements(aDriver ,this);
    }

    @FindBy(id = "Email") private WebElement user_id;
    @FindBy(id = "next") private WebElement btn_next;
    @FindBy(id = "Passwd") private WebElement password;

    @FindBy(id = "signIn") private WebElement btn_sign;


    public void login()
    {
        user_id.sendKeys("MyID");
        //password.sendKeys("MyPassword");
        btn_next.click();
    }

}
