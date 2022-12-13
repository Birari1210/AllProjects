package TDD_Assingment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Que13Test {

		@Test
		void testAdd() 
		{
			assertEquals(20, Que13.addition());
		}
		@Test
		void testSubstraction()
		{
			assertEquals(20, Que13.substraction());
		}
		@Test
		void testMultiplication()
		{
			assertEquals(25, Que13.multiplication());
		}		
		@Test
		void testSquareRoot()
		{
			assertEquals(4, Que13.squareroot());
		}
		
		@Test
		void testCubeRoot()
		{
			assertEquals(4, Que13.cuberoot());
		}
		
		@Test
		void testModeulus()
		{
			assertEquals(4, Que13.modulus());
		}
		
		@Test
		public void testPower()
		{
			System.out.println("power operation:");
			assertEquals(4, Que13.power());
		}
		
		@Test
		void testDivision()
		{
			System.out.println("Divison operation");
			assertEquals(25, Que13.divison());	   
		}

}
