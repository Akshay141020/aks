package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountAndist {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")
	private WebElement acclist;

	@FindBy(className = "a-expander-prompt")
	private WebElement needhelplink;
	@FindBy(id = "ap_email")
	private WebElement mob;
	@FindBy(id = "continue")
	private WebElement countineTab;
	@FindBy(id="ap_password")
	private WebElement passbox;
	@FindBy(id="signInSubmit")
	private WebElement passtab;

	public AccountAndist(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void accountList() {
		acclist.click();
	}

	public void needHelp() {
		needhelplink.click();
	}

	public void mobileNum(String mobnum) {
		mob.sendKeys(mobnum);
		countineTab.click();
	}

	public void passwordbox(String pass) 
	{
		passbox.sendKeys(pass);
		passtab.click();
	}
}
