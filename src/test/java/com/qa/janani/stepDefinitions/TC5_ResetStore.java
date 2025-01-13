package com.qa.janani.stepDefinitions;

import com.qa.janani.commonutils.Pojo.AddTocartPojo;
import com.qa.janani.commonutils.Pojo.SauceLoginPojo;
import com.qa.janani.commonutils.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ResetStore extends BaseClass {
    SauceLoginPojo loginPojo = new SauceLoginPojo();


@Given("user login the SaucePage")
public void user_login_the_sauce_page() {
    launchbrowser();
    launchURL("https://www.saucedemo.com/");
   maximize();
}
@When("user login with username {string} and password {string}")
public void user_login_with_username_and_password(String username, String password) {
    driver.findElement(loginPojo.getName()).sendKeys(username);
    driver.findElement(loginPojo.getPass()).sendKeys(password);
    driver.findElement(SauceLoginPojo.submit).click();
}


@Then("user select the Product and addtocart")
public void user_select_the_product_and_addtocart() {
    driver.findElement(AddTocartPojo.ADDTOCART).click();
    driver.findElement(AddTocartPojo.ADDTOCART2).click();
}

@Then("user add the product into the cart")
public void user_add_the_product_into_the_cart() {
    driver.findElement(AddTocartPojo.cart).click();

}
    
@Then("user select the menu {string}")
public void user_select_the_menu(String ResetAppStore) throws InterruptedException {
    driver.findElement(AddTocartPojo.Logoutmenu).click();
    Thread.sleep(3000);
    waitForElementToBeVisible(AddTocartPojo.resetbtn,30);
    driver.findElement(AddTocartPojo.resetbtn).click();


}
@Then("product should remove from the cart")
public void product_should_remove_from_the_cart() {
    driver.navigate().refresh();
     driver.findElement(AddTocartPojo.cart).click();
     takeScreenshot(driver);
    quit();

}
}