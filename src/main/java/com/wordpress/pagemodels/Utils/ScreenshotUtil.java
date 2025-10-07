package com.wordpress.pagemodels.Utils;

import com.microsoft.playwright.Page;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static String captureScreenshot(Page page, String testName) {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "screenshots/" + testName + "_" + timestamp + ".png";

            // Create screenshots directory if it doesn't exist
            new File("screenshots").mkdirs();

            // Take screenshot
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions()
                    .setPath(new File(fileName).toPath())
                    .setFullPage(true));

            System.out.println("Screenshot captured: " + fileName);
            return fileName;
        } catch (Exception e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }
}
