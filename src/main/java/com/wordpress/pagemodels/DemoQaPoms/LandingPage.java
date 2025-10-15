package com.wordpress.pagemodels.DemoQaPoms;

import com.microsoft.playwright.Page;

public class LandingPage {
    private final Page page;

    // Locators
    private final String pageTitle = "//a[@href='https://demoqa.com']";
    private final String elementsCard = "//div[@class='card-body'][normalize-space()='Elements']";


    // Constructor for landing page POM
    public LandingPage(Page page) {
        this.page = page;
    }

    //verifying page title once after loading
    public Page verifyPageTitle() {
        page.isEnabled(pageTitle);
        return page;
    }

    //Navigate to text box page.
    public Page navigateTextBoxPage() {
        page.isEnabled(elementsCard);
        page.click(elementsCard);
        return page;
    }
}
