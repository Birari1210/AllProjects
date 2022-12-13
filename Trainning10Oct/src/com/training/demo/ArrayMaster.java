package com.training.demo;

public class ArrayMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		
		for (int i = 0; i <5; i++) {
			System.out.print(i+" ");
			
		}
         System.out.println();
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(i+" ");
		}
		 System.out.println();
		 for (int a : arr) {
			System.out.println(a);
		}
		 
		 
		 int arr1[][] = {{1,2},{3,4},{5,6}};
		 
		 for (int i = 0; i < arr1.length; i++) {
			 for (int j = 0; j < arr1[i].length; j++) 
			 {
				 arr1[i][j]=i+j;
			}
			 System.out.println();
		 }
		 
			 for(int i=0;i<3;i++)
			 {
				 for(int j=0;j<2;j++)
				 {
					 System.out.print(arr1[i][j]+" ");
				 }
				 System.out.println();
			 }
			 
		for(int[] ar : arr1)
		{
			for(int x:ar)
			{
			  System.out.print(x+" ");	
			}
			System.out.println();
		}
		
		
	//	int arr2[][][] = {{1,2,3},{4,5,6},{7,8,9}};
	}

}
