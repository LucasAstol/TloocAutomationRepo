package tloocTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.Pages.Header;
import com.pageObjects.Pages.LoginPage;
import com.testSetup.BaseTest;

public class LoginPageTest extends BaseTest{
	
	private LoginPage login = new LoginPage();
	
	
	@Test (description = "Verify login page is displayed", 
			testName = "Login page displays")
	public void loginPageIsDisplayed() {
		
		Header header = new Header();
		header.getButtonLogin().click();		
		Assert.assertTrue((login.getInputEmail().isVisible()
				&&login.getInputPassword().isVisible()), "Login page is not displayed");
	}
	
	@Test (description = "Verify validation are displayed when attempting to login with blank fields", 
			testName = "Failed login with fields in blank")
	public void failedLoginBlankFields() {
		
		Header header = new Header();
		header.getButtonLogin().click();
		
		login.getButtonLogin().click();		
		Assert.assertTrue(login.getLabelEmailErrorMessage().isVisible(), "Email validation message not displayed");
		Assert.assertTrue(login.getLabelPasswordErorMessage().isVisible(), "Password validation message not displayed");
		Assert.assertTrue(login.getInputEmail().isValidatedRedHighlighted(), "Email not highlighted");
		Assert.assertTrue(login.getInputPassword().isValidatedRedHighlighted(), "Password not highlighted");
	}
	
	
}
