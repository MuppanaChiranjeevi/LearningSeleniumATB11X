package com.thetestingacademy.Ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab15_SeleniumMiniProject3{
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Chiranjeevi Muppana")
    @Test
    public void test_vwo_login_invalid_login() throws InterruptedException {

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

//        driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the admin@12345.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

//        <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

//        <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("admin@12345");

//      <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
//      onclick="login.login(event)" data-qa="sibequkica">
        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        // Wait for  some time.
        Thread.sleep(3000);

//        <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
