package Assingment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary number");
		
		int num = sc.nextInt();
		
		int decimal = convertBinaryToDecimal(num);
		System.out.println("Binary to Decimal");
		System.out.println(num +" = "+ decimal);
	}
	
	public static int convertBinaryToDecimal(int num)
	{
		int N=0;//decimal
		int i=0;
		int r;
		
		while(num!=0)
		{
			r= num%10;
			num=num/10;
			N +=r*Math.pow(2, i);
			++i;
		}
		return N;
	}

}
