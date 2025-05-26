package com.thetestingacademy.Ex05_Selenium_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab26_SeleniumActionClass {
    @Test
    public void test_actions()  {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        Actions actions=new Actions(driver);
        WebElement firstname= driver.findElement(By.name("firstname"));
        WebElement lastname= driver.findElement(By.name("lastname"));
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"muppana").keyUp(Keys.SHIFT).build().perform();
        actions.moveToElement(lastname).click().keyDown(Keys.SHIFT).sendKeys("chiranjeevi").keyUp(Keys.SHIFT).build().perform();

        try{
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
