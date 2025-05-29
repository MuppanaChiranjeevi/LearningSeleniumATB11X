package com.thetestingacademy.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task01_Selenium_Locator_XPath {
    @Test
    public void test_Invalid_login_OrangeHRM()  {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--guest");

        WebDriver driver =new ChromeDriver(chromeOptions);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));

        WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement signInButton = driver.findElement(By.tagName("button"));
        username.sendKeys("chiru@test.com");
        password.sendKeys("chiru@1234");
        signInButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,\"alert-content\")]")));
        WebElement error_msg = driver.findElement(By.xpath("//div[contains(@class,\"alert-content\")]"));
        Assert.assertEquals(error_msg.getText(),"Invalid credentials");

        driver.quit();



    }
}
