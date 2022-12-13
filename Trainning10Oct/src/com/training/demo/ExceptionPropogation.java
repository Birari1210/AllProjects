package com.training.demo;


public class ExceptionPropogation {

	public static int divide(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
    try
    {
    	System.out.println(ExceptionPropogation.divide(10, 0));
    }
    catch (Exception e) {
    	System.out.println(e.getMessage());
	}
		
	}

}
