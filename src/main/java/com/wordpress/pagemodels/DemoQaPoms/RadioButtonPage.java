package com.wordpress.pagemodels.DemoQaPoms;

import static org.testng.Assert.assertTrue;

import com.microsoft.playwright.Page;

public class RadioButtonPage {
    private final Page page;

    private final String radioButtonPage = "//span[@class='text'][normalize-space()='Radio Button']";
    private final String radioButtonTitle = "//h1[@class='text-center'][normalize-space()='Radio Button']";
    private final String questionText = "//div[@class='mb-3'][normalize-space()='Do you like the site?']";
    private final String yesButton = "//label[@for='yesRadio']";
    private final String impressiveButton = "//label[@for='impressiveRadio']";
    private final String yesToastMessage = "//span[@class='text-success'][text()='Yes']";
    private final String impressiveToastMessage = "//span[@class='text-success'][text()='Impressive']";

    public RadioButtonPage(Page page) {
        this.page = page;
    }

    // Method to navigate to radio button page.
    public Page clickRadioButtonPage() {
        page.isEnabled(radioButtonPage);
        page.click(radioButtonPage);
        page.isEnabled(radioButtonTitle);
        return page;
    }

    // Method to validate question text and click yes button.
    public Page clickYesRadio() {
        page.waitForSelector(questionText);
        page.waitForSelector(yesButton);
        page.click(yesButton);
        page.isEnabled(yesToastMessage);
        assertTrue(page.isVisible(yesToastMessage), "Yes toast message not visible after clicking radio");
        return page;
    }

    // Method to validate question text and click impressive button.
    public Page clickImpressiveRadio() {
        page.isEnabled(questionText);
        page.isEnabled(impressiveButton);
        page.click(impressiveButton);
        page.isEnabled(impressiveToastMessage);
        assertTrue(page.isVisible(impressiveToastMessage), "impressive toast message not visible after clicking radio");
        return page;
    }

}
