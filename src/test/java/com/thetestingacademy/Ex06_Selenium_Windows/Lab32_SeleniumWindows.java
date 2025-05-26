package com.thetestingacademy.Ex06_Selenium_Windows;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab32_SeleniumWindows extends CommonToAll {
    @Test
    public void test_windows(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String parent = driver.getWindowHandle(); //unique id gets assigned
        System.out.println(parent); // F926C71E4B79805716092161FAA7BC1B

        WebElement Click_Here = driver.findElement(By.xpath("//a[text()='Click Here']"));
        Click_Here.click();
        Set<String> WindowHandles = driver.getWindowHandles();
        System.out.println(WindowHandles);

        driver.switchTo().window(parent);

        for (String WindowHandle : WindowHandles) {
            driver.switchTo().window(WindowHandle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test Case Passed!");
            }
        }


    }
}
