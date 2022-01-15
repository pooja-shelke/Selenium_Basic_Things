package Action_Class_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//Insert username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		//Insert password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		//Perform click operation
		driver.findElement(By.id("btnLogin")).click();

		// move to Admin->User_management-User
	
		Actions action=new Actions(driver);
		
		WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule' ]"));
		action.moveToElement(admin).build().perform();
		
		WebElement userManagement=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		action.moveToElement(userManagement).build().perform();
		
		WebElement user=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		user.click();
		
		
		
		
		
		/*
		 * //perform clock operations on amdin
		 * driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 * 
		 * //perform click operations on usermanagement
		 * driver.findElement(By.id("menu_admin_UserManagement")).click();
		 * 
		 * //Perform click operations on user we will get table
		 * driver.findElement(By.id("menu_admin_UserManagement")).click();
		 */
		//Count number of rows of the table
		
		  int R = driver.findElements(By.xpath(
		  "/html/body/div/div/div/div/div/form/div/table/tbody/tr")).size();
		  
		  System.out.println("Number of rows " + R);
		  
		  int EnableCounter = 0; int disableCounter = 0;
		  
		  for (int i = 1; i <= R; i++) { String status = driver.findElement( By.xpath(
		  "/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr["
		  + i + "]/td[5]")) .getText(); System.out.println(status); if
		  (status.equals("Enabled")) { EnableCounter++; } else { disableCounter++; } }
		  System.out.println("Number of EnableCounter is: " + EnableCounter);
		  
		  System.out.println("Number of disableCounter is: " + disableCounter);
		  
		  driver.close();
		 

	}

}
