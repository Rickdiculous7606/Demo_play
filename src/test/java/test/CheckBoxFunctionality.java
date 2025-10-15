package test;

import org.testng.annotations.Test;

import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.DemoQaPoms.CheckBoxPage;
import com.wordpress.pagemodels.DemoQaPoms.LandingPage;

public class CheckBoxFunctionality extends BaseTest {
    @Test (priority = 0)
    public void checkBoxEnd2End() {
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.clickHomeCheck();
        checkBoxPage.verifyToastResultForAll();
    }

    @Test (priority = 1)
    public void folderTitleValidation() {
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.clickToggle();
        checkBoxPage.verifyFoldersAndSubFolders();
    }

    @Test (priority = 1)
    public void desktopFolderValidation() {
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.expandAllTheFolder();
        checkBoxPage.verifyDesktopFolder();
    }

    @Test (priority = 1)
    public void workspaceFolderValidation() {
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.expandAllTheFolder();
        checkBoxPage.verifyWorkspaceFolder();
    }

    @Test (priority = 1)
    public void officeFolderValidation(){
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.expandAllTheFolder();
        checkBoxPage.verifyOfficeFolder();
    }

    @Test (priority = 1)
    public void downloadsFolderValidation() {
        LandingPage landingPage = new LandingPage(page);
        CheckBoxPage checkBoxPage = new CheckBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        checkBoxPage.clickCheckBoxButton();
        checkBoxPage.verifyCheckBoxTitle();
        checkBoxPage.expandAllTheFolder();
        checkBoxPage.verifyDownloadsFolder();
    }

}
