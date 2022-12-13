package TDD_Assingment;

public class Que12_Employee implements Cloneable   {
	
	int eId;
	String name;
	public Que12_Employee(int eId, String name) {
		
		this.eId = eId;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static boolean cloneCheck(Que12_Employee emp1, Que12_Employee emp2)
	{
		if(emp1.eId == emp2.eId && emp1.name == emp2.name)
			return true;
		else
			return false;
	}

}
