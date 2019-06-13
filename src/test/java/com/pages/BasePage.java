package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {

    protected WebDriver webDriver;

    protected static final String URL = "https://www.baidu.com";

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }



}

