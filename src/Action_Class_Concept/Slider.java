package Action_Class_Concept;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.get("http://testautomationpractice.blogspot.com/");
//		
//		Actions action=new Actions(driver);
//		
//		WebElement slider=driver.findElement(By.xpath(" //div[@id='slider' ]/span"));
//		
//		action.dragAndDropBy(slider, 300, 0).build().perform();
//		
//		driver.close();
//	}
	
	
	WebDriver driver;
	@Before
	public void startUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		Actions action=new Actions(driver);
		
		WebElement slider= driver.findElement(By.xpath("//div[@id='red']/span"));

		action.dragAndDropBy(slider, 210, 0);
	}

	
	
	
}
