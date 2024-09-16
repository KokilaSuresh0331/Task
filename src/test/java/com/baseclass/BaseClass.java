package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	public WebDriver driver=new ChromeDriver();
	  public void launchBrowser(String url) {
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
	        driver.get(url);
	}
	public void quitBrowser() {
		driver.close();
	}
	public String title() {
		String title = driver.getTitle();
		return title;
	}
	
	public void currentUrl() {
	driver.getCurrentUrl();
	}
	public WebElement usingName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	public WebElement usingID(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	public WebElement usingClass(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}
	public WebElement usingXpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
	}
	
	public WebElement usingTagName(String attributValue) {
		WebElement element = driver.findElement(By.tagName(attributValue));
		return element;
	}
	
	public void buttonClick(WebElement element) {
		element.click();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public void minimizeWindow() {
		driver.manage().window().minimize();

	}
	public void enterValue(WebElement element) {
		element.sendKeys("Data");

	}
}
