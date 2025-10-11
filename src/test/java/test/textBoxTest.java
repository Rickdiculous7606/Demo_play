package test;

import static com.wordpress.pagemodels.Constants.FormFillConstants.ADDRESS;
import static com.wordpress.pagemodels.Constants.FormFillConstants.EMAIL;
import static com.wordpress.pagemodels.Constants.FormFillConstants.FULL_NAME;
import static com.wordpress.pagemodels.Constants.FormFillConstants.PERMANENT_ADDRESS;

import org.testng.annotations.Test;

import com.wordpress.pagemodels.Base.BaseTest;
import com.wordpress.pagemodels.DemoQaPoms.LandingPage;
import com.wordpress.pagemodels.DemoQaPoms.TextBoxPage;
import com.wordpress.pagemodels.Utils.FormFillUtils;

public class textBoxTest extends BaseTest {
    @Test(dataProvider = "textBoxData", dataProviderClass = FormFillUtils.class)
    // Land on the text box to fill details
    public void fillForm(String name, String emailId, String address, String address2) {
        LandingPage landingPage = new LandingPage(page);
        TextBoxPage textBoxPage = new TextBoxPage(page);
        landingPage.verifyPageTitle();
        landingPage.navigateTextBoxPage();
        textBoxPage.clickTextBox();
        textBoxPage.verifyTextBoxTitle();
        textBoxPage.fillFullName(FULL_NAME);
        textBoxPage.fillEmailId(EMAIL);
        textBoxPage.fillCurrentAddress(ADDRESS);
        textBoxPage.fillPermanentAddress(PERMANENT_ADDRESS);
        textBoxPage.clickSubmitButton();
    }
}
