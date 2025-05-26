package com.thetestingacademy.Ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab09_SeleniumMiniProject1 {
    @Description("Katalon Appointment")
    @Test
    public void test(){
    WebDriver driver=new EdgeDriver();
    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
            System.out.println("Test Case Passed");
        }
        else {
            Assert.fail("CURA Healthcare Service text is not visible");
        }
        driver.quit();
    }
}
