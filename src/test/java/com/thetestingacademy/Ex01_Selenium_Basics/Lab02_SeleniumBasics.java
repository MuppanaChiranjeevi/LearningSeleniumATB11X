package com.thetestingacademy.Ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab02_SeleniumBasics {
    private WebDriver chromeDriver;

    @BeforeTest
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }

    @Test
    public void test01_VWOLoginPage() {
        chromeDriver.get("https://app.vwo.com");
        System.out.println(chromeDriver.getTitle());
    }

}
