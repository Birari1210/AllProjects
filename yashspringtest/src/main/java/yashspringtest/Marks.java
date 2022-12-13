package yashspringtest;

public class Marks {
	public	int marathi;
	public int hindi;
	public int english;
	
	public Marks(int marathi, int hindi, int english) {
		
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
