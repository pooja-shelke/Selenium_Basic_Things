package AlertAndPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PupUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

		WebDriver driver = new ChromeDriver();// Launch web browser

		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/shelke/Desktop/Score.pdf");

	
		//driver.close();
	}

}
