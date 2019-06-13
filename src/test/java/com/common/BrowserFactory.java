package com.common;

import org.openqa.selenium.WebDriver;


public enum BrowserFactory {

     INSTANCE;

    public WebDriver getWebDriver(){
        DriverFactory driverFactory = new DriverFactory();
        return driverFactory.getDriver();
    }
}
