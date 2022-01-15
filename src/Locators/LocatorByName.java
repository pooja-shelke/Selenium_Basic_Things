package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		Thread.sleep(2000);
		
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(-2000);
		
		driver.findElement(By.name("email")).sendKeys("pujashelke@gmail.com");	
		
		driver.findElement(By.name("pass")).sendKeys("Puja@123$");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
	//	driver.close();
		
	}
	

}
