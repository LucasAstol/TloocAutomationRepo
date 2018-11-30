package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.*;

public class HomePage extends BasePage{
	
	public HomePage() {
		super();
	}	
	
	public InputField searchCities() {
		
		return new InputField(By.id("donde-1"));				
	}

}
