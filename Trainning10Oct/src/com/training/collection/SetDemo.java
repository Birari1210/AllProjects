package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(80);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);

		Set<Integer> union = new HashSet<Integer>();
		union.addAll(s);
		union.addAll(s2);

		Set<Integer> intersection = new HashSet<Integer>();
		intersection.addAll(s);
		intersection.retainAll(s2);

		System.out.println("union of set ");
		for (Integer in : union) {
			System.out.print(in + " ");
		}

		System.out.println("\nintersection of set ");

		for (Integer n : intersection) {
			System.out.print(n + " ");
		}

	}

}

// In company ram, sham & amitabh work on java. sachin, sham, abhitab & jatin work on react, Ramesh, Suresh,Karan.
// find the number of emp in orgnization,
// find the number of emp java & react;
// work on java but not in react
// find number of employee in bench;
