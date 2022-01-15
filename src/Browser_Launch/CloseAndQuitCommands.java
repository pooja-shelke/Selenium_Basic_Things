package Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitCommands
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver=new ChromeDriver();//Launch window
		
		driver.manage().window().maximize();
		
	    driver.get("http://www.naukri.com");//Navigate to youtube
	    
	    //driver.close();//Because of driver.close() method only parent window closed and remaining child window are opened.
	    
	    driver.quit();//all windows are closed
	    

	    
	}

}
