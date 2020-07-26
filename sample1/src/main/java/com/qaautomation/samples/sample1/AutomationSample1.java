package com.qaautomation.samples.sample1;

//Web driver imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSample1 {
    public static void main(String[] args) {
        String baseUrl = "http://www.google.com/";
        String expectedTitle = "Google";
        String actualTitle = "";

        //Set the driver system property and initialise to Chrome driver
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        //Launch Chrome browser and open google.com
        driver.get(baseUrl);
        //Get the title
        actualTitle = driver.getTitle();
        
        //Compare the actual driver with the 
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //Close the browser
        driver.close();
    }
}