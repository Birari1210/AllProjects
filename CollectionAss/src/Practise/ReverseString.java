package Practise;

public class ReverseString {

	public static void main(String[] args) {

		String str = "prasad ";
	  //String sa[] =str.split(" ");
		char ch[] = str.toCharArray();
		int i=0;
		int j=ch.length-1;
			while(i<j)
			{
				char temp = ch[i];
				     ch[i]=ch[j];
				     ch[j]=temp;
				     i++;
				     j--;
			}
				
		String	 str1 = new String(ch);
			 str1 = str1+str;
        	 System.out.println(str1+"");
        	if(str.equals(str1))
        	{
        		System.out.println("pali");
        	}
        	else
        	{
        		System.out.println("not pali");
        	}
        	 
	}

}
