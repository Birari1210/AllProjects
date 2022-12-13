package java8Assingment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarksAss2 {
	
	public static void main(String[] args) {
		
		Collection<Integer> marks = Arrays.asList(60, 60, 30, 39, 55, 55,59, 56);
		List<Integer> distinc = marks.stream().distinct().collect(Collectors.toList());
		System.out.println("Uniqe element"+distinc);

	}
}
//WAP to implement predicate to check given no is even or not
