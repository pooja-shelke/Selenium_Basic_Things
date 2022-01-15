package AlertAndPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

		WebDriver driver = new ChromeDriver();// Launch web browser

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);

		org.openqa.selenium.Alert a = driver.switchTo().alert();

		String str = a.getText();

		System.out.println(str);

		a.accept();
		
		//driver.close();

	}

}
