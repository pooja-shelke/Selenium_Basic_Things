package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkText {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		String text =driver.findElement(By.linkText("Forgotten password?")).getText();
		
		System.out.println("Page first title "+text);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		

		driver.findElement(By.partialLinkText("account?")).click();
		

		String str=driver.findElement(By.partialLinkText("account?")).getText();
		System.out.println("Page Second "+str);
		
	
	
		
		//driver.close();
	}
	

}
