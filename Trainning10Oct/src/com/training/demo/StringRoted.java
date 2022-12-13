package com.training.demo;

public class StringRoted {

	public static void main(String[] args) {
         
		String str = "xzm";
		
		char [] c = str.toCharArray();
		int j=0;
		for (int i = 0; i < c.length-1; i++) {
			
			if(i<j)
			{
			char temp=c[i];
			 c[i]=c[j];
			 c[j]=temp;
			 i++;
			 j--;
			}
		}
		
		
	}

}
