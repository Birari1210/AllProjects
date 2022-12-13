package Assingment;

import java.util.Scanner;

public class SumOfBinaryString {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String a = sc.next();
		System.out.println("enter second string");
		String b = sc.next();

		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);

		int sum = x + y;

		//System.out.println(x);
		System.out.println(Integer.toBinaryString(sum));

	}

}
