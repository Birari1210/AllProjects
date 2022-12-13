package com.test.java;

public class ComplexNumber {

	public int[] Addition(int real1, int real2, int image1, int image2)
	{
		int arr[] = new int[2];
		
		arr[0] = real1 + real2;
		arr[1] = image1 + image2;
		
		return arr;
	}

	public static void main(String[] args) {

		ComplexNumber c = new ComplexNumber();

		int[] arr = c.Addition(20, 15, 5, 10);
		int[] arr1 = c.Addition(1, 5, 5, 10);

		System.out.println("Addition of two complex number " + arr1[0] + " + " + arr1[1] + "i");

		System.out.println("The complex number "+arr[0] + " + " + arr[1] + "i");
	}

}
