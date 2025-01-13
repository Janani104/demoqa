package com.qa.janani.commonutils.Pojo;

import org.openqa.selenium.By;

public class SauceLoginPojo {
     
    public static final By Login_CLICK = By.xpath("//h5[text()='Elements']");

private By name = By.id("user-name");
private By pass = By.id("password");
public static final By submit = By.id("login-button");
 



    // Getter for name (username public static final By error_msg = By.xpath("//h3[@data-test='error']"); field)
    public By getName() {
        return name;
    }

    // Setter for name (username field)
    public void setName(By name) {
        this.name = name;
    }

    // Getter for pass (password field)
    public By getPass() {
        return pass;
    }

    // Setter for pass (password field)
    public void setPass(By pass) {
        this.pass = pass;
    }
}


