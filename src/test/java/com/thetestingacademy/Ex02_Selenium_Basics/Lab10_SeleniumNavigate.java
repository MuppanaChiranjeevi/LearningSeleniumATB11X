package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab10_SeleniumNavigate {
    /*
    ## Navigation in Selenium
    1. get() -> there is not option to go back, go forward, refresh
    2. Methods in navigate():
    navigate().to(url): Loads a new page like get(), but it's part of the Navigation API.

    navigate().back(): Goes back to the previous page in the browser history.

    navigate().forward(): Moves forward to the next page in the browser history.

    navigate().refresh(): Refreshes the current page.

     */
    @Test
    public void test_navigation(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://example.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
