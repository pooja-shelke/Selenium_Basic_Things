package com.testng;

import org.testng.annotations.Test;

public class DemoTest {
	
     public void fun()
     {
    	 System.out.println("DemoTest");
     }

}

class DemoSuper extends DemoTest
{
	public void gun()
	{
		super.fun();;
		System.out.println("DemoSuper");
	}
	public static void main(String[] args) {
		
		DemoSuper t=new DemoSuper();
			
	}
}
