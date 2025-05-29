package com.thetestingacademy.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task02_Selenium_Katalon {
    @Test
    public void test_Katalon_full_flow() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Make Appointment']")));

        WebElement Make_Appointment = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        Make_Appointment.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login']")));

        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement login = driver.findElement(By.tagName("button"));

        username.sendKeys(driver.findElements(By.xpath("//input[@placeholder=\"Username\"]")).get(0).getAttribute("value"));
        password.sendKeys(driver.findElements(By.xpath("//input[@placeholder=\"Password\"]")).get(0).getAttribute("value"));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Make Appointment']")));
        Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));

        WebElement Facility = driver.findElement(By.id("combo_facility"));
        Select select = new Select(Facility);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        driver.findElement(By.id("radio_program_medicaid")).click();
        driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys("28/05/2025");
        driver.findElement(By.id("txt_comment")).sendKeys("Emergency health condition");
        driver.findElement(By.id("btn-book-appointment")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Appointment Confirmation']")));
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Appointment Confirmation");
    }
}