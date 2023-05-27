package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    // Object Repopsitories

    @FindBy(xpath="/html/body/div[3]/div[1]/div[1]/h1")
    WebElement dashboard;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}

