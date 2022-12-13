package com.training.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMaster {

	public static void main(String[] args) {
		
		Person p = new Person(10, "Prasad", 30);
		Person p1 = new Person(11, "Nilesh", 32);
		Person p2 = new Person(12, "Prasad", 34);
		Person p3 = new Person(13, "Raj", 22);
		Person p4 = new Person(9, "Jay", 40);
		Person p5 = new Person(8, "akash", 20);
		
		List<Person> persons = Arrays.asList(p,p1,p2,p3,p4,p5);
		
		//Collections.sort(persons,(a1 ,a2 )->a1.getAge()-a2.getAge());
		Collections.sort(persons,(a1 ,a2 )->a1.getName().compareTo(a2.getName()));
		System.out.println(persons);

	}

}
