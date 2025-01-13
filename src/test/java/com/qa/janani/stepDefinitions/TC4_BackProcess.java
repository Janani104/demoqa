package com.qa.janani.stepDefinitions;

import com.qa.janani.commonutils.Pojo.AddTocartPojo;
import com.qa.janani.commonutils.Pojo.SauceLoginPojo;
import com.qa.janani.commonutils.baseclass.BaseClass;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BackProcess extends BaseClass {
    SauceLoginPojo loginPojo = new SauceLoginPojo();
    

    @Given("user on the Sauce login page")
public void user_on_the_sauce_login_page() {
    launchbrowser();
     launchURL("https://www.saucedemo.com/");
    maximize();
}
@When("user login with visual username {string} and password {string}")
public void user_login_with_visual_username_and_password(String username, String password) {
    driver.findElement(loginPojo.getName()).sendKeys(username);
    driver.findElement(loginPojo.getPass()).sendKeys(password);
    driver.findElement(SauceLoginPojo.submit).click();

}
@Then("user select the product")
public void user_select_the_product() {
   driver.findElement(AddTocartPojo.ADDTOCART).click();
    driver.findElement(AddTocartPojo.ADDTOCART2).click();
    driver.findElement(AddTocartPojo.cart).click();
}
@Then("user remove the product")
public void user_remove_the_product() {
    ScrollTUpElementAndClick(AddTocartPojo.btnCheckout, 20);

}
@Then("user check the cart and proceed without any item")
public void user_check_the_cart_and_proceed_without_any_item() {
    driver.findElement(AddTocartPojo.cancelbtn).click();
}
@Then("user back to Home")
public void user_back_to_home() {
    driver.findElement(AddTocartPojo.Logoutmenu).click();
   
}
@Then("user logout the page")
public void user_logout_the_page() {
    waitForElementToBeVisible(AddTocartPojo.logoutbtn,40);
    //driver.findElement(AddTocartPojo.logoutbtn).click();
    
}
@Then("user should be on login page")
public void user_should_be_on_login_page() {
       printPageTitle();
       quit();
}

}
