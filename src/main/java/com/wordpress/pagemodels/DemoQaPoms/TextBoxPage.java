package com.wordpress.pagemodels.DemoQaPoms;

import com.microsoft.playwright.Page;

public class TextBoxPage {
    private final Page page;

    //Locators
    private final String textBoxButton = "//span[@class='text'][normalize-space()='Text Box']";
    private final String textBoxTitle = "//h1[@class='text-center'][normalize-space()='Text Box']";
    private final String fullName = "//label[contains(@id, 'userName-label')]";
    private final String fullNameTextBox = "//input[contains(@placeholder, 'Full Name')]";
    private final String email = "//label[contains(@id, 'userEmail-label')]";
    private final String emailTextBox = "//input[contains(@placeholder, 'name@example.com')]";
    private final String emailBoxError = "//input[contains(@class, 'form-control') and contains(@class, 'field-error')]";
    private final String currentAddress = "//label[contains(@id, 'currentAddress-label')]";
    private final String currentAddressTextBox = "//textarea[contains(@placeholder, 'Current Address')]";
    private final String permanentAddress = "//label[contains(@id, 'permanentAddress')]";
    private final String permanentAddressTextBox = "//textarea[contains(@id, 'permanentAddress')]";
    private final String submitButton = "//button[@id='submit']";

    // Constructor for text box page POM
    public TextBoxPage(Page Page){
        this.page = Page;
    }

    //Click on text to fill the form
    public Page clickTextBox(){
        page.waitForSelector(textBoxButton);
        page.click(textBoxButton);
        return page;
    }

    //Verify the text box page title
    public Page verifyTextBoxTitle() {
        page.waitForSelector(textBoxTitle);
        return page;
    }

    //Verify full name amd enter the text.
    public Page fillFullName(String name){
        page.waitForSelector(fullName);
        page.click(fullNameTextBox);
        page.fill(fullNameTextBox, name);
        return page;
    }
    //Verify email amd enter the email id.
    public Page fillEmailId(String emailID){
        page.waitForSelector(email);
        page.click(emailTextBox);
        page.fill(emailTextBox, emailID);
        return page;
    }
    //Verify address amd enter the address.
    public Page fillCurrentAddress(String address) {
        page.waitForSelector(currentAddress);
        page.click(currentAddressTextBox);
        page.fill(currentAddressTextBox, address);
        return page;
    }
    // //Verify permanent address amd enter the address.
    public Page fillPermanentAddress(String address2) {
        page.waitForSelector(permanentAddress);
        page.click(permanentAddressTextBox);
        page.fill(permanentAddressTextBox, address2);
        return page;
    }
    //Click submit button once after filling the form.
    public Page clickSubmitButton(){
        page.waitForSelector(submitButton);
        page.click(submitButton);
        return page;
    }

    //Verify the wrong email ID error in email text box
    public Page verifyInvalidEmailError() {
        page.waitForSelector(emailBoxError);
        return page;
    }

    //Enter invalid email to check error
    public Page enterInvalidEmail(String invalidEmail) {
        page.waitForSelector(email);
        page.click(emailTextBox);
        page.fill(emailTextBox, invalidEmail);
        return page;
    }

}
