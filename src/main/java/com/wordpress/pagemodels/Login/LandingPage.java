package com.wordpress.pagemodels.Login;

import com.microsoft.playwright.Page;

public class LandingPage {
    private final Page page;

    // Locators (all in one place at the top)
    private final String pageTitle = "//a[@href='https://demoqa.com']";


    // Constructor
    public LandingPage(Page page) {
        this.page = page;
    }

    // Verifing page title once after loading
    public Page verifyPageTitle() {
        page.waitForSelector(pageTitle);
        return page;
    }
}
