package com.stepdefinition;

import com.base.BaseClass;
import com.pojoclass.LoginPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	LoginPojoClass login=new LoginPojoClass();
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		loadUrl("https://www.facebook.com/");
		

	}

	@When("user given the login credential {string}")
	public void user_given_the_login_credential(String s ) {
		login.getUsername().get(0).sendKeys(s);
	}

	@Then("user given the {string}")
	public void user_given_the(String s1) {
	  sk(login.getUserpassword().get(0), s1);
	}

	@Then("user clicks the <loginbutton>")
	public void user_clicks_the_loginbutton() {
	 cl(login.getLoginbutton().get(0));
	}



}
