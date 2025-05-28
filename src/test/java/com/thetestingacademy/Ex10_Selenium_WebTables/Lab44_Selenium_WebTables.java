package com.thetestingacademy.Ex10_Selenium_WebTables;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Lab44_Selenium_WebTables extends CommonToAll {
    @Test
    public void test_dynamic_webTables(){
        driver.navigate().to("https://awesomeqa.com/webtable1.html");
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows.size() ; i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for(WebElement col: cols){
                System.out.println(col.getText());
            }
            System.out.println("--------------------");
        }
    }
}
