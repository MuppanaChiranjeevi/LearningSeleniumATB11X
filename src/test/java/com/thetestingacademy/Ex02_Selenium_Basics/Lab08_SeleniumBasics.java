package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Lab08_SeleniumBasics {
    @Test
    public void test_Assertions(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        //TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        // AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://app.vwo.com/#/login");

        driver.quit();
    }
}
