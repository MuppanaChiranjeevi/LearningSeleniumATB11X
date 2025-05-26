package com.thetestingacademy.Ex07_Selenium_RelativeLocators;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab37_Selenium_RL extends CommonToAll {
    @Test
    public void test_RL(){
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();
        WebElement username_input = driver.findElement(By.xpath("//input[@id=\"username\"]"));

        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_input));
        String error_msg = error_element.getText();
        System.out.println(error_msg);
        Assert.assertEquals(error_msg,"Username must be at least 3 characters");

        error_element = driver.findElement(with(By.tagName("small")).below(error_element));
        error_msg = error_element.getText();
        System.out.println(error_msg);
        Assert.assertEquals(error_msg,"Email is not invalid");

        error_element = driver.findElement(with(By.tagName("small")).below(error_element));
        error_msg = error_element.getText();
        System.out.println(error_msg);
        Assert.assertEquals(error_msg,"Password must be at least 6 characters");
    }
}
