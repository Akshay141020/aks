package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserlaunchClass {

	public static WebDriver openChromeBrowser() // by making this method static we can call this method directly in Testclass
	{                                      // when we create an object it aquires memory so instead of creating object we
		                                   // made this method staic which we called in testclass and saved memory
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver openEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		return driver;
	}
}
