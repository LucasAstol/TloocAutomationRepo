package com.pageObjects.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.baseSetup.DriverMethods;

public class Dropdown extends Select{

	public Dropdown(By by) { 
		super((WebElement) DriverMethods.findElementWait(by));
	}
	
	
}
