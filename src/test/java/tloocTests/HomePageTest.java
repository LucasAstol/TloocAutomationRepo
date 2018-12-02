package tloocTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageObjects.Pages.Header;
import com.pageObjects.Pages.HomePage;
import com.pageObjects.Pages.LoginPage;
import com.testSetup.BaseTest;

public class HomePageTest extends BaseTest{
	
private HomePage home = new HomePage();
	
	@Test (description = "Verifies login page is displayed", 
			testName = "homepage")
	public void loginPageTravelooc() {
		
		Assert.assertTrue(home.searchCities().isVisible(), "Home page is not displayed");	
		
		Header header = new Header();
		header.getButtonLogin().click();		
		
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.getInputEmail().isVisible(), "Home page is not displayed");	
	}

}
