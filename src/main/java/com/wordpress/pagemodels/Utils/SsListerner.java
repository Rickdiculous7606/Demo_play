package com.wordpress.pagemodels.Utils;

import com.microsoft.playwright.Page;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class SsListerner implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            // Get page instance from test class
            Object testClass = result.getInstance();
            Page page = (Page) testClass.getClass().getMethod("getPage").invoke(testClass);

            if (page != null) {
                String testName = result.getMethod().getMethodName();
                String screenshotPath = ScreenshotUtil.captureScreenshot(page, testName);

                // Attach screenshot to report
                System.setProperty("screenshotPath", screenshotPath);
                System.out.println("Screenshot saved: " + screenshotPath);
            }
        } catch (Exception e) {
            System.err.println("Failed to capture screenshot on failure: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        onTestFailure(result); // Also capture screenshot for skipped tests if needed
    }

}
