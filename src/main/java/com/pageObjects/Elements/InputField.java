package com.pageObjects.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.pageObjects.BaseElement;

public class InputField extends BaseElement{
	
	public InputField(By by) {		
		super(by);
	}
	
	public void inputText(String inputText) {
		
		this.getWebElement().click();
		this.getWebElement().clear();
		this.getWebElement().sendKeys(inputText);
	}
	
	public void focusOut() {
		
		this.getWebElement().sendKeys(Keys.TAB);
	}
	
	public boolean isValidatedRedHighlighted() {
		
		return this.getWebElement().getAttribute("style").equals("border-color: rgb(169, 68, 66);");
	}

}
