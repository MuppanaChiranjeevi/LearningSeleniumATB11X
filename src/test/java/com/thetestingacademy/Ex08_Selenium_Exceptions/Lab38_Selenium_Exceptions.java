package com.thetestingacademy.Ex08_Selenium_Exceptions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab38_Selenium_Exceptions extends CommonToAll {
    @Test
    public  void test_exception(){
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        driver.navigate().refresh();
        try {
            search.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }

    }
}
