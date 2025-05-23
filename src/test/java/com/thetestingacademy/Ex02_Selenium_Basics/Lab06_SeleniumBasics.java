package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab06_SeleniumBasics {
    /*
    Important Commands

1. getTitle() - titles
2. getCurrentURL() - current url page
3. getPageSource - source code(html) - text / html

     */
    @Test
    public void test_Commands(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource()); // it gives full html file

        driver.quit();
    }
}
