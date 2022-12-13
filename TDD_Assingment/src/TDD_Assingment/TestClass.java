package TDD_Assingment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


class TestClass {
	
    @Test
	void Que1test()
	{
		assertEquals(4,Que1.HCF());
	}
	
	@Test 
	void Que2test() {
		
		assertEquals(true,Que2.palindrome());
	}
	
//	@Test
//	void Que3()
//	{
//		assertEquals(true,Que3.Data());
//	}
//	
	@Test
	void QueDataTest3()
	{
		assertEquals(true, Que3.chekPassAndEmail());
	}

	
	@Test
	void Que4()
	{
		assertEquals(true,Que4.Armstromgnumber());
	}
	
	@Test
	void Que5()
	{
		assertEquals(true, Que5.Pythagoras());
	}
	
	@Test
	void Que6()
	{
		assertEquals(2,Que6.Vowel());
	}
	
	
	@Test
	void Que7()
	{
	  assertEquals(true,Que7.PalindromeNum(121));	
	}
	
	@Test
	void Que8()
	{
		assertEquals(4,5, Que8.Count((542587545)));
	}

	@Test
	void Que_8test()
	{
		assertEquals(true,Que_8.even_odd());
	}
	

	
	@Test
	void Que9test() throws Exception
	{
	  assertEquals("ThisRedcar", Que9.remove());
	 // assertArrayEquals(s,s1());
	}
	@Test
	void Que10()
	{
		assertEquals("apple-ORANGE-banana-lemon",Que10.concatString());
	}
	
	
	
}
