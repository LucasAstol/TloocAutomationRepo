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
		
		return new Button(By.cssSelector("#acceso input.button"));
	}
	
	public Label getLabelPasswordErorMessage() {
		
		//Due to the HTML composition we are forced to catch the error message as a sibling of the password input
		return new Label(By.cssSelector("input[name='password'] ~ span.form-error"));
	}
	
	public Label getLabelEmailErrorMessage() {
		
		//Due to the HTML composition we are forced to catch the error message as a sibling of the email input
		return new Label(By.cssSelector("input[name='email'] ~ span.form-error"));
	}
	
}
