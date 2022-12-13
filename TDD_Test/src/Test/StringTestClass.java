package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FactorialTest.MyString;

class StringTestClass {

	 @Test
	   void StrLength()
	   {
		   assertEquals(15, MyString.StringLength());
	   }
	 
	 @Test
	   void StringIndexOf()
	   {
		 assertEquals(3, MyString.StringIndexOf());
	   }
	
	 @Test
	 void StringCharAt() throws Exception
	 {
		 assertEquals(97, MyString.StringCharAt());
	 }

		
}
