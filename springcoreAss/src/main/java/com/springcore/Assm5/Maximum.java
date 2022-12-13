package com.springcore.Assm5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Maximum {
	
	private Integer[] myArray;
	
//	public List<Integer> mylist;
//	public Maximum(List<Integer> mylist) {
//		super();
//		this.mylist = mylist;
//	}

//	public List<Integer> getMylist() {
//		return mylist;
//	}
//
//	public void setMylist(List<Integer> mylist) {
//		this.mylist = mylist;
//	}

	public Maximum(Integer[] myArray) {
		super();
		this.myArray = myArray;
	}

	public Integer[] getMyArray() {
		return myArray;
	}

	public void setMyArray(Integer[] myArray) {
		this.myArray = myArray;
	}
	

public void Max()
{
	for (int i = 0; i < myArray.length; i++)
	{
		//Optional<Integer> maxi = Arrays.stream(myArray).max();
		System.out.println(myArray[i]);
	}

//	public void Max()
//	{
//		
//		for (int i = 0; i <mylist.lastIndexOf(mylist); i++)
//			{
//				System.out.println(mylist);
//			}
//	 List<Maximum> list = new ArrayList<Maximum>();
//	 System.out.println(list);
	 
  }
}
