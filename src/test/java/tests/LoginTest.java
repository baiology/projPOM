package tests;

import com.app.pages.BasePage;
import com.app.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    LoginPage lp;
    public LoginTest() {
        super();
    }


    @Test(priority = 1)
    public void loginTitle() {
        System.out.println("login title");
//        String title = lp.verifyLoginTitle();
//        Assert.assertEquals("Your store. Login", title);
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("login");
//        lp.login(prop.getProperty("user"), prop.getProperty("password"));
    }
}
