package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import FactorialTest.DivisibleBy7;
import FactorialTest.Even_Odd;
import FactorialTest.FactorialNumber;
import FactorialTest.MyString;
import FactorialTest.SumOfDigits;
import FactorialTest.SumOfDigitsString;
import TestMain.MyCode;
import TestMain.NumberToBinary;
import TestMain.ConsecutiveNum;
import FactorialTest.FactorialNumber;

class TestClass {

	@Test
	void test() {
		assertEquals(66, MyCode.findMax(new int[] {10,20,65,30,50,40,35,60}));
		assertEquals(6, MyCode.findMax(new int [] {1,2,3,6,4,5}));
	}
    @Test
    void CircleTest(){
    	
    	assertEquals(314,MyCode.areaCircle(10));
    }
    
   // Assignments
    
    @Test
    void ConseTest() {
    	
    	assertEquals(55, ConsecutiveNum.Conse(10));
    }
    
    @Test
    void FactorialTest1()
    {
    	assertEquals(120, FactorialNumber.Factorial());
    }
      
    @Test
    void Even_Odd_Digits()
    {
    	assertEquals(4,5, Even_Odd.Count(542587545));
    }
    
    @Test
    void SumOfDigitsTest()
    {
     	assertEquals(9, SumOfDigits.sum(2+3+4));
    }
   
    
    @Test
    void SumOfDigitString() // Expression sum
    {
    	assertEquals(16, SumOfDigitsString.DigitSum());
    }
   
    @Test 
    void StartEndDisibleBy7()
    {
    	assertEquals(2107, DivisibleBy7.Divisible());
    }
    
    @Test
    void BibaryNumbers()
    {
    	assertEquals(4, NumberToBinary.Binary(14));
    }    
}
