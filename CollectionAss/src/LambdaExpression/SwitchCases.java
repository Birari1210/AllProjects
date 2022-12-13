package LambdaExpression;

public class SwitchCases {

	public static void main(String[] args) {
		
		String s ="sunday";
		int day=0;
		
		switch(s)
		{
		
		 case "monday" : day=1;
		 System.out.println("day 1");
		 break;
		 case "tuesday" : day =2;
		 System.out.println("day 2");
		 break;
		 case "wednesday" : day=3;
		 System.out.println("day 3");
		 break;
		 case "thursday": day=4;
		   System.out.println("day 4");
		 break;
		 case "friday" : day=5;
	      System.out.println("day 5");
         break;
		 case "sunday" : day=6;
		     System.out.println("day 6");
		  break;
		  default:
		  System.out.println("Wrong input");
		  break;
		  
		 
		}
		
		

	}

}
