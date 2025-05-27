package com.thetestingacademy.Ex09_Selenium_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab41_Selenium_DDT {
    static int count =0;
    @Test(dataProvider = "testdata")
    public void test_login(String email, String password) {
        count++;
        System.out.println(count+"-->"+email + " --> " + password);
    }

    @DataProvider
    public Object[][] testdata() {

        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");
    }
}
