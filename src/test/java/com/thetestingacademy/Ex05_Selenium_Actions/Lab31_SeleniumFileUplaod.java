package com.thetestingacademy.Ex05_Selenium_Actions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab31_SeleniumFileUplaod extends CommonToAll {
    @Test
    public void test_fileupload(){
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement Choose_File = driver.findElement(By.id("fileToUpload"));
        String working_dir = System.getProperty("user.dir"); // C:\Users\Chiranjeevi\IdeaProjects\LearningSeleniumATB11X
        String file_path = working_dir + "/src/test/java/com/thetestingacademy/Ex05_Selenium_Actions/Data.txt";
        Choose_File.sendKeys(file_path);
        driver.findElement(By.name("submit")).click();
    }
}
