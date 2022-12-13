package Practise;

public class MaxMinArray {

	public static void main(String args[]) {
		int a[] = { 10, 80, 69, 40, 59, 30 };

		int max = Integer.MIN_VALUE;
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

			else if (a[i] > min && a[i] != max) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}
}
