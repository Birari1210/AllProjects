package com.prasad.demo;

public class Febonacii {

	public static void main(String[] args) {

		int num=10;
		int a=0;
		int b=1;
		
		int count=0;
		
		while(count<num)//i<10
		{
			System.out.println(a+b);
			int c=a+b;
			 a=b;
			 b=c;
			 count++; 
		}
	}

}
