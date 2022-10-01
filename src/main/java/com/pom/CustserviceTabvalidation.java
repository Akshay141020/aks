package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustserviceTabvalidation {
	WebDriver driver;
	@FindBy(linkText="Customer Service")
	private WebElement custservice;

	public CustserviceTabvalidation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void custserviceTab() throws InterruptedException {
		custservice.click();
		
		//Thread.sleep(20000);
		//driver.navigate().back();
	}
	
}