package Practise;

import java.util.Iterator;

public class ArraySort {

	public static void main(String[] args) {

		int a[] = {10,20,50,40,30};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					    a[i] = a[j];
					    a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
