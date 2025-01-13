package com.qa.janani.stepDefinitions;

import com.qa.janani.commonutils.Pojo.AddTocartPojo;
import com.qa.janani.commonutils.Pojo.SauceLoginPojo;
import com.qa.janani.commonutils.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SauceLabsLogin extends BaseClass {
    SauceLoginPojo loginPojo = new SauceLoginPojo();
    AddTocartPojo addTocartPojo = new AddTocartPojo();


@Given("the user is on the Home page")
public void the_user_is_on_the_home_page() {
    launchbrowser();
    launchURL("https://www.saucedemo.com/");
    maximize();

}

@When("the user enters the {string} and {string}")
public void the_user_enters_the_and(String username, String password) {
   
    driver.findElement(loginPojo.getName()).sendKeys(username);
    driver.findElement(loginPojo.getPass()).sendKeys(password);
}
@Then("the user clicks the login button")
public void the_user_clicks_the_login_button() {
    driver.findElement(SauceLoginPojo.submit).click();
    
}
@Then("the user navigates to the product page")
public void the_user_navigates_to_the_product_page() {
    
    String msg =driver.getTitle();
    System.out.println(msg);

    
}

@When("the user enters invalid the {string} and {string}")
public void the_user_enters_invalid_the_and(String username, String password) {
    driver.findElement(loginPojo.getName()).sendKeys(username);
    driver.findElement(loginPojo.getPass()).sendKeys(password);
}
@Then("the user should see an error message")
public void the_user_should_see_an_error_message() {
    // waitForElementToBeVisible(SauceLoginPojo.error_msg, 10);
    // getTextFromElement(SauceLoginPojo.error_msg);
}


@When("the user selects a product from the product list")
public void the_user_selects_a_product_from_the_product_list() {
    driver.findElement(AddTocartPojo.ADDTOCART).click();
    driver.findElement(AddTocartPojo.ADDTOCART2).click();
}
@When("the user clicks on {string}")
public void the_user_clicks_on(String string) {
    driver.findElement(AddTocartPojo.cart).click();
}
@Then("the product should be added to the cart")
public void the_product_should_be_added_to_the_cart() {
    
    getTextFromElement(AddTocartPojo.titlecart);
    
}
@Then("the user navigates to the cart page")
public void the_user_navigates_to_the_cart_page() {
    
}
@When("the user clicks {string} to continue shopping")
public void the_user_clicks_to_continue_shopping(String string) {
    driver.findElement(AddTocartPojo.btncontinue).click();
    
}
@When("the user selects another product from the product list")
public void the_user_selects_another_product_from_the_product_list() {
    
    ScrollToElementAndClick(AddTocartPojo.ADDTOCART3, 30);
}
@Then("the second product should be added to the cart")
public void the_second_product_should_be_added_to_the_cart() {
    ScrollTUpElementAndClick(AddTocartPojo.cart, 30);
    
}
@Then("the user checkout the product")
public void the_user_checkout_the_product() {
    ScrollTUpElementAndClick(AddTocartPojo.btnCheckout, 20);
}
@When("the user fillup the details {string},{string},{string}")
public void the_user_fillup_the_details(String firstname, String LastName, String Postalcode) {
    
    driver.findElement(addTocartPojo.getFname()).sendKeys(firstname);
    driver.findElement(addTocartPojo.getSname()).sendKeys(LastName);
    driver.findElement(addTocartPojo.getPostalName()).sendKeys(Postalcode);

    }
    @Then("the user order confirmed")
    public void the_user_order_confirmed() {
        driver.findElement(AddTocartPojo.btnorderpage).click();
       
    }
    @Then("the validate the order confirmation")
    public void the_validate_the_order_confirmation() {
        ScrollToElementAndClick(AddTocartPojo.btnOrder, 30);
        getTextFromElement(AddTocartPojo.response);
        quit();
    }
    
}