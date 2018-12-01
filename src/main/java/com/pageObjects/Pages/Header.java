package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.Button;

public class Header extends BasePage{
	
	public Header() {
		
		super();
	}
	
	public Button getAccesoButton() {
		
		return new Button(By.cssSelector("ul a[title='Login']"));
	}

}
