package Action_Class_Concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement dragAmt_1 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement dropAmt_1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		action.dragAndDrop(dragAmt_1, dropAmt_1).build().perform();
		
		WebElement dragSales = driver.findElement(By.xpath("// a[text()=' SALES ']"));
		WebElement dropSales = driver.findElement(By.xpath("//ol[@id='loan' ]"));
		action.dragAndDrop(dragSales, dropSales).build().perform();


		WebElement dragAmt_2 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement dropAmt_2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		action.dragAndDrop(dragAmt_2, dropAmt_2).build().perform();
		
		
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	    System.out.println(list.size());

	}

}
