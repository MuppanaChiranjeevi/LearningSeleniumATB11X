package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab12_SeleniumQuitVSClose {

    @Test
    public  void test_Quit_VS_Close() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://jsonpathfinder.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://jsonpathfinder.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        Thread.sleep(5000);
        driver.close();  //closes the current window
//        driver.quit();   //closes the current session
    }

}
