package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestNG {
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(12,13);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(12, 13,"Dropdown count does no match please check once");
	}

}
