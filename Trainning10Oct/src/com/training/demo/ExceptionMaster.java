package com.training.demo;

import java.util.Scanner;

class Demo{
	int a;
}
public class ExceptionMaster {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 number");
		int a =sc.nextInt();
		System.out.println("Enter 2 number");
		int b = sc.nextInt();
		
		int arr[]= {10,20};
		try {
			
		System.out.println(a+" is divided by "+b+ " is " +a/b);
			
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(arr[2]);

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			Demo a1=null;
			System.out.println(a1.a);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello Exception");
	}

}
