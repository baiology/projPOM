package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriverWait wait;

    public static void clickElement(WebDriver driver, WebElement element) {
        waitforElementVisibility(driver, element);
        element.click();
    }
    public static void waitforElementVisibility(WebDriver driver, WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void sendKeys(WebDriver driver, WebElement element, String input) {
        waitforElementVisibility(driver, element);
        element.sendKeys(input);
    }
}
