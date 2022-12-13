package yashspringtest;

public class Student {
	String name;
	int rollNo;
	Address addObj;
	Marks Mobj;

	public Student(String name, int rollNo, Marks mobj) 
	{
		this.name = name;
		this.rollNo = rollNo;
		Mobj = mobj;
	}
	public void showDetails() {
		System.out.println("Student Name :-" + name);
		System.out.println("Student RollNo:-" + rollNo);
		Mobj.displayMarks();
    
	}
}
