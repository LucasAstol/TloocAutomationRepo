package com.testSetup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.baseSetup.DriverHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	@BeforeClass
	public void webDriverManagerSetup() {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	}
	
	@BeforeMethod
	public void initialize() {
		
		DriverHandler.getDriver()
		.navigate()
		.to("https://www-stg.travelooc.com");		
	}
	
	@AfterMethod(alwaysRun=true)
	public void terminate() {
		DriverHandler.terminateDriver();
	}
	
	
}
