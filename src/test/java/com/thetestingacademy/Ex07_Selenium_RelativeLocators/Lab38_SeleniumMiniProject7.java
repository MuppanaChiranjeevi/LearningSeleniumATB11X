package com.thetestingacademy.Ex07_Selenium_RelativeLocators;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab38_SeleniumMiniProject7 extends CommonToAll {
    @Test
    public void test_case1(){
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        search.sendKeys("india" + Keys.ENTER);
        waitForJVM(3000);

        List<WebElement> cities = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for(WebElement city : cities){
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
            String AQI = driver.findElement(with(By.tagName("span")).toRightOf(city)).getText();
            System.out.println(" | "+rank+" | "+city.getText()+" | "+AQI);
        }
    }

}
