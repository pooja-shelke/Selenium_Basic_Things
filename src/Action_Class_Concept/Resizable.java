package Action_Class_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		Actions action=new Actions(driver);
		
		WebElement resizable=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

		action.dragAndDropBy(resizable, 230, 550).build().perform();
		
	}

}
