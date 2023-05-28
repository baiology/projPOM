package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

    @BeforeClass
    public void launchbrowser() {
        System.out.println("launch browser");
    }
    @BeforeMethod
    public void enterurl() {
        System.out.println("enter url");
    }
    @BeforeTest
    public void login() {
        System.out.println("login to app");
    }

    @Test
    public void validateTitle() {
        System.out.println("validate page title");
    }


}
