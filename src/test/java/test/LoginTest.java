package test;

import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.DemoQaPoms.LandingPage;

import org.testng.annotations.Test;

//Login test
public class LoginTest extends BaseTest {
    @Test
    // Land on the demo site and verify tittle
    public void landOnSiteAndVerifyTitle() {
        LandingPage landingPage = new LandingPage(page);
        landingPage.verifyPageTitle();
    }
}