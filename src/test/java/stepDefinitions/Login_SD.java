package stepDefinitions;
import com.app.pages.BasePage;
import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ConfigReader;

import java.util.Properties;

public class Login_SD {
    WebDriver driver;
    LoginPage lp;
    HomePage hp;
    Properties prop = ConfigReader.initializeProperties();

    @Given("user is in the login screen")
    public void user_is_in_the_login_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is in the login screen");
        driver = DriverFactory.getDriver();
        String title = driver.getTitle();
        System.out.println("TITLE " + title);
        Assert.assertEquals(title, "Your store. Login");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        lp = new LoginPage(driver);
        lp.enterUserName(prop.getProperty("user"));
        lp.enterPassword(prop.getProperty("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        lp.clickLoginButton();
    }
    @Then("user will be on the Homepage screen")
    public void user_will_be_on_the_homepage_screen() {
        // Write code here that turns the phrase above into concrete actions
        hp = new HomePage(driver);
        System.out.println("user will be on the Homepage screen");
        Assert.assertTrue(hp.validateDashboard());
    }
}
