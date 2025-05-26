package com.thetestingacademy.Ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Lab20_SeleniumXPathfunctions {
    @Test
    public void test_matchingtext(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com");
        WebElement Make_Appointment1 = driver.findElement(By.xpath("//a[contains(@id,'btn-make-appointment')]"));
        Make_Appointment1.click();
        driver.navigate().back();
        WebElement Make_Appointment2 = driver.findElement(By.xpath("//a[contains(@href,'./profile.php#login')]"));
        Make_Appointment2.click();
        driver.navigate().back();
        WebElement Make_Appointment0 = driver.findElement(By.xpath("//a[text()='Make Appointment' and contains(@id,'btn-make-appointment')]"));
        Make_Appointment0.click();
        driver.navigate().back();
        WebElement Make_Appointment3 = driver.findElement(By.xpath("//a[starts-with(text(),'Make')]"));
        Make_Appointment3.click();
        driver.navigate().back();
        WebElement Make_Appointment4 = driver.findElement(By.xpath("//a[substring(@id, 5, 4) = 'make']"));
        Make_Appointment4.click();
        driver.navigate().back();
        WebElement Make_Appointment5 = driver.findElement(By.xpath("//a[substring(text(), 3, 5) = 'ke Ap']"));
        Make_Appointment5.click();


        driver.quit();


    }
}
/*
#id	//*[@id="id"]
.class	//*[@class="class"]
input[type="submit"]	//input[@type="submit"]
a#abc[for="xyz"]	//a[@id="abc"][@for="xyz"]
a[rel]	//a[@rel]
a[href^='/']	//a[starts-with(@href, '/')]
a[href$='pdf']	//a[ends-with(@href, '.pdf')]
a[href*='://']	//a[contains(@href, '://')]

CSS selctor -> attribute=value -> img[title="Flipkart"]
contains -> attribute*=value -> img[title*="pka"]
starts-with -> attribute^=value -> img[title^="Flip"]
ends-with -> attribute$=value -> img[title$="kart"]


 */