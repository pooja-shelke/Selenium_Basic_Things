package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_1_ {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();//

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		String Title1 = driver.getTitle();

		System.out.println(Title1);

		driver.findElement(By.xpath("//input[@type='text' and @name='_nkw'] ")).sendKeys("Laptop");

		WebElement eSelect = driver.findElement(By.xpath("//select[@name='_sacat'] "));
		Select select = new Select(eSelect);
		select.selectByVisibleText("Computers/Tablets & Networking");

		driver.findElement(By.xpath("//input[@type='submit'] ")).click();

		String Title2 = driver.getTitle();

		System.out.println(Title2);

		driver.findElement(By.xpath("//a[starts-with(text(),'My eBay')]")).click();

		String Title3 = driver.getTitle();

		System.out.println(Title3);

	}

}
