package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.*;

public class LoginPage extends BasePage {
	
	public LoginPage() {
		super();
	}
	
	public InputField emailInput() {
		
		return new InputField(By.cssSelector("input[name='email']"));
	}
	
	public Label title() {
		
		return new Label(By.cssSelector("h3"));
	}
}
