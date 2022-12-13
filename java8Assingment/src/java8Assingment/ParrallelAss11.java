package java8Assingment;

import java.util.stream.IntStream;

//11. wap to perform parrallel stream api to find the no.
public class ParrallelAss11 {

	public static void main(String[] args) {
		
		System.out.println("Normal");
		IntStream range = IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);
		
		System.out.println("Parallel");
		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.forEach(System.out::println);
	}

}
