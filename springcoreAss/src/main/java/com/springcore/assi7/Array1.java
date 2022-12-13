package com.springcore.assi7;

public class Array1 {
	
	private Integer[] myArray1;

	public Array1(Integer[] myArray1) {
		super();
		this.myArray1 = myArray1;
	}
		
	public Integer[] getMyArray1() {
		return myArray1;
	}

	public void setMyArray1(Integer[] myArray1) {
		this.myArray1 = myArray1;
	}

	public void print()
	{
		for (int i = 0; i < myArray1.length; i++)
		{
			System.out.println(myArray1[i]);
		}

	}
}
