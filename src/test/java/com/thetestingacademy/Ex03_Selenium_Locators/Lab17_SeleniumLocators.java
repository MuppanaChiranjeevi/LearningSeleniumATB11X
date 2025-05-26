package com.thetestingacademy.Ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab17_SeleniumLocators {

    @Test
    public void test_verify_trail_errormsg() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email_input = driver.findElement(By.id("page-v1-step1-email"));
        email_input.sendKeys("abc.com");

        WebElement checkbox_policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");






    }
}
