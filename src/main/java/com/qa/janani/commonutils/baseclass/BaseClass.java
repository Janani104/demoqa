package com.qa.janani.commonutils.baseclass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    
        protected WebDriver driver;
    
      
    
        public void launchbrowser() {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        public void maximize(){   
    
            driver.manage().window().maximize();
         }
        
    
        public void launchURL(String url) {
            driver.get(url);
        }
    
        public void quit() {
            if (driver != null) {
                driver.quit();
            }
        }

        public void getTitle(String title){
            driver.getTitle();
        }
        
        public void clickWhenReady(By locator, int timeoutInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    // This method waits for an element to be visible
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // This method waits for an element to be clickable and then scrolls to it before clicking
    public void scrollToElementAndClick(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Click the element
        element.click();
    }
   
    
    }
    
    
    

