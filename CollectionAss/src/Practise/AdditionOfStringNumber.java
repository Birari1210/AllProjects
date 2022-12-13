package Practise;

public class AdditionOfStringNumber {

	public static void main(String[] args) {

		String s = "123453";
		int sum=0;
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-48;
				count++;
			}
		}
			if(count!=0)
			{
				System.out.println(sum);
			
		}
			else
				System.out.println("0");
		
	}

}
