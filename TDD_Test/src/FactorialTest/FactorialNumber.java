package FactorialTest;

import java.util.Scanner;

public class FactorialNumber {
	
	public static int Factorial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();

		//int num=5
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			 fact = fact*i;
		}
		//System.out.println("Factotial is "+fact);
		return fact;
		
	}
//	public static void main(String[] args) 
//	{
//		int a=Factorial();
//		System.out.println(a);
//	}

}
