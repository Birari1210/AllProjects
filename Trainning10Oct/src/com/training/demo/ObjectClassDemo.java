package com.training.demo;


class Trainee{
	int id=0;
	String name;
	int age;
	
	public Trainee()
	{
		
	}
	
	public Trainee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" +age  ;
	}
	
	public boolean equals(Object o)
	{
		Trainee t = (Trainee)o;
		if(t.id==this.id && t.name.equals(this.name) && t.age ==this.age)
			return true;
		else
			return false;		
	}
	
	public int hashCode()
	{
		return this.id*this.age; //random method search
	}
}

public class ObjectClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee t1 = new Trainee(1,"prasad",22);
		Trainee t2 = new Trainee(1,"prasad",22);
		Trainee t3 = new Trainee(2,"prasad",22);
		Trainee t4 = new Trainee(2,"prasad",22);
		Trainee t5 = new Trainee(3,"prasad",22);
		Trainee t6 = new Trainee(4,"prasad",22);

		System.out.println(t2);

		if(t1.equals(t2))
		{
			System.out.println("oject is equals");
		}
		else
		{
			System.out.println("object are not equals");
		}
		
		Trainee arr[] = {t1, t2, t3, t4, t5, t6};
		
//		int count=0;
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = 0; j < arr.length; j++) {
//				
//			}
//			
//		}
		
	}
	

}
