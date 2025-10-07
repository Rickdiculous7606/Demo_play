package test;

import static com.wordpress.pagemodels.Constants.FormFillConstants.EMAIL_ERROR;

import org.testng.annotations.Test;

import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.DemoQaPoms.LandingPage;
import com.wordpress.pagemodels.DemoQaPoms.TextBoxPage;
import com.wordpress.pagemodels.Utils.FormFillUtils;

public class InvalidEmailTest extends BaseTest {
    @Test(dataProvider = "invalidEmailData", dataProviderClass = FormFillUtils.class)
    public void testInvalidEmail(String invalidEmail) {
        LandingPage landingPage = new LandingPage(page);
        TextBoxPage textBoxPage = new TextBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        textBoxPage.clickTextBox();
        textBoxPage.verifyTextBoxTitle();
        textBoxPage.enterInvalidEmail(EMAIL_ERROR);
        textBoxPage.clickSubmitButton();
        textBoxPage.verifyInvalidEmailError();
    }
}
