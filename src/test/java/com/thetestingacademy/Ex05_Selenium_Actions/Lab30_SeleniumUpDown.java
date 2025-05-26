package com.thetestingacademy.Ex05_Selenium_Actions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab30_SeleniumUpDown extends CommonToAll {
    @Test
    public void test_page_up_page_down() throws InterruptedException {
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).build().perform();

    }
}
