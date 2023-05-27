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

    @BeforeMethod
    public void setup() {
        init();
        lp = new LoginPage();
    }


    @Test(priority = 1)
    public void loginTitle() {
        String title = lp.verifyLoginTitle();
        Assert.assertEquals("Your store. Login123", title);
    }

    @Test(priority = 2)
    public void login() {
        lp.login(prop.getProperty("user"), prop.getProperty("password"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
