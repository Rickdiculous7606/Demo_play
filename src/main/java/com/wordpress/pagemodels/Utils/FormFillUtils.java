package com.wordpress.pagemodels.Utils;

import org.testng.annotations.DataProvider;

import com.wordpress.pagemodels.Constants.FormFillConstants;

public class FormFillUtils {
    @DataProvider(name = "textBoxData")
    public static Object[][] getTextBoxData() {
        return new Object[][]{
                // Using constants for default data
                {FormFillConstants.FULL_NAME, FormFillConstants.EMAIL, FormFillConstants.ADDRESS, FormFillConstants.PERMANENT_ADDRESS},
                // Additional test scenarios
                {"Ramesh Kumar", "ramesh.qa@example.com", "1/60 Indra Nagar, Chennai", "No.45, Main Street, Chennai"}
        };
    }
}
