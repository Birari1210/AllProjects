package com.training.collection;

import java.util.Scanner;

public class RemoveOvels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		
        String s = sc.next();
		
		String s1 ="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch =s.charAt(i);
			if(ch!='a' && ch!='e' &&ch!='i' &&ch!='o' && ch!='u' && ch!='A' && ch!='E' &&ch!='I' &&ch!='O' && ch!='U')
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
		

	}
	

}
