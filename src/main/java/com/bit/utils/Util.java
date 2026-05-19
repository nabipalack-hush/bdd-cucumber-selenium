package com.bit.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Util 
{
	public static void type(WebDriver driver,By by,String text)
	{
		
		driver.findElement(by).sendKeys(text);
	}
	public static void click(WebDriver driver,By by)
	{
		driver.findElement(by).click();
	}

}
