package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class hooks {
    public WebDriver driver;
    public Properties prop = DriverFactory.getProp();
    @Before
    public void setup() {
        DriverFactory.initializeBrowser(prop.getProperty("browser"));
        driver = DriverFactory.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
        System.out.println("URL: " + prop.getProperty("url"));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
