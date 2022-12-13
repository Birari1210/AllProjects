package ArrayAndStringAssingment13oct;


//8  You are having array of strings. Now you have to arrange strings in array on the basis 
//of the length of each string. Smallest string will be first and so on.
public class FindSmallestInStringArray {

	public static void main(String[] args)
	{
		String s[] = {"prasad", "raj","akash","jaydeep"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])<0)
				{
					String s1 = s[i];
					      s[i] = s[j];
					      s[j] = s1;
				}
			}
				
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		

	}

}
