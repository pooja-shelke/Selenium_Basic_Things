package Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Launch {

	public static void main(String[] args) {
		
		//Setting up system variable path for firebox
		System.setProperty("webdriver.gecko.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/geckodriver");
		 WebDriver driver=new FirefoxDriver();//It will launch Firebox browser

		//It will navigate to Facebook
		driver.get("http://www.facebook.com/");
	}

}
