package com.thetestingacademy.Ex06_Selenium_Windows;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab35_SeleniumShadowDOM extends CommonToAll {
    @Test
    public void test_shadow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://selectorshub.com/xpath-practice-page/'");

        js.executeScript("window.scrollBy(0,1500);");
        waitForJVM(3000);

        WebElement pizzaname = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\");");
        pizzaname.sendKeys("Dominos");

    }
}
