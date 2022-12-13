package com.prasad.demo;

import java.util.Scanner;

public class SqureRootOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int n = sc.nextInt();
		
		Double square= Math.pow(n, 0.5);
		System.out.println("Square root is"+square);
		//System.out.println(Math.sqrt(n));
	}

}
