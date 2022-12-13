package com.training.exception.assingment;

import java.util.Arrays;
import java.util.Scanner;
//7 WAP to demonstrate exception chaining

public class ExceptionChaining {

	public void CheckExeptionChaining() 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 2, 0, 8 };
		System.out.println("Array: " + Arrays.toString(arr));
		
		System.out.println("Choose numerator and denominator(not 0) from this array (enter positions 0 to 5)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int result = (arr[a]) / (arr[b]);
			
			System.out.println("Result of " + arr[a] + "/" + arr[b] + ": " + result);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			throw new IndexOutOfBoundsException();
			
		}
		catch (ArithmeticException ae) {
			throw ae;
		}
	}

	public static void main(String[] args) {
		new ExceptionChaining().CheckExeptionChaining();
	}

}
