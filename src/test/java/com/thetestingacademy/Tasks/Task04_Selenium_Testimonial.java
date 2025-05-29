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

public class Task04_Selenium_Testimonial {
    @Test
    public void test_Testimonial() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);

        driver.get("https://courses.thetestingacademy.com/courses/11x-live-job-ready-automation-tester-blueprint-with-java-by-pramod-dutta-11x/contents/67c1375d43c22");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement username = driver.findElement(By.xpath("//*[@placeholder=\"Email Address\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"zen-visible-captcha\"]/div/div")));
        WebElement checkbox =driver.findElement(By.xpath("//div[@id=\"zen-visible-captcha\"]/div/div"));

        username.sendKeys("chiranjeevimuppana982@gmail.com");
        password.sendKeys("Enter Your Password");
        checkbox.click();
        Thread.sleep(10000);
        signInButton.click();
        Thread.sleep(5000);

        for (int i = 0; i < 100; i++) {

            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[text()='Next Lesson']")).click();


        }



    }
}
