package Akash_Batch_12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://www.ebay.com/");
		 
		 //We find number of links on the page
		 // <a> tag represent link in the html
		 List<WebElement> l=driver.findElements(By.tagName("button"));
		 
		 System.out.println(l.size());
		 
		 for(int i=0;i<l.size();i++)
		 {
			 String LinkElement=l.get(i).getText();
			 System.out.println(LinkElement);
		 }

	}

}
