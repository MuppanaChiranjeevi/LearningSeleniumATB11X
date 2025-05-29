package com.thetestingacademy.Tasks;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task06_Selenium_Espocrm {
    @Description("TC#1 - Verify espocrm")
    @Test
    public void espocrm() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        WebDriver driver =new ChromeDriver(chromeOptions);
        Actions actions = new Actions(driver);

        driver.get("https://demo.us.espocrm.com/?l=en_US#");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-login']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='Lead']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-buttons btn-group pull-right']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'col-sm-3')]//div[contains(@class,'selectize-input')]//input"))).click();

        WebElement select = driver.findElement(By.xpath("//div[text()='Mr.']"));
        select.click();

        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@autocomplete='espo-phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[text() = 'Save']")).click();

        String xpath = "//span[contains(text(),'"+firstname+"')]";
        System.out.println(xpath);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Leads']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-name='textFilter']"))).sendKeys(firstname);

        actions.moveToElement(driver.findElement(By.xpath("//button[@title='Search']"))).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='list ']/table/tbody")));

        String full_name =driver.findElement(By.xpath("//div[@class='list ']/table/tbody/tr/td[2]/a")).getText();
        System.out.println(full_name);
        Assert.assertEquals(full_name, firstname+" "+lastname);



    }

}
