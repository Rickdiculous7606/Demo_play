package com.wordpress.pagemodels.Base;

import com.microsoft.playwright.*;
import com.wordpress.pagemodels.Utils.SsListerner;

import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(SsListerner.class)
public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeMethod
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://demoqa.com");

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
    // Add this method for the listener to access page
    public Page getPage() {
        return page;
    }
}

