package tloocTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.Pages.Header;
import com.pageObjects.Pages.HomePage;
import com.pageObjects.Pages.LoginPage;
import com.testSetup.BaseTest;

public class HomePageTest extends BaseTest{
	
private HomePage home = new HomePage();
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "homepage")
	public void loginPageTravelooc() {
		
		Assert.assertTrue(home.searchCities().isVisible(), "Home page is not displayed");	
		
		Header header = new Header();
		header.getAccesoButton().click();		
		
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.emailInput().isVisible(), "Home page is not displayed");	
	}

}
