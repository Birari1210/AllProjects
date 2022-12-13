package Que12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpTest {

	@Test
	void Emp() throws CloneNotSupportedException 
	{
		Employee emp1 = new Employee(111,"Prasad");
		Employee emp2 = (Employee)emp1.clone();
		assertEquals(true,Employee.cloneCheck(emp1, emp2));
	}

}
