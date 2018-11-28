package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.baseSetup.DriverMethods;
import com.baseSetup.ElementMethods;

public class BaseElement {
	
	protected By locator;
	
	public BaseElement(By by) {
		
		this.locator = by;		
	}
	
	public WebElement getWebElement() {
		
		return DriverMethods.findElementWait(locator);
	}
	
	public boolean isVisible() {
		
		return ElementMethods.isVisible(this.locator);
	}
	
	public boolean isEnabled() {
		
		return this.getWebElement().isEnabled();
	}
	
	public String text() {
		
		return this.getWebElement().getText();
	}
	
	public void click() {
		
		ElementMethods.clickWait(this.getWebElement());
	}
	
	
}
