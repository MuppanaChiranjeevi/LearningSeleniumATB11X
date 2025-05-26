package com.thetestingacademy.Ex07_Selenium_RelativeLocators;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab36_Selenium_RL extends CommonToAll {

    @Test
    public void test_allRL(){
        driver.get("https://awesomeqa.com/practice.html");
        WebElement YOE = driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement(with(By.id("exp-1")).toRightOf(YOE)).click();
        waitForJVM(1000);
        driver.findElement(with(By.id("exp-2")).toRightOf(YOE)).click();
        waitForJVM(1000);
        driver.findElement(with(By.id("exp-5")).toRightOf(YOE)).click();
        waitForJVM(1000);
        driver.findElement(with(By.id("sex-1")).above(YOE)).click();
        waitForJVM(1000);
        driver.findElement(with(By.id("sex-0")).above(YOE)).click();
        waitForJVM(1000);
        driver.findElement(with(By.id("datepicker")).below(YOE)).sendKeys("09/06/2000");
        waitForJVM(1000);
        driver.findElement(with(By.id("profession-0")).below(YOE)).click();

    }
}
