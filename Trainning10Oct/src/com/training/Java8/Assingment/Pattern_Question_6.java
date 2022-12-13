package com.training.Java8.Assingment;

interface lambda1 {
	void m1();
	
}

public class Pattern_Question_6 {
	
	public static void main(String s[]) {
		lambda1 obj2 = () -> {

			for (int i = 0; i < 6; i++)
			{
				
				for (int j = 0; j < 11; j++)
				{
					if (j + i <= 5) 
					{
						System.out.print((char) (j + 65));
					} 
					else if (j - i >= 5) 
					{
						System.out.print((char) (75 - j));
					} 
					else 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		};
		obj2.m1();
	}

}
