package com.wordpress.pagemodels.DemoQaPoms;

import static org.testng.Assert.assertTrue;

import com.microsoft.playwright.Page;

public class CheckBoxPage {
    private final Page page;

    private final String checkBoxButton = "//span[@class='text'][normalize-space()='Check Box']";
    private final String checkBoxTitle = "//h1[@class='text-center'][normalize-space()='Check Box']";
    private final String checkBoxUnCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-uncheck')]";
    private final String checkBoxCheck = "//span[@class='rct-checkbox']//*[contains(@class,'rct-icon-check')]";
    private final String homeFolder = "//span[@class='rct-title'][contains(text(),'Home')]";
    private final String desktopFolder = "//span[@class='rct-title'][contains(text(),'Desktop')]";
    private final String documentsFolder = "//span[@class='rct-title'][contains(text(),'Documents')]";
    private final String downloadsFolder = "//span[@class='rct-title'][contains(text(),'Downloads')]";
    private final String toggleButton = "//button[@title='Toggle']";
    private final String toggleExpandAll = "//button[@title='Expand all']";
    private final String desktopCheckBox = "//span[@class='rct-title' and text()='Desktop']/preceding-sibling::span[@class='rct-checkbox']";
    private final String workspaceCheckBox = "//span[@class='rct-title' and text()='WorkSpace']/preceding-sibling::span[@class='rct-checkbox']";
    private final String officeCheckBox = "//span[@class='rct-title' and text()='Office']/preceding-sibling::span[@class='rct-checkbox']";
    private final String downloadsCheckBox = "//span[@class='rct-title' and text()='Downloads']/preceding-sibling::span[@class='rct-checkbox']";
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
        page.isEnabled(homeFolder);
        page.isEnabled(checkBoxUnCheck);
        page.click(checkBoxUnCheck);
        boolean isChecked = page.isEnabled(checkBoxCheck);
        assertTrue(isChecked, "Checkbox should be checked after clicking it.");
        return page;
    }

    //Method to validate toast result after selecting all the folders.
    public Page verifyToastResultForAll() {
        page.isEnabled(SelectionResultAll);
        boolean isToastTrue = page.isVisible(SelectionResultAll);
        assertTrue(isToastTrue, "Result is not expected");
        return page;
    }

    public Page clickToggle() {
        page.isEnabled(toggleButton);
        page.click(toggleButton);
        return page;
    }

    public Page verifyFoldersAndSubFolders() {
        page.isEnabled(homeFolder);
        page.isEnabled(desktopFolder);
        page.isEnabled(documentsFolder);
        page.isEnabled(downloadsFolder);
        return page;
    }

    public Page expandAllTheFolder() {
        page.isEnabled(toggleExpandAll);
        page.click(toggleExpandAll);
        return page;
    }

    public Page verifyDesktopFolder() {
        page.isEnabled(desktopCheckBox);
        page.click(desktopCheckBox);
        page.isEnabled(textSuccessDesktop);
        page.isEnabled(textSuccessNotes);
        page.isEnabled(textSuccessCommands);
        return page;
    }

    public Page verifyWorkspaceFolder() {
        page.isEnabled(workspaceCheckBox);
        page.click(workspaceCheckBox);
        page.isEnabled(textSuccessWorkSpace);
        page.isEnabled(textSuccessReact);
        page.isEnabled(textSuccessAngular);
        page.isEnabled(textSuccessVeu);
        return page;
    }

    public Page verifyOfficeFolder() {
        page.isEnabled(officeCheckBox);
        page.click(officeCheckBox);
        page.isEnabled(textSuccessOffice);
        page.isEnabled(textSuccessPublic);
        page.isEnabled(textSuccessPrivate);
        page.isEnabled(textSuccessClassified);
        page.isEnabled(textSuccessGeneral);
        return page;
    }

    public Page verifyDownloadsFolder() {
        page.isEnabled(downloadsCheckBox);
        page.click(downloadsCheckBox);
        page.isEnabled(textSuccessDownloads);
        page.isEnabled(textSuccessWordFile);
        page.isEnabled(textSuccessExcelFile);
        return page;
    }

}
