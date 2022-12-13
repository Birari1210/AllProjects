package com.springcore.ass5;

import java.util.List;
//WAP to inject n numbers to a bean and find out the maximum out of them using stream 
//operator
//
public class Maximum {
	
	List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public void show()
	{
		numbers.stream().forEach(System.out::println);
	}
	
	public void maxNumber()
	{
		int cname = numbers.stream().max((a,b)->a>b?1:-1).get();
		System.out.print("maximum number is :"+cname);
		
	}
}
