package LambdaExpression;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "prasadssas";
		
		String s ="";
		
		for(int i=0;i<str.length();i++)
		{
			int cnt=0;
			for(int j=i+1;j<str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					//s=s+str.charAt(i);
					cnt++;
				}
						
			}
			if(cnt ==0)
			{
				s=s+str.charAt(i);
			}
			
		}
		System.out.println(s);
		

	}

}
