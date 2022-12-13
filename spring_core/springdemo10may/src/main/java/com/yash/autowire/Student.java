package com.yash.autowire;

public class Student {
int rollno;
String sname;
StudentClass objClass;

public Student(int rollno, String sname, StudentClass objClass) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	this.objClass = objClass;
}

public void studentDetail()
{
  System.out.println("Roll No:- "+rollno);
  System.out.println("Student name:- "+sname);
  System.out.println("Student class:- "+objClass.getClassname());
  System.out.println("Student class Room no:- "+objClass.getRoomno());
}
}
