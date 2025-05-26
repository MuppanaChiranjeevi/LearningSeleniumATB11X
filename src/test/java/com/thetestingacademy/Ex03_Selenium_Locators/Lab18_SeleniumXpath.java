package com.thetestingacademy.Ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab18_SeleniumXpath {
    /*
    Relative XPath --> //tagName[@attribute='value']
    Examples       --> //a[@id="btn-make-appointment"]  --> Find in all A tag - where id = btn-make-appoinment
                       //a[@href="./profile.php#login"]
     */


    @Owner("Chiranjeevi")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, password, appointment page is loaded")
    @Test
    public void test_katalon_appointment() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement Make_Appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        Make_Appointment.click();

        List<WebElement> username_inputs = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_inputs.get(1).sendKeys("John Doe");

        List<WebElement> password_inputs = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_inputs.get(1).sendKeys("ThisIsNotAPassword");

        WebElement button_login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        button_login.click();

        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();

    }


}
