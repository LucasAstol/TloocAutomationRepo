package com.testSetup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.baseSetup.DriverHandler;


public class BaseTest {
	
	@BeforeMethod
	public void initialize() {
		
		DriverHandler.getDriver()
		.navigate()
		.to("https://www.google.com/");		
	}
	
	@AfterMethod(alwaysRun=true)
	public void terminate() {
		DriverHandler.terminateDriver();
	}
	
	
}
