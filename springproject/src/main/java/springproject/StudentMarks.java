package springproject;

public class StudentMarks {
	int marathi;
	int hindi;
	int english;
	
	public StudentMarks(int marathi, int hindi, int english) {
		
		this.marathi = marathi;
		this.hindi = hindi;
		this.english = english;
	}
	
	public void displayMarks()
	{
		System.out.println("Marks in marathi "+marathi);
		System.out.println("Marks in Hindi "+hindi);
		System.out.println("Marks in english "+english);
	}
	
}
