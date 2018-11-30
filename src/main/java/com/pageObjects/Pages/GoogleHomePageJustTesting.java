package com.pageObjects.Pages;

import org.openqa.selenium.By;

import com.pageObjects.BasePage;
import com.pageObjects.Elements.*;

public class GoogleHomePageJustTesting extends BasePage{
	
	public GoogleHomePageJustTesting() {
		super();
	}
	
	public Button buttonSubmit() {
		
		return new Button(By.cssSelector("div.FPdoLc.VlcLAe input[name='btnK']"));
	}
	
	public InputField inputSearch(){
		
		return new InputField(By.cssSelector("input.gLFyf.gsfi"));
	}
	

}
