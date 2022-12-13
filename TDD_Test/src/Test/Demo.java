package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import FactorialTest.PrimeNumber;

class Demo { 
	
	PrimeNumber x;

	@Before
	public void setUp() throws Exception
	{
		x= new PrimeNumber();
	}
	
	@After 
	public void tearDown() throws Exception
	{
		x=null;
	}
	
	@Test
	public void PrimeN()
	{
		assertTrue("result",x.primeNo(5));
		
		assertEquals(false,x.primeNo(9));
	
	}

}
