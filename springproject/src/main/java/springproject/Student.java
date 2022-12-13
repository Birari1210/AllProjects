package springproject;

public class Student {
	int rollno;
	String sname;
	
	public Student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname = sname;
	}
	
	public Student(int rollno) {
		this.rollno = rollno;
	}
	
	public Student(String sname) {
		this.sname = sname;
	}

	void show()
	{
		System.out.println("Roll No : "+rollno);
		System.out.println("Student name : "+sname);
	}
	
	
	
	

}
