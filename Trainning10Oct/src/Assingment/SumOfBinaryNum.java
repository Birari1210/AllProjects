package Assingment;

import java.util.Scanner;

public class SumOfBinaryNum {

	static int index = 0;
	static int ind = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();

		int decimal = convertBinaryToDecimal(num1);
		int decimal1 = BinaryToDecimal(num2);

		int sum = decimal + decimal1;
		int arr[] = new int[10];

		decimalToBinary(sum, arr);

	}

	public static void decimalToBinary(int sum, int arr[]) {
		{
			while (sum > 0) {
				arr[index++] = sum % 2;
				sum = sum / 2;
				// decimaltobinary(num);
			}
			for (int i = index - 1; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}
	}

	public static int convertBinaryToDecimal(int num) {
		int N = 0;
		int i = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			num = num / 10;
			N += r * Math.pow(2, i);
			++i;
		}
		return N;
	}

	public static int BinaryToDecimal(int num) {
		int N = 0;
		int i = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			num = num / 10;
			N += r * Math.pow(2, i);
			++i;
		}
		return N;
	}

}
