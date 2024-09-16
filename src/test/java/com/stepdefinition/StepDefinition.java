package com.stepdefinition;

import com.baseclass.BaseClass;
import com.hookclass.Hook;
import com.pom.POMClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	Hook h=new Hook();
	POMClass p=new POMClass();
	String username;
	String password;
	@Given("the user is on the Facebook login page")
	public void the_user_is_on_the_facebook_login_page() {
		System.out.println("User is on Facebook login page");
	}
	@When("the user enters the username {string}")
	public void the_user_enters_the_username(String string) {
		
		   p.getUsername().sendKeys(username);
		//this.username=string;
		 System.out.println("Username entered: " + username);
		 
	}
	@When("the user enters the password {string}")
	public void the_user_enters_the_password(String string) {
		//this.password=string;
		p.getPassword().sendKeys(password);
		 System.out.println("Password entered: " + password);
	}
	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		p.getLoginButton();
		System.out.println("Login button clicked");
	   
	}
	@Then("the user should see the home page")
	public void the_user_should_see_the_home_page() {
		 System.out.println("User is on home page");
	}



}
