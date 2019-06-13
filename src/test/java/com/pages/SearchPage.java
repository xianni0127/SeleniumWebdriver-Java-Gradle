package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.junit.Assert;
import java.lang.System;
public class SearchPage  extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    private String Get_search_result_value(){

        return Get_search_result().getAttribute("value");
    }


    public void assertSeleniumPresent(String item){
        Assert.assertEquals(Get_search_result_value(), item);
    }

// element
    private WebElement Get_search_result() {
        return webDriver.findElement(_search_result);
    }

//    locator
    private By _search_result = By.cssSelector(".quickdelete-wrap .s_ipt");
}
