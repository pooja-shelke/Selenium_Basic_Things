package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FirstTestNGScript {
	
	
	@Test(priority=1,description = "This apllication verify LoginApplication")
	public void loginApplication()
	{
		System.out.println("LoginApplication -Started");
		
	
	}
	
	@Test(priority=2,description = "Please Add item")
	public void selectItems()
	{
		System.out.println("selectItems -Started");
	}
	
	@Test(priority=-3,description = "Checkout are done")
	public void checkOut()
	{
		System.out.println("checkOut -Started");
	}
	
	

}
