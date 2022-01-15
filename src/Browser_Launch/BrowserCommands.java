package Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome .driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

		WebDriver driver=new ChromeDriver();//Launch window
	    
	    driver.manage().window().maximize();//When launch chrome window and maximize that window
	    
	    driver.get("http://www.youtube.com");//Navigate to youtube

	    
	   String str= driver.getTitle(); //Youtube as an title
	   System.out.println("Title is :"+str);
	   
	   String Current_url = driver.getCurrentUrl();//www.youtube.com/
	   System.out.println("Current Url is:"+Current_url);
	   
//	  String page_source= driver.getPageSource();//it will get source
//	  System.out.println("Page source is:"+page_source);
	  
	  driver.close();

	}

}
