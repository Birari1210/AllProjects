package java8Assingment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//9 WAP to implement predicate to check given list of array contain how many even and odd nos
public class EvenOrNotAss9 {
	public static void main(String[] args) {

	int arr[] = {45,23,44,54,79,99};
	
	int evenNo=0;
	int oddNo=0;
	
	Predicate<Integer> aslist =n->(n%2==0);
	
	for(int i=0;i<arr.length;i++)
	{
		if(aslist.test(arr[i]))
		{
			evenNo++;
		}
		else
			oddNo++;
	}
	    System.out.println("Total Even number="+evenNo);
	    System.out.println("Total odd number ="+oddNo);
		
 }
}
