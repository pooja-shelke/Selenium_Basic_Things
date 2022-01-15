package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametarizationInTestNg {
	
	@Test
	@Parameters("data")
	public void Test1(String s) {
		System.out.println("Inside Test1");
	}

}
