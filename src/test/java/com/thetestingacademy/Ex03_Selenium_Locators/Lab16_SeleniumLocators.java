package com.thetestingacademy.Ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Lab16_SeleniumLocators {
    @Test
    public void test_LinkText_Partial_Text_TagName(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        LinkText, PartialLink -> only works with <a></a> -> anchor Tag
//        <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
//        class="text-link" data-qa="bericafeqo">Start a free trial</a>
//        If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}

//        WebElement fullmatch_linktext = driver.findElement(By.linkText("Start a free trial"));
//        fullmatch_linktext.click();

        WebElement partialmatch_partiallinktext = driver.findElement(By.partialLinkText("Start a fre"));
        partialmatch_partiallinktext.click();

        driver.quit();

    }
}
