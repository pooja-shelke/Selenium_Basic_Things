package Action_Class_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		// Creating oject of the actions class in selenium
		Actions action = new Actions(driver);

		// finding webelement using locators of rightclick
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		// Using Actions class object calling contextClick() method
		action.contextClick(rightClick).perform();

		Thread.sleep(2000);
		// After Click right click by using Actions Class it will gives you option
		// find WebElement for click that options
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		//After clicking that option 
		
		String alertText=driver.switchTo().alert().getText();
		
		System.out.println("AlertText is :"+alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//driver.close();

	}

}
