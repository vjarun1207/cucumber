package com.pojoclass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.stepdefinition.Hooks;

public class LoginPojoClass extends BaseClass {
	
	
	public LoginPojoClass() {
		PageFactory.initElements(Hooks.driver, this); 
	}
    @FindBy(id="email")
	private List<WebElement> username;


    @FindBy(id="pass")
	private List<WebElement> userpassword;
	@FindBy(id="loginbutton")
	private List<WebElement> loginbutton;
	
	
	public List<WebElement> getLoginbutton() {
		return loginbutton;
	}
	public  List<WebElement> getUsername() {
		return username;
	}
	public  List<WebElement> getUserpassword() {
		return userpassword;
	}
	
	
	
	
	
	
}
