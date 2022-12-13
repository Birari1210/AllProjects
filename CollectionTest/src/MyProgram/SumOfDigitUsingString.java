package MyProgram;

public class SumOfDigitUsingString {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
	String s="2*3+4";
		
		int sum=0;
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='0' && ch<='9')
				sum=sum+ch-48;  // 48 is difference of of ascii value; 1 ascii value is 49
			                            // 49-48=1;  50-48=2;
			    count++;                        //51-48=3;  52-48=4;  53-48=5;  and addition of all values;                
		}
		if(count!=0)
		System.out.println(sum);
		else
			System.out.println("0");
}
}