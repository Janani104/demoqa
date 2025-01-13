package com.qa.janani.commonutils.Pojo;

import org.openqa.selenium.By;

public class AddTocartPojo {

    public static final By ADDTOCART = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final By ADDTOCART2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final By cart = By.xpath("//div[@id='shopping_cart_container']");
    public static final By titlecart = By.xpath("//span[contains(text(),'Your Cart')]");
    public static final By btncontinue = By.xpath("//button[@id='continue-shopping']");
    public static final By ADDTOCART3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final By btnCheckout = By.xpath("//button[@id='checkout']");
    public static final By btnOrder = By.xpath("//button[@id='finish']");
    public static final By btnorderpage = By.xpath("//input[@id='continue']");
    public static final By response = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    

 
    private By fname = By.xpath("//input[@id='first-name']");
    private By sname = By.xpath("//input[@id='last-name']");
    private By postalName = By.xpath("//input[@id='postal-code']");

   //Back
   
   public static final By cancelbtn = By.xpath("//button[@id='cancel']");
   public static final By Logoutmenu = By.xpath("//button[@id='react-burger-menu-btn']");
    public static final By logoutbtn = By.xpath("//a[@id='logout_sidebar_link']");
    
    //reset
    public static final By resetbtn = By.xpath("//a[@id='reset_sidebar_link']");

    
        // Getter for fname
        public By getFname() {
            return fname;
        }
    
        // Setter for fname
        public void setFname(By fname) {
            this.fname = fname;
        }
    
        // Getter for sname
        public By getSname() {
            return sname;
        }
    
        // Setter for sname
        public void setSname(By sname) {
            this.sname = sname;
        }
    
        // Getter for postalName
        public By getPostalName() {
            return postalName;
        }
    
        // Setter for postalName
        public void setPostalName(By postalName) {
            this.postalName = postalName;
        }
    }
    

    

    

