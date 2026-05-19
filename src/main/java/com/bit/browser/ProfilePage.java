package com.bit.browser;

import org.openqa.selenium.WebDriver;

public class ProfilePage 
{
	WebDriver driver;
	ProfilePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyProfilePage()
	{
		 System.out.println("login properly");
		    driver.quit();
	}

}
