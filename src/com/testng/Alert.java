package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {

	@Test
	 public void alert() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

		WebDriver driver = new ChromeDriver();// Launch web browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);

		org.openqa.selenium.Alert a = driver.switchTo().alert();

		String str = a.getText();

		System.out.println(str);

		a.accept();
		
		//driver.close();

	}

}
