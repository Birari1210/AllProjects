package com.springcore.ass7;

//7. WAP to merge two Array from two different class. Two array will get values from the xml file 
//and now find maximum out of the merge arra
public class Class1 {
	
	int a[] = new int[4];
	
	Class2 c2obj; // obj2

	

	public Class1(int[] a, Class2 c2obj) {
		super();
		this.a = a;
		this.c2obj = c2obj;
	}

	public void merge() {
		
		int c[] = new int[a.length + c2obj.b.length]; 
		int cindex = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < a.length)
				c[cindex++] = a[i];
			if (i < c2obj.b.length)
				c[cindex++] = c2obj.b[i];
		//	System.out.println(c[i]);
		}
		System.out.println("index of array after merge is -"+cindex);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < c.length; i++) {
			if (max < c[i])
				max = c[i];
		}
		System.out.println("maximum value is :" + max);
	}
}
