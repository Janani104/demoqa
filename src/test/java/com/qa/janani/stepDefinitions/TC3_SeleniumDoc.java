package com.qa.janani.stepDefinitions;



import com.qa.janani.commonutils.Pojo.DocumentPojo;
import com.qa.janani.commonutils.Pojo.SauceLoginPojo;
import com.qa.janani.commonutils.baseclass.BaseClass;


import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;


public class TC3_SeleniumDoc extends BaseClass {

    SauceLoginPojo loginPojo = new SauceLoginPojo();
     
    @Given("I am on the Sauce login page")
public void i_am_on_the_sauce_login_page() {
     launchbrowser();
     launchURL("https://www.saucedemo.com/");
    maximize();
}
@When("I login with username {string} and password {string}")
public void i_login_with_username_and_password(String username, String password) {
    driver.findElement(loginPojo.getName()).sendKeys(username);
    driver.findElement(loginPojo.getPass()).sendKeys(password);
    driver.findElement(SauceLoginPojo.submit).click();
}
@When("I choose {string} from the menu")
public void i_choose_from_the_menu(String string) {
    driver.findElement(DocumentPojo.menu).click();
    clickWhenReady(DocumentPojo.slidebar,10);
    quit();

}
}