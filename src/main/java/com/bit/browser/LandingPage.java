package com.bit.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.utils.Util;

public class LandingPage 
{
	WebDriver driver;
	LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeUserId()
	{
		Util.type(driver, By.id("email"), "userID");
	}
	public void typePass()
	{
		Util.type(driver, By.id("pass"), "pass");
	}
	public ProfilePage clickLogInButton()
	{
		Util.click(driver, By.id("u_0_e"));
		return new ProfilePage(driver);
	}

}
