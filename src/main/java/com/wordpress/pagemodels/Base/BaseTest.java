package com.wordpress.pagemodels.Base;

import com.microsoft.playwright.*;
import com.wordpress.pagemodels.Utils.ScreenshotUtil;
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
        // Check if test failed
        if (result.getStatus() == ITestResult.FAILURE) {
            String testName = result.getMethod().getMethodName();
            System.out.println("Test failed: " + testName + " - Taking screenshot...");

            // Take screenshot
            ScreenshotUtil.captureScreenshot(page, testName);
        }
        // Close browser
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
    // This lets other classes access the page
    public Page getPage() {
        return page;
    }
}

