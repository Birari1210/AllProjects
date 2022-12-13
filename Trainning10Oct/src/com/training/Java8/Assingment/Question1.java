 package com.training.Java8.Assingment;

import java.util.stream.IntStream;

public class Question1 {
//1. WAP to check the given no is palindrome or not. Don’t use divide method. 
	public  boolean isPalindrome(int number) {

	    return number == IntStream.iterate(number, i -> i / 10)
	    		.map(n -> n % 10).limit(String.valueOf(number).length()).reduce(0, (a, b) -> a = a * 10 + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Question1 q = new Question1();
		boolean palindrome = q.isPalindrome(110);
		System.out.println(palindrome);

	}

}
