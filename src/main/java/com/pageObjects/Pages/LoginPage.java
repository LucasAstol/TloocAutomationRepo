package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.*;

public class LoginPage extends BasePage {
	
	public LoginPage() {
		super();
	}
	
	public InputField getInputEmail() {
		
		return new InputField(By.cssSelector("input[name='email']"));
	}
	
	public Label title() {
		
		return new Label(By.cssSelector("h3"));
	}
	
	public InputField getInputPassword() {
		
		return new InputField(By.cssSelector("input[name='password']"));
	}
	
	public Button getButtonLogin() {
		
		return new Button(By.cssSelector("input[name='password']"));
	}
	
	
	
}
