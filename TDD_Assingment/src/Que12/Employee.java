package Que12;


public class Employee implements Cloneable   {
	
	int eId;
	String name;
	public Employee(int eId, String name) {
		
		this.eId = eId;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static boolean cloneCheck(Employee emp1, Employee emp2)
	{
		if(emp1.eId == emp2.eId && emp1.name == emp2.name)
			return true;
		else
			return false;
	}

}
