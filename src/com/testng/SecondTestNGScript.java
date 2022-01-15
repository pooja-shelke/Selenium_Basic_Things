package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestNGScript {

	
	@Test
	public void startApp()
	{
		
	    
	}
	
	@Test(dependsOnMethods = "startApp")
	public void loginApp()
	{
		System.out.println("loginApp Running........");
	}

	@Test(dependsOnMethods = "loginApp")
	public void logout()
	{
		System.out.println("logout Running........");
	}

}
