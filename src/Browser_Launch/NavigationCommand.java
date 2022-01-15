package Browser_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.facebook.com");
//		
//		System.out.println(driver.getTitle());
//		
		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		
//		System.out.println(driver.getTitle());
//		
//		Thread.sleep(2000);
//				
		driver.navigate().back();
//		
//		System.out.println(driver.getTitle());
//		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.close();

	}

}
