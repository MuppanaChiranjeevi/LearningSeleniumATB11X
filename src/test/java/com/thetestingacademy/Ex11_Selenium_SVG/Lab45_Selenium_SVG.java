package com.thetestingacademy.Ex11_Selenium_SVG;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Lab45_Selenium_SVG extends CommonToAll{
    @Description("Verify that the search with svg icon, results are visible.")
    @Test
    public void test_Flipkart_Search_SVG_Icon(){

        String URL = "https://www.flipkart.com/search";
        driver.get(URL);

        // Step 1 - Enter the "macnmini" in the inputbox.
        driver.findElement(By.name("q")).sendKeys("macmini");

        // Step 2 - Click on the svg element.
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();


    }
}
