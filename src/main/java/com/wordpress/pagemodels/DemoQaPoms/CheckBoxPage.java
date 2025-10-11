package com.wordpress.pagemodels.DemoQaPoms;

import com.microsoft.playwright.Page;

public class CheckBoxPage {
    private final Page page;

    private final String checkBoxButton = "//span[@class='text'][normalize-space()='Check Box']";
    private final String checkBoxTitle = "//h1[@class='text-center'][normalize-space()='Check Box']";
    private final String checkBoxUnCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-uncheck')]";
    private final String checkBoxCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-check')]";
    private final String toggleButton = "//button[@title='Toggle']";

    public CheckBoxPage(Page page) {
        this.page = page;
    }


}
