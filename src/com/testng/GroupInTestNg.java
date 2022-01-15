package com.testng;

import org.testng.annotations.Test;

public class GroupInTestNg {
	
	@Test(groups= {"smokeTest"})
	public void smokeTest()
	{
		System.out.println("Inside smokeTest");
	}
	
	@Test(groups= {"regressionTest"})
	public void regressionTest()
	{
		System.out.println("Inside regressionTest");
	}
	
	@Test(groups = "sanityTest")
	public void sanityTest()
	{
		System.out.println("Inside sanityTest");
	}
	
	@Test(groups= {"smokeTest","sanityTest"})
	public void smokeAndsanityTest() {
		System.out.println("Inside smoke-sanityTest");
	}
}
