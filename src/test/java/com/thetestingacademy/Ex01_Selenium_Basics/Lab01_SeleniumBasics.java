package com.thetestingacademy.Ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab01_SeleniumBasics {

    @Test
    public void test01_VWOLoginPage(){
        ChromeDriver chromeDriver; // Class Loaded in the JVM by Class Loader.`
        chromeDriver=new ChromeDriver(); // Launches a new instance of Chrome.
        // This makes a POST request to the Selenium Server to create a new browser session.
        // POST Request --> New Session in Selenium --> Always Fresh new browser session(browser's copy) is created
        //  A unique session ID (e.g., q09876q789e8wq89we87dasdasd) gets assigned to track this session.`
        System.out.println("Session ID : " + chromeDriver.getSessionId());


        // Session -> Run the commands
        chromeDriver.get("https://app.vwo.com"); // GET Request ->  Opens the login page
        System.out.println(chromeDriver.getTitle()); // Prints the page title
        chromeDriver.quit(); // Shutdown the browser --> After quit(), the session is closed — getSessionId() will return null.
        System.out.println("Session ID : " + chromeDriver.getSessionId()); // --> Session == null.

    }

}
