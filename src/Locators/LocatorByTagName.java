package Locators;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		
		List <WebElement> list_anc= driver.findElements(By.tagName("a"));
	
	     System.out.println(list_anc.size());
	     
	     for(WebElement web:list_anc)
	     {
	    	 
	    	 if(web.getText().equals("Sign up"))
	    	 {
	    		 web.click();
	    		 break;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Nothing like sign up");
	    	 }
	    	
	     }
	     
	//	driver.close();
		
	}
	

}
