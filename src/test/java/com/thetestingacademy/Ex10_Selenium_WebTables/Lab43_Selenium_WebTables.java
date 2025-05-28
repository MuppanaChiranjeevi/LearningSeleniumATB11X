package com.thetestingacademy.Ex10_Selenium_WebTables;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Lab43_Selenium_WebTables extends CommonToAll {

    @Test
    public void test_static_webTables(){
        driver.navigate().to("https://awesomeqa.com/webtable.html");

        // Xpath --> //table[@id='customers']/tbody/tr[2]/td[1]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for (int i = 2; i <= rows ; i++) {
            for (int j = 1; j <= cols ; j++) {
                String dynamic_path = first_part + i + second_part + j + third_part;
                System.out.print(driver.findElement(By.xpath(dynamic_path)).getText()+"    ");
            }
            System.out.println();

        }
        System.out.println("-------------------------------");
        for (int i = 2; i <= rows ; i++) {
            for (int j = 1; j <= cols ; j++) {

                    String dynamic_path = first_part + i + second_part + j + third_part;
                    String data =driver.findElement(By.xpath(dynamic_path)).getText();
                    if(data.contains("Helen Bennett")){
                        String country_path = dynamic_path+"/following-sibling::td";
                        System.out.println("Helen Bennett is present in "+driver.findElement(By.xpath(country_path)).getText());
                    }

            }


        }
    }
}
