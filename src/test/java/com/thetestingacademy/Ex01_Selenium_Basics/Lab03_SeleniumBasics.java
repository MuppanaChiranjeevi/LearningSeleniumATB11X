package com.thetestingacademy.Ex01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab03_SeleniumBasics {
    @Test
    public void test01_loginPage(){
        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/#/login");
        Assert.assertEquals(edgeDriver.getTitle(),"Login - VWO");
        edgeDriver.quit(); // Close the session!

    }

}
