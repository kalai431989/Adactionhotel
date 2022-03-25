package com.FebProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	public WebElement getEmail() {
		return email;
		
	}

	
	public WebElement getPassword() {
		return password;
		
	}
	public WebElement getSignin_btn() {
		return signin_btn;
		
		
	}
	@FindBy(id="username")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement signin_btn;
	
	}
