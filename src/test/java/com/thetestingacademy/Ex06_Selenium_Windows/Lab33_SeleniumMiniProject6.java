package com.thetestingacademy.Ex06_Selenium_Windows;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Lab33_SeleniumMiniProject6 extends CommonToAll {
    @Test
    public void test_project() throws InterruptedException {
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Variation 1']")));

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent: "+parentWindowHandle);
        List<WebElement> list_heatmaps = driver.findElements(By.xpath("//div[@data-qa='yedexafobi']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        Thread.sleep(15000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for(String windowHandle: allWindowHandles){
            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.switchTo().frame("heatmap-iframe");
                driver.findElement(By.xpath("//span[@data-qa='refoyekife']")).click();

            }

        }




    }

}
