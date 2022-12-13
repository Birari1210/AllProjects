package FactorialTest;

public class SumOfDigitsString {

public static int DigitSum()
{
	String s="2+3-4/2*5";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		
		if(ch>='0' && ch<='9')
		{
			sum=sum+ch-48;    
		}
	}
	return sum;
}
public static void main(String[] args) 
  {
	SumOfDigitsString obj = new SumOfDigitsString();
	System.out.println(obj.DigitSum());
  }
}
