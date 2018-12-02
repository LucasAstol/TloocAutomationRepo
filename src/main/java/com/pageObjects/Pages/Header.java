package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.Button;

public class Header extends BasePage{
	
	public Header() {
		
		super();
	}
	
	public Button getButtonLogin() {
		
		return new Button(By.cssSelector("ul a[title='Login']"));
	}
	
	public Button getButtonComoFunciona() {
		
		return new Button(By.cssSelector("nav.primary-navigation a.scroll-link"));
	}
	
	public Button getButtonSignUp() {
		
		return new Button(By.cssSelector("nav.primary-navigation li>a[title='Signup']"));
	}
	
	public Button getButtonBecomeTC() {
		
		return new Button(By.cssSelector("nav.primary-navigation div>a.button"));
	}

}
