package com.thetestingacademy.Ex02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab11_SeleniumNoHttp {
    @Test
    public void test_http(){

        EdgeDriver driver = new EdgeDriver();
//        driver.get("google.com"); // No HTTPS.
        driver.get("https://google.com"); // HTTPs is important.

        driver.quit();

    }
}
