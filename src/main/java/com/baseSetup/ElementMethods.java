package com.baseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementMethods {
	
	private static final long waitTimeout = 60;
	
	public static void clickWait (WebElement element) {
		
		new WebDriverWait(DriverHandler.getDriver(), waitTimeout).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static boolean isClickable (By locator) {
		
		return ExpectedConditions.elementToBeClickable(locator) != null;
	}	
	
	public static boolean isVisible (WebElement element) {
		
		return new WebDriverWait(DriverHandler.getDriver(), waitTimeout)
				.until(ExpectedConditions.visibilityOf(element)).isDisplayed(); 	
	}

	public static void scrollToElement (WebElement element) {
		
		((JavascriptExecutor) DriverHandler.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
}
