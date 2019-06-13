package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

class DriverFactory {


   String browser = System.getProperty("browser");

   WebDriver getDriver(){

       if(browser==null){
           ChromeDriver driver = new ChromeDriver();

           ChromeOptions options = new ChromeOptions();
           options.addArguments("800,768");
           DesiredCapabilities capabilities = new DesiredCapabilities();
           capabilities.setCapability(ChromeOptions.CAPABILITY, options);
           return driver;
       }

      if(browser.equalsIgnoreCase(BrowserType.FIREFOX.name())){
          return new FirefoxDriver();
      }else if(browser.equalsIgnoreCase(BrowserType.CHROME.name())){
          return new ChromeDriver();
      } else {
          throw new RuntimeException(" Browser type not supported : " + browser);
      }

   }
}
