package com.thetestingacademy.Ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Lab14_SeleniumMiniProject {
    @Description("Add extension to browser")
    @Test
    public  void test_addExtension()  {

        EdgeOptions edgeOptions=new EdgeOptions();

        edgeOptions.addArguments("--window-size=1920,1080");

        edgeOptions.addArguments("--incognito");

        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/Ex02_Selenium_Basics/AdBlocker.crx"));

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc&ab_channel=TheTestingAcademy");

//        driver.manage().deleteAllCookies();   // use this if you want to delete cookies
//        driver.quit();

    }
}
