package Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		
		 WebDriver driver=new ChromeDriver();//It will launch Firebox browser

		//It will navigate to Facebook
		driver.get("http://www.facebook.com/");

	}

}
