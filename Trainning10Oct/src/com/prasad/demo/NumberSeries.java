package com.prasad.demo;

public class NumberSeries {

	public static void main(String[] args) {

		for(int i=0;i<=4;i++)
		{
			int num=1;
			for(int j=0;j<9;j++)
			{
				if(i+j>=4 && j-i<=4)
				{
					System.out.print(num);
				
				if(j<4)
					num++;
				else
					num--;
				}
				else
					System.out.print(" ");
				}
			System.out.println();
		}
	}

}


