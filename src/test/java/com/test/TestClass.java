package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Utilitydata;
import com.base.BrowserlaunchClass;
import com.pom.AccountAndist;
import com.pom.CustserviceTabvalidation;

public class TestClass extends BrowserlaunchClass

{

	WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = BrowserlaunchClass.openChromeBrowser();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = BrowserlaunchClass.openEdgeBrowser();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifyCustservice() throws InterruptedException, IOException {
		CustserviceTabvalidation Lpage = new CustserviceTabvalidation(driver);// Question-how do you maintain pom class
																				// and test class relation ANS-we
		// give arg "driver" to test class to constructor we have initialized in
		// pom
		// class
		Lpage.custserviceTab();
		// Utilitydata.screenshot(driver);

	}

	@Test(priority = 2)
	public void verifyAccountAndist() throws IOException {
		AccountAndist aclist = new AccountAndist(driver);
		String mobnum = Utilitydata.datafile(0, 0);
		String pass = Utilitydata.datafile(1, 0);
		aclist.accountList();
		aclist.needHelp();
		aclist.mobileNum(mobnum);
		aclist.passwordbox(pass);
		// Utilitydata.screenshot(driver);
	}

	@AfterMethod
	public void browserclose(ITestResult result) throws IOException {
		if (ITestResult.SUCCESS == result.getStatus()) {
			Utilitydata.screenshot(driver);
		}
	}

}
