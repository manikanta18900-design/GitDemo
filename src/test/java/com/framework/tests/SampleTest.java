package com.framework.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.framework.base.BaseTest;

public class SampleTest extends BaseTest {

    @Test
    public void testExample() {
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Mani");
        System.out.println("Test executed successfully1!");
        System.out.println("Test executed successfully2!");
        System.out.println("Test executed successfully3!"); 
        
        System.out.println("Test executed successfully3.1!");     
        System.out.println("Test executed successfully3.2!"); 
        System.out.println("Test executed successfully3.3!"); 
        
        System.out.println("Test executed successfully happened no need to worry!"); 
        System.out.println("Test executed successfully3ok thank you!"); 
    }
}
