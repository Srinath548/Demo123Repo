package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DemoTest {
	
	@Test
	public void sum()
	{		
		System.out.println("Addition");
		int a=250;
		int b=30;
		int c=20;
		int d=40;
		int e=60;
		int f=200;
		Assert.assertEquals(700, a+b+c+d+e+f);		
		
		System.out.println("...Test done....");
	}
	
	@Test
	public void substraction()
	{		
		System.out.println("Substraction");
		int a=50;
		int b=70;
		Assert.assertEquals(20, b-a);		
	}
	
	@Test
	public void div()
	{	
		System.out.println("Division");
		int a=80;
		int b=20;
		Assert.assertEquals(4, a/b);		
	}
	
	@Test
	public void multi()
	{		
		System.out.println("Multiplication");
		int a=5;
		int b=10;
		Assert.assertEquals(50, a*b);		
	}
	
	

}
