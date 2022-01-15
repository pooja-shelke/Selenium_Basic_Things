package Action_Class_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		Actions action = new Actions(driver);
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		action.doubleClick(doubleClick).perform();
		
		
	}

}
