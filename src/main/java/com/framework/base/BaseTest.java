package com.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
    }

    @AfterMethod
    public void teardown() {
        if(driver != null) {
            driver.quit();
        }
    }
    @BeforeMethod
    public void setup1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("Hi u reached here one more time from the setup");
    }
    @AfterMethod
    public void teardown1() {
        if(driver != null) {
            driver.quit();
        }
}
}
