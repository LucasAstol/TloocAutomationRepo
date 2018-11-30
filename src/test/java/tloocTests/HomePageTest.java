package tloocTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.Pages.HomePage;
import com.pageObjects.Pages.LoginPage;
import com.testSetup.BaseTest;

public class HomePageTest extends BaseTest{
	
private HomePage home = new HomePage();
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "homepage")
	public void loginPageTravelooc() {
		
		Assert.assertTrue(home.searchCities().isVisible(), "Google home page not displayed");
		
		home.loginButton().click();
		
		LoginPage login = new LoginPage();
		
		login.emailInput().scrollTo();
		Assert.assertTrue(login.title().isVisible(), "Login page not displayed");
		Assert.assertTrue(login.emailInput().isVisible(), "no se ve el email");	
		
	}

}
