package com.thetestingacademy.Ex04_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab24_Selenium_Input_Checkbox_Radio {
    @Test
    public void testcase1(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("profession-0")).click();
    }
}
