package com.wordpress.pagemodels.DemoQaPoms;

import static org.testng.Assert.assertTrue;

import com.microsoft.playwright.Page;

public class CheckBoxPage {
    private final Page page;

    private final String checkBoxButton = "//span[@class='text'][normalize-space()='Check Box']";
    private final String checkBoxTitle = "//h1[@class='text-center'][normalize-space()='Check Box']";
    private final String checkBoxUnCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-uncheck')]";
    private final String checkBoxCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-check')]";
    private final String toggleButton = "//button[@title='Toggle']";
    private final String textSuccessHome = "//span[@class='text-success'][normalize-space()='home']";
    private final String textSuccessDesktop = "//span[@class='text-success'][normalize-space()='desktop']";
    private final String textSuccessNotes = "//span[@class='text-success'][normalize-space()='notes']";
    private final String textSuccessCommands = "//span[@class='text-success'][normalize-space()='commands']";
    private final String textSuccessDocuments = "//span[@class='text-success'][normalize-space()='documents']";
    private final String textSuccessWorkSpace = "//span[@class='text-success'][normalize-space()='workspace']";
    private final String textSuccessReact = "//span[@class='text-success'][normalize-space()='react']";
    private final String textSuccessAngular = "//span[@class='text-success'][normalize-space()='angular']";
    private final String textSuccessVeu = "//span[@class='text-success'][normalize-space()='veu']";
    private final String textSuccessOffice = "//span[@class='text-success'][normalize-space()='office']";
    private final String textSuccessPublic = "//span[@class='text-success'][normalize-space()='public']";
    private final String textSuccessPrivate = "//span[@class='text-success'][normalize-space()='private']";
    private final String textSuccessClassified = "//span[@class='text-success'][normalize-space()='classified']";
    private final String textSuccessGeneral = "//span[@class='text-success'][normalize-space()='general']";
    private final String textSuccessDownloads = "//span[@class='text-success'][normalize-space()='downloads']";
    private final String textSuccessWordFile = "//span[@class='text-success'][normalize-space()='wordFile']";
    private final String textSuccessExcelFile = "//span[@class='text-success'][normalize-space()='excelFile']";
    private final String SelectionResultAll = "//div[@id='result']";


    public CheckBoxPage(Page page) {
        this.page = page;
    }

    //Method to verify check box title.
    public Page verifyCheckBoxTitle() {
        page.waitForSelector(checkBoxTitle);
        return page;
    }

    //Method to click checkbox button.
    public Page clickCheckBoxButton() {
        page.waitForSelector(checkBoxButton);
        page.click(checkBoxButton);
        return page;
    }

    //Method to click home checkbox and validate the results.
    public Page clickHomeCheck() {
        page.waitForSelector(checkBoxUnCheck);
        page.click(checkBoxUnCheck);
        boolean isChecked = page.isEnabled(checkBoxCheck);
        assertTrue(isChecked, "Checkbox should be checked after clicking it.");
        return page;
    }

    //Method to validate toast result after selecting all the folders.
    public Page verifyToastResultForAll() {
        page.waitForSelector(SelectionResultAll);
        boolean isToastTrue = page.isVisible(SelectionResultAll);
        assertTrue(isToastTrue, "Result is not expected");
        return page;
    }

}
