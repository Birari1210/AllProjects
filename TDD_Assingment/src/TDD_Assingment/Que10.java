package TDD_Assingment;

public class Que10 {

	public static String concatString() {
			
		
		String fruit[]={"apple","ORANGE","banana","lemon"};
     	String s="";

		for(int i=0;i<fruit.length;i++)
		{
			if(i==fruit.length-1)
			{
		     s=s+fruit[i];
			}
			else
			{
			
			  s=s+fruit[i]+"-";
			}
			
		}
		return s;

	}
//	public static void main(String[] args) {
//		System.out.println(Que10.concatString());
//	}

}
