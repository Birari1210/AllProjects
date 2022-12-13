package java8Assingment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//3. WAP to take name of employee, sort all employee name using stream and print only unique 
//name from it.
public class Employee_Ass3 {

	public static void main(String[] args) {

		List<String> emp = Arrays.asList("prasad","rajesh","Rakesh","rajesh","prasad");
		
		List<String> sortedList = emp.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
	    System.out.println(sortedList);
	}
}
