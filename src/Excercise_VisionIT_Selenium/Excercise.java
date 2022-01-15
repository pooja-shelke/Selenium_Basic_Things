package Excercise_VisionIT_Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excercise {

	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num=sobj.nextInt();
	
	
	switch(num)
	{
		case 1:
		{
			
			System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
			 WebDriver driver=new ChromeDriver();
			
		}
		case 2:
		{
			System.setProperty("webdriver.gecko.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/geckodriver");
			 WebDriver driver=new FirefoxDriver();
		}
		default:
		{
			System.out.println("Enter Only 1 or 2");
		}
	}
	

	}

}
