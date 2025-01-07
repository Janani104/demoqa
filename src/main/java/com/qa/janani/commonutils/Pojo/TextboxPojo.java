package com.qa.janani.commonutils.Pojo;

import org.openqa.selenium.By;


public class TextboxPojo {
 

    
    public static final By ELEMENT_CLICK = By.xpath("//h5[text()='Elements']");

    public static final By TextBox_Dropdown = By.xpath("//span[text()='Text Box']");
    
   
  
    
       
private By name = By.id("userName");
private By Email = By.id("userEmail");
private By curadd = By.id("currentAddress");
private By peradd = By.id("permanentAddress");
private By subbtn = By.id("submit");

public By getSubbtn() {
    return subbtn;
}

// Setter for subbtn
public void setSubbtn(By subbtn) {
    this.subbtn = subbtn;
}

// Getter and Setter for 'name'
public By getName() {
    return name;
}

public void setName(By name) {
    this.name = name;
}

// Getter and Setter for 'Email'
public By getEmail() {
    return Email;
}

public void setEmail(By email) {
    this.Email = email;
}

// Getter and Setter for 'curadd'
public By getCuradd() {
    return curadd;
}

public void setCuradd(By curadd) {
    this.curadd = curadd;
}

// Getter and Setter for 'peradd'
public By getPeradd() {
    return peradd;
}

public void setPeradd(By peradd) {
    this.peradd = peradd;
}

    
    

}
