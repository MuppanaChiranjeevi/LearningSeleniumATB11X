package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab07_SeleniumBasics {
    @Test
    public void test_max_min(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
//       driver.manage().window().maximize();
//        driver.manage().window().minimize();

        driver.quit();

    }

}
