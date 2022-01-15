package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionInTestNg {
	
	@Test
	public void Test1() {
		
		SoftAssert assertObject=new SoftAssert();
		
		System.out.println("Test-1 Started");
		assertObject.assertEquals("Hi", "Hi");
		System.out.println("Test-1 Completed");
		assertObject.assertAll();
	
		
	}
	
	@Test
	public void Test2() {

		System.out.println("Test-2 Started");
		
		Assert.assertEquals("Hi", "Hi");
		
		System.out.println("Test-2 Completed");
	}
	
	

}
