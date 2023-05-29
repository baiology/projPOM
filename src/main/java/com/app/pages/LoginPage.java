package com.app.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.app.pages.BasePage.*;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver ldriver) {
        driver = ldriver;
        PageFactory.initElements(driver, this);
    }

    // Object Repositories

    @FindBy(id="Email")
    WebElement username;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath="//button[@class='button-1 login-button']")
    WebElement login_button;

    //initialize the objects

    public void enterUserName(String un) {
        waitforElementVisibility(driver, username);
        username.clear();
        sendKeys(driver, username, un);
    }

    public void enterPassword(String pwd) {
        waitforElementVisibility(driver, password);
        password.clear();
        sendKeys(driver, password, pwd);
    }

    public void clickLoginButton() {
        waitforElementVisibility(driver, login_button);
//        clickElement(driver, login_button);
        JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", login_button);

    }
}
