package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com/");
		
		driver.findElement(By.className("gLFyf gsfi")).sendKeys("VisionIT Technology");	
		
	}
	

}
