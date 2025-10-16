package test;

import org.testng.annotations.Test;

import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.DemoQaPoms.LandingPage;
import com.wordpress.pagemodels.DemoQaPoms.RadioButtonPage;

public class RadioButtonTest extends BaseTest {
    @Test(priority = 0)
    public void clickYesButton() {
        LandingPage landingPage = new LandingPage(page);
        RadioButtonPage radioButtonPage = new RadioButtonPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        radioButtonPage.clickRadioButtonPage();
        radioButtonPage.clickYesRadio();
    }

    @Test(priority = 0)
    public void clickImpressiveButton() {
        LandingPage landingPage = new LandingPage(page);
        RadioButtonPage radioButtonPage = new RadioButtonPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        radioButtonPage.clickRadioButtonPage();
        radioButtonPage.clickImpressiveRadio();
    }
}
