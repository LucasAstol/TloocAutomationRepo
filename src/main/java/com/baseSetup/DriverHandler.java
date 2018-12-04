package com.baseSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class DriverHandler {

	private static WebDriver activeDriver;
	
	public static WebDriver getDriver() {
		
		if (activeDriver == null) {
			
			setDriver();
		}
		return activeDriver;
	}
	
	//The idea is to have the ability of determining the driver to use from a config file and set it from setDriver() method
	private static void setDriver() {
		
		activeDriver = initChromeDriver();
		activeDriver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		activeDriver.manage().window().maximize();
	}
	
	private static WebDriver initFirefoxDriver() {
		
		System.out.println("Launching Firefox driver");	
		
		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setAcceptUntrustedCertificates(true);
		FirefoxOptions ffOptions = new FirefoxOptions().setProfile(ffProfile);
		WebDriver driver = new FirefoxDriver(ffOptions);
		return driver;
	}
	
	private static WebDriver initChromeDriver() {
		
		System.out.println("Launching Chrome driver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	
	public static void terminateDriver() {
		
		if (activeDriver != null) {
			
			activeDriver.quit();
			activeDriver = null;
		}
	}
	
}
