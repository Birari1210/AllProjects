package Assingment;

import java.util.Scanner;

public class DecimalToBinary {
	
    int arr[] = new int[20];
	int index=0;

   void decimaltobinary(int num)
	{
		while(num>0)
		{
			arr[index++]=num%2;
			num= num/2;	
			//decimaltobinary(num);	
		}
		for (int i =index-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		DecimalToBinary decimalToBinary1 = new DecimalToBinary();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal");
		int num = sc.nextInt();
	    System.out.println("Binary number is : ");
		decimalToBinary1.decimaltobinary(num);

//		System.out.println("Binary number is "+Integer.toString(num,2));
		

	}

}
