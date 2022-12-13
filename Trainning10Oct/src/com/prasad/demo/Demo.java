package com.prasad.demo;

public class Demo {

	public static int  max(int a ,int b)
	{
		return a>b?a:b;
	}
	
	public static int max2(int a,int b,int c)
	{
		return a>b?a:b;
	}
	public static void main(String[] args) {

		
		int a=10;
		int b=50;
		int c=30;
		int d=40;
		
		
		System.out.println("Hello java");
		
		System.out.println("the value of a"+a);
		System.out.println("the value of b"+b);
		System.out.println("the value of c"+c);
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is gretest");
			}
			else
				System.out.println("c is gretest");
		}
		else {
			if(b>c)
			{
				System.out.println("b is gretest");
			}
			else
				System.out.println("c is  gretest");

		}
		
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		
		System.out.println("max "+Demo.max(a, Demo.max(b, c)));
		
		System.out.println(Demo.max(a, Demo.max(b, Demo.max(c, d))));
	}

}

