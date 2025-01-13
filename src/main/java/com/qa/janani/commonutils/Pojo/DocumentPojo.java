package com.qa.janani.commonutils.Pojo;

import org.openqa.selenium.By;

public class DocumentPojo {
     public static final By menu = By.xpath("//button[@id='react-burger-menu-btn']");
     public static final By slidebar = By.xpath("//a[@id='about_sidebar_link']");
     public static final By cookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    public static final By res = By.xpath("//span[text()='Resources by topic']");
    public static final By once = By.xpath("//img[@alt='Scroll down']");
     public static final By resourcetopic = By.xpath("//a[@href='/resources/topic-hub']//child::div[@class='MuiBox-root css-d416pa']");
     public static final By topicToautomation = By.xpath("(//div[@class='MuiStack-root css-rejsjb'])[1]");

     public static final By webautomation = By.xpath("//a[@href='https://docs.saucelabs.com/web-apps/']");

     public static final By automation = By.xpath("//a[text()='Automated Testing']");
     public static final By selenium = By.xpath("//a[text()='Using Selenium");
     public static final By submenu = By.xpath("//a[text()='Using Selenium']");
     public static final By doc = By.xpath("//h1[text()='Selenium on Sauce Labs']");


}
