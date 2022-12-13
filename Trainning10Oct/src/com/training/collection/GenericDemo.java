package com.training.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	
     
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}



	
	@Override
	public int compareTo(Student1 o) {
		//return this.age-o.age;
		if(this.name==o.name)
		{
		return 1;
		}
		else
		{
			return-1;
		}
	}
	
	
	
	
}

class  Generic<t>
{
	 int a;

	public Generic(int a) {
		this.a = a;
	}
	 
	public void printValue()
	{
		System.out.println(a);
	}
	 
}



public class GenericDemo {
	
	public static boolean containsOvels(char a) 
	{
		Set<Character> s = new HashSet<Character>();
		
		for (int i = 0; i < s.size(); i++) 
		{
			if(((CharSequence) s).charAt(i)=='a' ||((CharSequence) s).charAt(i)=='e' || ((CharSequence) s).charAt(i)=='i'|| ((CharSequence) s).charAt(i)=='o')
			{
			  
			}
			
		}
		return false;
		
	}
	

	public static void main(String[] args) {

//		List<Student> l = new ArrayList<Student>();
//		l.add(new Student(1,"prasad", 30));
//		l.add(new Student(1, "prasad", 30));
//		l.add(new Student(2, "raj", 20));
//		l.add(new Student(2, "raj", 20));
//		l.add(new Student(3, "nilesh", 40));
//		
//		
//		Set<Student> s = new HashSet<Student>();
//		s.addAll(l);
//		
//		System.out.println("uniqe "+s.size());
//		
//
//		for (Student student : s) {
//			System.out.println(student);
//		}
//		
		
		//System.out.println(l.size());
		
		
//		Generic<Integer> g1 = new Generic(10);
//		g1.printValue();
		
		
		Set<Student1> arr = new TreeSet<Student1>();
		arr.add(new Student1(1,"prasad",10));
		arr.add(new Student1(2,"nilesh",50));
		arr.add(new Student1(3,"jaydeep",40));
		
		for (Student1 a : arr) 
		{
			System.out.println(a+" ");
			
		}

		
		
		
		
		
		
		
	}

}
