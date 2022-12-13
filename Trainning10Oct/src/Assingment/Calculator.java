package Assingment;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist number ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number ");
		int num2 = sc.nextInt();

		int res = 0;
		System.out.println("Select for operations :- Addition + ,Subtraction - ,Multiplication - ,Division / ");

		char ch = sc.next().charAt(0);
		switch (ch) {
		case '+':
			res = num1 + num2;
			System.out.println("Addition of two numbers: " + res);
			break;
		case '-':
			res = num1-num2;
			System.out.println(" Subtraction of two numbers: " + res);
			break;
		case '*':
			res = num1*num2;
			System.out.println("multiplication of two numbers: " +res);
			break;
		case '/':
			res = num1/num2;
			System.out.println("division of num1 && num2 is : " + res);
			break;

		default:
			System.out.println("Invalid input ");
		}
	}
}
