package com.thetestingacademy.Ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Lab19_SeleniumXPathfunctions {
    @Test
    public void test_matchingtext(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com");
        WebElement Make_Appointment1 = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        Make_Appointment1.click();
        driver.navigate().back();
        WebElement Make_Appointment2 = driver.findElement(By.xpath("//a[normalize-space()='Make Appointment']"));
        Make_Appointment2.click();
        driver.navigate().back();
        WebElement Make_Appointment3 = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        Make_Appointment3.click();
        driver.navigate().back();
        WebElement Make_Appointment4 = driver.findElement(By.xpath("//a[contains(text(),'Make')]"));
        Make_Appointment4.click();
        driver.navigate().back();
        WebElement Make_Appointment5 = driver.findElement(By.xpath("//a[contains(text(),'App')]"));
        Make_Appointment5.click();

        driver.quit();



    }
}
