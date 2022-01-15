package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogInTestNg {

	@Test
	public void login()
	{
		Reporter.log("Set setting varible forweb driver",true);
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		
		Reporter.log("Launch chorome driver");
		 WebDriver driver=new ChromeDriver();
		 
		 Reporter.log("Maximize window of launched browser",true);
		 driver.manage().window().maximize();
		 
		 Reporter.log("navigate to website that you are inserted",true);
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 
		 Reporter.log("set username using name locator",true);
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 
		 Reporter.log("set password using name locator",true);
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 
		 Reporter.log("click the LOGIN button ",true);
		driver.findElement(By.name("Submit")).click();
		
		Reporter.log("click the Welcome abcd button ",true);
		driver.findElement(By.id("welcome")).click();

	}
}
