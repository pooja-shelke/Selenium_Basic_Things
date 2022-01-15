package Akash_Batch_12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		//It will wait 20 second before failure the test
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement textBox1 = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		textBox1.sendKeys("Pooja");

		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Shelake");

		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ahmednagar");

		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Puja@gmail.com");

		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9890451568");

		driver.findElement(By.xpath("//input[@ng-model='radiovalue' and  @value='FeMale']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();

		driver.findElement(By.id("checkbox2")).click();
		

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		


		List<WebElement> multilist=driver.findElements(By.xpath("//ul/li[@class='ng-scope']"));
		
		
		for(int i=0;i<multilist.size();i++)
		{
			String language=multilist.get(i).getText();
			
			if(language.equals("French"))
			{
				driver.findElement(By.xpath("//a[contains(text(),'French')]")).click();
			}
		}
		
		
		System.out.println(multilist.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Find web-element
		WebElement skills = driver.findElement(By.id("Skills"));

		// select list of the webelement
		Select skilloption = new Select(skills);

		// select particular text of that web-element list
		skilloption.selectByVisibleText("Android");

		driver.findElement(By.xpath("//span [@role='combobox']")).click();
//
		driver.findElement(By.xpath("//input [@type='search']")).sendKeys("India");
//		;
//		driver.findElement(By.xpath("//li [@role='c']")).click();
		 driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select yearOption = new Select(year);
		yearOption.selectByVisibleText("1997");

		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select monthOption = new Select(month);
		monthOption.selectByVisibleText("May");

		WebElement day = driver.findElement(By.id("daybox"));
		Select dayList = new Select(day);
		dayList.selectByVisibleText("26");
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");
		
		//Upload file
		WebElement e=driver.findElement(By.xpath("//input[@type='file']"));
		e.sendKeys("/home/shelke/Desktop/mahesh.pdf");
		
		
		
		
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		driver.close();

	}

}
