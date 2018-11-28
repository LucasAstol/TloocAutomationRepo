package com.baseSetup;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverMethods {
	
	private static final long waitTimeout = 60;
	
	public static WebElement findElementWait(By locator) {
				
		WebElement element = (new WebDriverWait(DriverHandler.getDriver(), waitTimeout)
				.until(ExpectedConditions.presenceOfElementLocated(locator)));
		
		return element;
	}
	
	public static List<WebElement> findElementsWait(By locator) {
		
		List<WebElement> elements = (new WebDriverWait(DriverHandler.getDriver(), waitTimeout)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)));
		
		return elements;
	}
	
	public static void scrollToElement (By locator) {
		
		((JavascriptExecutor) DriverHandler.getDriver()).executeScript("arguments[0].scrollIntoView(true);", findElementWait(locator));
	}
		
}
