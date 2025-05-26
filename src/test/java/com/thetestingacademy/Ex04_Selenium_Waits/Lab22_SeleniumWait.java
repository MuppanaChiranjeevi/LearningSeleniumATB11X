package com.thetestingacademy.Ex04_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Lab22_SeleniumWait {
    @Test
    public void tc1(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-cy=\"closeModal\" ]")));

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        driver.quit();

    }
}
