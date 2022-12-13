package com.prasad.demo;

public class NumberPattern {

	public static void main(String[] args) {

		int r=4;
		int i,j;
		
		for(i=1;i<=r;i++)
		{
			for(j=i;j<=r;j++)
				System.out.print(" ");
			
			for(j=1;j<=i;j++)
				System.out.print(j+"");
			
			for(j=i-1;j>=1;j--)
				System.out.print(j+"");
			System.out.println();
		}
	
	}

}
