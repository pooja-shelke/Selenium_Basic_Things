package Akash_Batch_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://www.facebook.com/");
		 
		 //Dynamic id-When we refresh the page id will change
		 //u_0_2_yV
		 //u_0_2_NK
		 //u_0_2_11
		 driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2_')]")).click();
		 


	}

}
