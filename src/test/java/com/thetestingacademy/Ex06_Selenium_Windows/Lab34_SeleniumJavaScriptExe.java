package com.thetestingacademy.Ex06_Selenium_Windows;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Lab34_SeleniumJavaScriptExe extends CommonToAll {
    @Test
    public void test_js(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");
        js.executeScript("window.location = 'https://selectorshub.com/xpath-practice-page/'");
        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollBy(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

    }
}
