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
            System.out.println("Hi Bro");
        }
    }
    public void teardown2() {
        if(driver != null) {
            driver.quit();
            System.out.println("Yaa Hi How are You?");
        }
        }
}
