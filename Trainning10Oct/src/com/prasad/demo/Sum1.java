package com.prasad.demo;

public class Sum1 {

	public static void printmaster(int n)
	{
		if(n<1)
			return;
			printmaster(n-1);
			
			System.out.println(n+" ");
	}
	
	public static void printmaster1(int m)
	
	{
		if(m<1)
			return;
		System.out.print(m+" ");

		printmaster1(m-1);
					
	}
	
	public static void main(String[] args) {
		
		int sum =0;
		
		for(int i=1;i<=10;i++)
		 sum+=i;
        System.out.println("  ");
        
		System.out.println("the sum of frist 10 natural number");

		Sum1.printmaster(10);
		Sum1.printmaster1(10);
	}

}
