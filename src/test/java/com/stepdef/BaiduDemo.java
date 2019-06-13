package com.stepdef;

import com.common.BrowserFactory;
import com.pages.HomePage;
import com.pages.SearchPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.lang.Thread;


public class BaiduDemo extends com.stepdef.BaseSteps {

    @Before
    public void setUp() {
        webDriver = BrowserFactory.INSTANCE.getWebDriver();
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        searchPage = PageFactory.initElements(webDriver, SearchPage.class);
    }

    @After
    public void tearDown(){
        webDriver.close();
    }

    @Given("^I navigate to the home page$")
    public void I_navigate_to_the_home_page() throws Throwable {
        homePage.go();


    }

    @Given("^I search \"([^\"]*)\"$")
    public void i_search(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.search(arg1);

    }

     @Then("^see the \"([^\"]*)\" on the search page$")
         public void see_the_on_the_search_page(String arg1) throws Throwable {
           // Write code here that turns the phrase above into concrete actions
         searchPage.assertSeleniumPresent(arg1);
     }




}