package com.wordpress.pagemodels.Base;

import com.microsoft.playwright.*;

public class DriverFactory {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    public static Page initDriver(String browserName) {
        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "webkit":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            default:
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }

        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null)); // maximized
        page = context.newPage();
        return page;
    }

    public static void closeDriver() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
