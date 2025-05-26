package com.thetestingacademy.Ex05_Selenium_Actions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab29_SeleniumDragDrop extends CommonToAll {
    @Test
    public void test_drag_drop(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        Actions actions= new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();
    }
}
