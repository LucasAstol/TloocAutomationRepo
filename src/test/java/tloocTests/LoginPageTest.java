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
}
