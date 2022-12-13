package com.springcore.ass1;

//1. WAP in spring core to demonstrate role based object creation using factory method.

public class Myclass {

	private Myclass() {
	}

	public static Myclass getObjA() // factory method
	{
	    return new Myclass();
	    
	}
	
	public void display()
	{
		System.out.println("using factory Method Object is created");
	}
}
