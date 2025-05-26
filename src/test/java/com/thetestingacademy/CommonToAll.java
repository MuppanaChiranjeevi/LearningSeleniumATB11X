package com.thetestingacademy;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAll {
    public EdgeDriver driver;
    @BeforeTest
    public void setUp(){

        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.quit();
    }
    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
