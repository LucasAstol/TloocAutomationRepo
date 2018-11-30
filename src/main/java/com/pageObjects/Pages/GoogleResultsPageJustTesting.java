package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.*;
import com.pageObjects.Elements.Label;

public class GoogleResultsPageJustTesting extends BasePage {
	
	public GoogleResultsPageJustTesting() {
		super();
	}
	
	public Label labelResultsStats() {
		
		return new Label(By.id("resultStats"));
	}

}
