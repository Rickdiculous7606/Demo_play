package test;

import com.microsoft.playwright.*;
import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.Login.LandingPage;
import org.testng.annotations.Test;

//Login test
public class LoginTest extends BaseTest {
    @Test
    // Land on the site and verify tittle
    public void landOnSiteAndVerifyTitle(){
        LandingPage landingPage = new LandingPage(page);
        landingPage.verifyPageTitle();
    }
}