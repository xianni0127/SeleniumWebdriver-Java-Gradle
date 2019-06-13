package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    WebDriverWait wait = new WebDriverWait(webDriver, 20);

    public void go(){
        webDriver.get(BasePage.URL);


    }

    public void search (String searchitem){

        Get_search_input().sendKeys(searchitem);
        Get_search_button().click();
    }

    // element
    private WebElement Get_search_input (){
        return wait.until(ExpectedConditions.elementToBeClickable(_search_input));
    }

    private WebElement Get_search_button() {
        return wait.until(ExpectedConditions.elementToBeClickable(_search_button));
    }

//    locator
    private By _search_input = By.id("kw");
    private By _search_button =By.id("su");
}

