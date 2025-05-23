package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Lab13_SeleniumOptionClasses {
    @Test
    public  void test_OptionClasses() throws InterruptedException {

        ChromeOptions chromeOptions=new ChromeOptions();

//        chromeOptions.addArguments("--window-size=1080,720");
//        chromeOptions.addArguments("--window-size=300,600");

        chromeOptions.addArguments("--incognito");

        chromeOptions.addArguments("--start-maximized");
//        chromeOptions.addArguments("--start-minimized");

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        driver.quit();

    }
}
