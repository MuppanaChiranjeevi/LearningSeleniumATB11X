package com.thetestingacademy.Ex01_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Lab04_SeleniumBasics {
    /*
     -> SearchContext(I)
     -> WebDriver(I)
     -> RemoteWebDriver(C)
     -> ChromiumDriver(C)(ChromeDriver, EdgeDriver), FirefoxDriver, SafariDriver, InternetExplorerDriver, BraveBrowser ->Classes
     */
    @Test
    public void test01_diffBrowsers(){

        // SearchContext(I) --> WebDriver(I) --> RemoteWebDriver(C) --> ChromeDriver(C), EdgeDriver(C), FirefoxDriver(C), IEDriver(C)
        SearchContext driver1 = new EdgeDriver();
        SearchContext driver2 = new FirefoxDriver();
        WebDriver driver3 = new InternetExplorerDriver();
        WebDriver driver4 = new ChromeDriver();
        RemoteWebDriver driver5 = new ChromeDriver();
        ChromiumDriver  driver6 = new EdgeDriver();
        ChromeDriver  driver7 = new ChromeDriver();

        // Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver(); // 97% -
        driver = new FirefoxDriver(); // 97% -

        //We mostly use this
        WebDriver edriver = new EdgeDriver();
        edriver.get("https://app.vwo.com");

    }

}

