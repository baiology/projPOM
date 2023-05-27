package com.app.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    // Object Repositories

    @FindBy(id="Email")
    WebElement username;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath="//button[@class='button-1 login-button']")
    WebElement login_button;

    //initialize the objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String un, String pwd) {
        waitforElementVisibility(username);
        username.clear();
        username.sendKeys(prop.getProperty("user"));
        waitforElementVisibility(password);
        password.clear();
        password.sendKeys(prop.getProperty("password"));
        waitforElementVisibility(login_button);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", login_button);
    }

    public String verifyLoginTitle() {
        String title = driver.getTitle();
        return title;
    }

}
