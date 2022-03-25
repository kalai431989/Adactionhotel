package com.Baseclass;
import org.openqa.selenium.WebDriver;

import form_Adactin.Final_Myintiry;
import form_Adactin.Hotelbooking_Form;
import form_Adactin.Logger_Configuration;
import form_Adactin.Login_Form;
import form_Adactin.Registe_Form;

public class POM_Class {

	public WebDriver driver;
	private Login_Form log;
	private Registe_Form reg;
	private Hotelbooking_Form hot;
	private Final_Myintiry fin;
	private Final_Myintiry logg;
	
	public POM_Class(WebDriver driver2) {
		this.driver=driver2;
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	public Login_Form getLog() {
		if(log == null) {
			
			log=new Login_Form(driver);
}
		
		return log;
	}
	
	
	
	public Registe_Form getReg() {
	if(reg == null) {
		reg=new Registe_Form(driver);
		
	}
		return reg;
	}
	
	public Hotelbooking_Form getHot() {
		if(hot == null) {
			hot=new Hotelbooking_Form(driver);
		}
		return hot;
	}

	public Final_Myintiry getFin() {
		if(fin == null) {
			fin=new Final_Myintiry(driver);
		}
		return fin;
	}
public Logger_Configuration getLogg() {
	if(logg == null) {
logg=new Final_Myintiry(driver);
		
		return logg;
	}
	
}

}
