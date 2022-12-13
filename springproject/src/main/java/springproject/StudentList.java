package springproject;

import springproject.*;

public class StudentList {

	String name;
	int rollNo;
	StudentMarks Mobj;

	public StudentList(String name, int rollNo, StudentMarks mobj) {
		super();
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
