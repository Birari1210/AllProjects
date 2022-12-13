package com.test.java;

public class RotedArrayLeft {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		for (int j = 0; j < 2; j++) {
			int temp = a[0];

			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
