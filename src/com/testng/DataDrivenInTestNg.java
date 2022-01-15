package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenInTestNg {

	@DataProvider
	public String[][] createDataDriven()
	{
		String[][] data=new String[3][2];
		
		data[0][0]="Vasant";
		data[0][1]="Rahul";
		
		data[1][0]="Pooja";
		data[1][1]="Amir";
		
		data[2][0]="Pranali";
		data[2][1]="Priyanka";
		
		return data;
	}
	
	@Test(dataProvider = "createDataDriven")
	public void Test1(String s1,String s2)
	{
		System.out.println("-------------------------------");
		System.out.println(s1+"----->"+s2);
	}
	
	
	@DataProvider(name="TestCase")
	public Object[][] createTest1()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="Vasant";
		data[0][1]="9876543210";
		data[0][2]=200000.90;
		
		data[1][0]="Pooja";
		data[1][1]="9876530010";
		data[1][2]=502000.10;
	
		return data;
	}

	@Test(dataProvider = "TestCase")
	public void Test1(String s1,String s2,double d) {
		System.out.println("-------------------------------");
		System.out.println(s1+"-->"+s2+"--->"+d);;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
