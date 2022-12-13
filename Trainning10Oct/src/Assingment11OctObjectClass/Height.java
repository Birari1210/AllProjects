package Assingment11OctObjectClass;

import java.util.Scanner;

public class Height {
	
    double feet;
	double inches;
		
	public void convertFeetToInches(int h1, int h2)
	{
		int sum=h1+h2;
		inches=sum*12;
		System.out.println("Total Heigth in Inches is = "+inches);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Heigth in feet");
		int f = sc.nextInt();
		
		System.out.println("Enter second heigth in feet");
		int f1 = sc.nextInt();
		Height hi = new Height();
		hi.convertFeetToInches(f, f1);
		
	}
}
