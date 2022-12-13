package Ass6;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
public class Student {
	private int sid;
	private String sname;

	@Autowired	
	@Qualifier(value="marksbean1")
	public Marks markObj;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Marks getMarks() {
		return markObj;
	}
	public void setMarks(Marks markObj) {
		this.markObj = markObj;
	}
		
	public void show()
	{
		System.out.println("Student ID:-"+sid);
		System.out.println("Student Name:-"+sname);
		
		System.out.println("Marks in marathi -"+markObj.getMarathi());
		System.out.println("Marks in Hindi -"+markObj.getHindi());
		System.out.println("Marks in english -"+markObj.getEnglish());

	}
	
}
