package com.thetestingacademy.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task03_Selenium_AppliTools {
    @Test
    public void test_AppliTools()  {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--guest");

        WebDriver driver =new ChromeDriver(chromeOptions);

        driver.get("https://demo.applitools.com/");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Login Form']")));

        WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        WebElement signInButton = driver.findElement(By.xpath("//a[@id=\"log-in\"]"));
        username.sendKeys("Admin");
        password.sendKeys("Password@123");
        signInButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logo-label")));
        String first_part = "//div[@class='table-responsive']/table/tbody/tr[";
        String second_part = "]/td[5]";

        int rows = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr")).size();
//        int cols = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td")).size();
        Double amount =0.0;
        for (int i = 1; i <=6 ; i++) {
            String value = driver.findElement(By.xpath(first_part+i+second_part)).getText();

            String value1 = value.replace(" USD", "").replace(",", "");
            if(value1.contains("+")){
                String arr[] = value1.split(" ");
                amount += Double.parseDouble(arr[1]);
            }
            if(value1.contains("-")){
                String[] arr = value1.split(" ");
                amount -= Double.parseDouble(arr[1]);

            }

        }
        System.out.println(amount);
        Assert.assertEquals(amount,1996.22);



    }
}
