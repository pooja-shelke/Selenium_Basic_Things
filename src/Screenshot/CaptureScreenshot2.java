package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class CaptureScreenshot2 {

	@Test
	public void captureScreenshot() throws IOException
	{
		//setting system varible path for third party 
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		
		//Creating object of webdriver to stored ChromeDriver
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.google.com");
		 
		 driver.navigate().to("http://www.facebook.com");
		 
		 captureScreenshot(driver,"fbLogin");
	    
		
		driver.close();
	
	}
	
	//we can take screenshot multiple time
	public void captureScreenshot(WebDriver driver,String Filename) throws IOException
	{
	    TakesScreenshot ts=(TakesScreenshot)driver;
		 
			File srcfile =ts.getScreenshotAs(OutputType.FILE);
			
			File desfile=new File("./Screenshot/"+Filename+".png");
			
			FileHandler.copy(srcfile, desfile);
			
	}

}
