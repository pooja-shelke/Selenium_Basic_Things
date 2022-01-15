package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("pujashelke@gmail.com");	
		
		driver.findElement(By.id("pass")).sendKeys("Puja@123$");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
		
	}
	

}
