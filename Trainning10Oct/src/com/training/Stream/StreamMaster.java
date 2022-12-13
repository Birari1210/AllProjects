package com.training.Stream;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		List<Integer> list = Arrays.asList(arr);
		
	      System.out.println(list.stream().reduce(0, (a,b)->a+b));
	      
	      //print the sum of squares of all the odd numbers.
	      System.out.println(list.stream().filter((e)->e%2!=0).map((e)->e*e).reduce(0,(a,b)->a+b));
	      
	      //myList.stream().forEach((e)->System.out.print(e+"   "));
		
		//list.stream().forEach((e -> System.out.print(e+" ")));
		System.out.println();
		
		//list.stream().map((e)->e*e).forEach((e) -> System.out.print(e+" "));
		System.out.println();
		//list.stream().filter((e)->e%2==0).map((e)->e*e).forEach((e) -> System.out.print(e+" "));

		
		List<String> name = new ArrayList<>();
		name.add("prasad");
		name.add("john");
		name.add("jiil");
		name.add("jim");
		
//		name.stream().filter((n)->n.startsWith("j") && n.length()==4).forEach((n)->System.out.println(n));
//		
//		List<String> nameStart = name.stream().filter((n)->n.startsWith("j")).collect(Collectors.toList());
//		
//		nameStart.stream().forEach((n)->System.out.print(n));
//		
		List<String> names = name.stream().filter((n)->n.startsWith("j")).map((n)->n.toUpperCase()).sorted().collect(Collectors.toList());
		names.stream().forEach((n)->System.out.println(n));
		
		System.out.println(names.stream().reduce("", (a,b)->a+"-"+b));
	}

	
}
