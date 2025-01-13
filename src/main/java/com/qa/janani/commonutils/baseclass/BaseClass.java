package com.qa.janani.commonutils.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        public void printPageTitle() {
            // Get the current title of the page
            String pageTitle = driver.getTitle();
        
            // Print the title to the console
            System.out.println("Current Page Title: " + pageTitle);
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
    public void ScrollToElementAndClick(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Click the element
        element.click();
    }
    public void ScrollTUpElementAndClick(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element);

        // Click the element
        element.click();
    }
    public void waitForElementInvisibilityAndClick(By locator, int timeoutInSeconds) {
        // Wait for the element to become invisible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    
        // Once invisible, scroll to the element
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);  // Scroll to the element
    
        // Perform click action
        element.click();
    }
    
    public String getTextFromElement(By locator) {
        WebElement element = driver.findElement(locator);
        String text = element.getText();
        
        // Print the text to the console
        System.out.println("Text from element: " + text);
        
        return text;
    }
    
    


public void takeScreenshot(WebDriver driver) {
    // Take screenshot
    TakesScreenshot screenshot = (TakesScreenshot) driver;
    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

    // Generate a unique file name with timestamp
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    File screenshotFolder = new File("C:\\Demo\\demoqa\\target\\screenshots");

    // Create the folder if it doesn't exist
    if (!screenshotFolder.exists()) {
        screenshotFolder.mkdirs();
    }

    // Define the destination screenshot file
    File screenshotFile = new File(screenshotFolder, "screenshot_" + timestamp + ".png");

    // Copy the screenshot file using FileInputStream and FileOutputStream
    try (FileInputStream fis = new FileInputStream(sourceFile);
         FileOutputStream fos = new FileOutputStream(screenshotFile)) {

        byte[] buffer = new byte[1024];
        int bytesRead;

        // Copy the content from the source to the destination
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("Screenshot saved at: " + screenshotFile.getAbsolutePath());
    } catch (IOException e) {
        System.out.println("Failed to save screenshot: " + e.getMessage());
    }
}

    
    
    }
    
    
    

