package Akash_Batch_12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		System.out.println("Page 1 :"+driver.getTitle());

		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shaikh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Poojashaikh@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Poojashaikh@gmail.com");		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pooja@");
	
		
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select select1=new Select(day);
		select1.selectByVisibleText("10");
		

		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select select2=new Select(month);
		select2.selectByVisibleText("Feb");
		

		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select select3=new Select(year);
		select3.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("90909090909");
		
		driver.findElement(By.xpath("//button[@id='did_submit']")).clear();
		
		
		//driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}

}
