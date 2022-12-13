package com.training.Java8.Assingment;

interface lambda
{
	void quick_sort();
}
public class Question_9 {

	public static void main(String[] args) {
		lambda obj2 = () -> {
		
		int a[]= {10,50,80,100,90,0};
		int index=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			index=i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[index]>a[j])
				{
					index=j;
				}
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	};
	obj2.quick_sort();
	}
}
