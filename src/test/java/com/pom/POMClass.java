package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.stepdefinition.StepDefinition;

public class POMClass extends BaseClass {
	public POMClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private  WebElement username;
	
	@FindBy(id="pass")
	private  WebElement password;
	
	@FindBy(name="login")
	private WebElement loginButton;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	}
