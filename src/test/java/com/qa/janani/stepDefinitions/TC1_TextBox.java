package com.qa.janani.stepDefinitions;



import com.qa.janani.commonutils.Pojo.TextboxPojo;
import com.qa.janani.commonutils.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_TextBox extends BaseClass{

    TextboxPojo textboxPojo = new TextboxPojo();

 @Given("the user is on the Home page")
public void the_user_is_on_the_home_page() {
    launchbrowser();
    launchURL("https://demoqa.com/");
    maximize();
    
}

@When("the user selects the Elements menu")
public void the_user_selects_the_elements_menu() {
     //driver.findElement(TextboxPojo.ELEMENT_CLICK).click();
     
     scrollToElementAndClick(TextboxPojo.ELEMENT_CLICK, 10);
  
   
}

@Then("the user clicks the TextBox")
public void the_user_clicks_the_text_box() {
    driver.findElement(TextboxPojo.TextBox_Dropdown).click();;
    

}
@Then("the user enters the values {string}, {string}, {string}, {string}")
public void the_user_enters_the_values(String Name, String Email, String CurrentAddress, String PerAddress) {
   

    // Find the web elements and enter the values using the parameters
    driver.findElement(textboxPojo.getName()).sendKeys(Name);
    driver.findElement(textboxPojo.getEmail()).sendKeys(Email);
    driver.findElement(textboxPojo.getCuradd()).sendKeys(CurrentAddress);
    driver.findElement(textboxPojo.getPeradd()).sendKeys(PerAddress);
}
@Then("user Sumbit the details")
public void user_sumbit_the_details() {
    driver.findElement(textboxPojo.getSubbtn()).click();
}
@Then("user Validate the outcome")
public void user_validate_the_outcome() {
    quit();
  
}


    
}
