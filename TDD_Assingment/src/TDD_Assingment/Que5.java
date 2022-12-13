package TDD_Assingment;

import java.util.Scanner;

public class Que5 {

	public static boolean Pythagoras()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three number for Pythagoras");
	int a[]= new int[3];
	for(int i=0;i<a.length;i++)
	{
	    a[i] = sc.nextInt();
	}
	
		for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					for(int k=j+1;k<a.length;k++)
					{
						if(a[i]*a[i]==(a[j]*a[j] + a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i] + a[k]*a[k]) || a[k]*a[k]==(a[j]*a[j] + a[i]*a[i]))
							{
								return true;
							}
					}
				}
			}
			return false;
		}
}
