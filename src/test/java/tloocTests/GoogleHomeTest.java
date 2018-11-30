package tloocTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.Pages.GoogleHomePageJustTesting;
import com.pageObjects.Pages.GoogleResultsPageJustTesting;
import com.testSetup.BaseTest;

public class GoogleHomeTest extends BaseTest {
	
	private GoogleHomePageJustTesting home = new GoogleHomePageJustTesting();
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "Search by clicking on Search on Google button")
	public void testSearchClickingSearchOnGoogle() {
		
		Assert.assertTrue(home.inputSearch().isVisible(), "Google home page not displayed");
		
		home.inputSearch().inputText("selenium");
		home.inputSearch().focusOut();
		home.buttonSubmit().click();
		
		GoogleResultsPageJustTesting results = new GoogleResultsPageJustTesting();
		Assert.assertTrue(results.labelResultsStats().getText().contains("resultados"), "Results page is not displayed");		
	}
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "blabla search")
	public void testSearchClickingSearchBlabla() {
		
		Assert.assertTrue(home.inputSearch().isVisible(), "Google home page not displayed");
		
		home.inputSearch().inputText("blabla");
		home.inputSearch().focusOut();
		home.buttonSubmit().click();
		
		GoogleResultsPageJustTesting results = new GoogleResultsPageJustTesting();
		Assert.assertTrue(results.labelResultsStats().getText().contains("rjytdydos"), "Results page is not displayed");		
	}	
	

}
