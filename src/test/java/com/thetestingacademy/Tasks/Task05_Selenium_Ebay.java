package com.thetestingacademy.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05_Selenium_Ebay {
    @Test
    public void test_ebay() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);
        Actions actions = new Actions(driver);
        driver.get("https://www.ebay.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Search']"))).sendKeys("Macmini");
        WebElement Search_Button = driver.findElement(By.xpath("//button[@id='gh-search-btn']"));
        actions.moveToElement(Search_Button).click().build().perform();
        wait.until(ExpectedConditions.urlContains("Macmini"));
        List<WebElement> price_list = driver.findElements(By.xpath("//*[@class=\"srp-results srp-list clearfix\"]/li/div/div[2]/div[3]/div/div//span[@class='s-item__price']"));
        List<Double> prices = new ArrayList<>();
        int i = 0;
        for (WebElement element: price_list){
            if(!element.getText().contains("to")){
                String price_str = element.getText().replace("$","");
                System.out.print(price_str+"\t");
                prices.add(Double.parseDouble(price_str));

            }
        }
        System.out.println("\nThe lowset price of the Macmini in the first page is $"+Collections.min(prices));


    }
}