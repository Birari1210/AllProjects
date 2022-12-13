package java8Assingment;

import java.util.Scanner;
import java.util.function.Predicate;

public class Assingment8 {
	public static boolean method(int number) {
		Predicate<Integer> evnOrnot = e -> (e % 2 == 0);
		return evnOrnot.test(number);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number -");
		int num = sc.nextInt();

		if (Assingment8.method(num) == true) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}

	}

}
