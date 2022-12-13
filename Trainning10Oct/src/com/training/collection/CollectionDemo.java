package com.training.collection;

import java.util.ArrayList;
import java.util.List;

//list

class Student
{
	private int id;
	private String name;
	private int age;
	
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Student s = (Student)obj;
		if(s.id==this.id && s.name.equals(this.name) && s.age==this.age)
		{
			return true;
			
		}
		else
		return false;
		
		
	}
	
	
	
	
}

class StudentMaster{
	
	List<Student> arr = new ArrayList<Student>();
	private Student[] s;
	
	public StudentMaster() 
	{

		arr.add(new Student(1, "prasad", 22));
		arr.add(new Student(2, "nilesh", 30));
		arr.add(new Student(3, "lucky", 28));
		arr.add(new Student(4, "raj", 20));
		
	}
	
	public boolean doesExits(Student s)
	{
		boolean  exiest = false;
		for (Student st : this.s) 
		{
			if(st.equals(s))
			{
				exiest =true;
			break;
			}
		}
		return exiest;
	}
	
	
	public void deleteStudent(Student s)
	{
		
		for (int i = 0; i < this.arr.size(); i++)
		{
			for (int j = i+1; j < this.arr.size(); j++) 
			{
				if(i<j)
				{
					
				}
				
			}
			
		}
	}
	
	public void updateStudent(Student s)
	{
		for (int i = 0; i < this.arr.size(); i++)
		{
			if(arr.get(i).getId()==s.getId())
				arr.set(i,s);
		}
	}
	
	public void getAge(Student s)
	{
		int max=30;
		for (int i = 0; i < this.arr.size(); i++)
		{
			
			if(arr.get(i).getAge()== max)
			
				arr.set(i,s);
		}
	}
	
	public void dispalyStudent() 
	{
		for (Student stt : arr) {
			System.out.println(stt);
		}
	}	
}


public class CollectionDemo 
{
	public static void main(String[] args) 
	{
		
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		arr.add(1,88);
        System.out.println(" get element at index "+arr.get(3));
       
        arr.remove(3);
       
		for (Integer a : arr) {
			System.out.print(a+"  ");
		}
		
		System.out.println();
		
		
		List<Student> st = new ArrayList<Student>();
		st.add(new Student(1, "prasad", 22));
		st.add(new Student(2, "nilesh", 30));
		st.add(new Student(3, "lucky", 28));
		st.add(new Student(4, "raj", 20));
		
		for (Student student : st) {
			
			System.out.println(student);
			
		}
		
		
		System.out.println(new CollectionDemo().equals(st));
		
		StudentMaster cDemo = new StudentMaster();
		cDemo.deleteStudent(new Student(2, "nilesh", 30));
		cDemo.updateStudent(new Student(4,"prasad",30));
		cDemo.dispalyStudent();
	  
		

	}
}
