package com.thetestingacademy.Ex08_Selenium_Exceptions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Lab37_Selenium_Exceptions extends CommonToAll {

    @Test
    public  void test_exception(){
        driver.get("https://app.vwo.com/");
        try {
            driver.findElement(By.id("chiranjeevi"));
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }
    }
}
