package com.bit.browser;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		driver=new ChromeDriver();
	}
	public void openAnyBrowser(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.out.println("open chrome browser");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("open firefox browser");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("open ie browser");
		}
	}
	public LandingPage nevigateURL()
	{
		driver.get("http://www.facebook.com");
		return new LandingPage(driver);
	}

}
