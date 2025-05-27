package com.thetestingacademy.Ex09_Selenium_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab40_Selenium_DDT {

    @Test(dataProvider = "testdata")
    public void test_login(String email, String password) {
        System.out.println(email + " --> " + password);
    }

    @DataProvider
    public Object[][] testdata() {
        return new Object[][]{
                {"john.brown756@thetestingacademy.com", "Nwm1Va8c3X"},
                {"mike.johnson378@thetestingacademy.com", "uBtf4dIXCA"},
                {"maria.smith343@thetestingacademy.com", "YXBqV6cMlr"},
                {"linda.wilson568@thetestingacademy.com", "ltmCBRyPF0"},
                {"noah.davis118@thetestingacademy.com", "0tpRauzlhM"},
                {"chris.jones992@thetestingacademy.com", "6oPCeMzdkN"},
                {"emma.rodriguez870@thetestingacademy.com", "N1QkvMeKFW"},
                {"alex.williams438@thetestingacademy.com", "iErfhDLzJp"},
                {"jane.garcia953@thetestingacademy.com", "h4BpsRnZ2M"},
                {"olivia.miller62@thetestingacademy.com", "q8RfXBkCGs"},
                {"john.wilson479@thetestingacademy.com", "F3XpOqJsHg"},
                {"chris.brown670@thetestingacademy.com", "QmL17KwWUE"},
                {"linda.davis456@thetestingacademy.com", "i5cOm0KNtj"},
                {"maria.johnson234@thetestingacademy.com", "uHGvcie9kR"},
                {"noah.smith129@thetestingacademy.com", "DOfNXrcm1q"},
                {"mike.williams843@thetestingacademy.com", "YdH5m8Kl3W"},
                {"jane.jones370@thetestingacademy.com", "jZ6KyUqJRV"},
                {"emma.garcia725@thetestingacademy.com", "b5mCAXoLsn"},
                {"alex.rodriguez981@thetestingacademy.com", "Y7CebnDR9i"},
                {"olivia.miller720@thetestingacademy.com", "GCVEdYzFqS"}

        };


    }
}
