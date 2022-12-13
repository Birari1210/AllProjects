package com.training.Java8.Assingment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	int rollno;
	LocalDate date_of_addmission;
	LocalDate dob;
	int maths, physics, chemistry, English, hindi; 
	String classname;
	
	public Student(int rollno, LocalDate date_of_addmission, LocalDate dob, int maths, int physics, int chemistry,
			int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDate getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDate date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}


	public int getChemistry() {
		return chemistry;
	}


	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}


	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
	
	public static void main(String[] args) 
	{
          List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,LocalDate.of(2020, 05, 22), LocalDate.of(1990, 10, 23),80,90,67,70,80,"fifth"));//item
		list.add(new Student(2,LocalDate.of(2021, 10, 11), LocalDate.of(2000, 01, 19),50,70,60,70,45,"sixth"));
		list.add(new Student(3,LocalDate.of(2021, 07, 02), LocalDate.of(1995, 03, 23),30,55,67,80,70,"fifth"));
		list.add(new Student(4,LocalDate.of(2022, 11, 10), LocalDate.of(1997, 05, 12),35,30,67,60,80,"seven"));
		list.add(new Student(5,LocalDate.of(2021, 07, 02), LocalDate.of(1995, 03, 23),75,85,18,25,91,"nine"));
		list.add(new Student(6,LocalDate.of(2022, 05, 22), LocalDate.of(1999, 03, 29),01,22,18,25,20,"nine"));

		System.out.println("_________________ 1 _________________");
		
		for (Student stud : list)
		{
			int totalmarks=stud.maths + stud.chemistry +stud.English + stud.hindi + stud.physics;
			double marks= (totalmarks*100)/500;
			//System.out.println(marks);
			if(marks<40)
			{
			System.out.println("Roll no= "+stud.rollno+" marks = "+marks+" class name=  "+stud.classname);
			}
		}
		
		System.out.println("----------------- 2 -------------------");
		int count=0;
		for (Student s : list)
		{	
				if(s.getChemistry() >=75 )
				{
				count++;
				}
				if( s.getEnglish() >=75)
				{
				     count++;
				}
			    if( s.getHindi()>=75)
				{
				    count++;
				}
				if(s.getMaths()>=75)
				{
					count++;
				}
				if(s.getPhysics()>=75)
				{
						count++;
				}
			
			if(count==3)
			{
				System.out.println(s.getRollno()+" "+s.classname);
			}
				count=0;
			
		}
		
		System.out.println("---------- 3 ----------------");
		
		for (Student m : list)
		{
			int totalmarks=m.maths + m.chemistry +m.English + m.hindi + m.physics;
			double marks= (totalmarks*100)/500;
			if(marks>70)
			{
			System.out.println("Roll no. = "+m.rollno+" marks=  "+marks+"class name "+m.classname);
			}
	   }
		
//		for (Student s : list)
//		{
//			int totalmarks=s.maths + s.chemistry +s.English + s.hindi + s.physics;
//			double marks= (totalmarks*100)/500;
//			System.out.println(marks);
//			if(marks<30)
//			{
//			System.out.println(""+s.rollno+" marks "+marks+" "+s.classname);
//			}
//    }
	
		System.out.println("--------------- 5 ---------------");
		
		int cnt=0;
		for (Student s1 : list)
		{	
				if(s1.getChemistry() >35 )//|| s1.getEnglish() <=35  || s1.getHindi() <=35  || s1.getMaths() <=35  || s1.getPhysics() <=35 )
				{
				cnt++;
				}
				if( s1.getEnglish() >35)
				{
				     cnt++;
				}
			    if( s1.getHindi()>35)
				{
				    cnt++;
				}
				if(s1.getMaths()>35)
				{
					cnt++;
				}
				if(s1.getPhysics()>35)
				{
						cnt++;
				}
				System.out.println(s1.getRollno()+" "+s1.classname);
		
			if(cnt==1)
			{
				System.out.println(s1.getRollno()+" "+s1.classname);
			}
				count=0;
			
		}
	}
	
}
