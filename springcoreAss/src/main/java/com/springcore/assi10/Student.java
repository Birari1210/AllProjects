package com.springcore.assi10;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;

public class Student {
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public Student(HashMap<String, Integer> map) {
		super();
		this.map = map;
	}

	void show() {
		System.out.println("Sorted list based on name:-");
		ArrayList<String> sortKeys = new ArrayList<String>(map.keySet());
		Collections.sort(sortKeys);
		for (String x : sortKeys)
			System.out.println("Name = " + x + ", Marks = " + map.get(x));
	}
}
