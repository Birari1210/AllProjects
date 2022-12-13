package TDD_Assingment;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class Que_12Test {

	@Test
	void Emp() throws CloneNotSupportedException 
	{
		Que12_Employee emp1 = new Que12_Employee(111,"Prasad");
		Que12_Employee emp2 = (Que12_Employee)emp1.clone();
		assertEquals(true,Que12_Employee.cloneCheck(emp1, emp2));
	}

}
