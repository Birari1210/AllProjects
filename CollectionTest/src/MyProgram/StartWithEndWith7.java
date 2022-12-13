package MyProgram;

public class StartWithEndWith7 {

	public static void main(String[] args)
	{
	    int start = 100;
	    int end = 200;
	    int sum = 0;
	     for( int i= start; i<=end; i++)
	     {
	    	 if(i%7==0)
	    		 sum= sum+i;
	     }
	     System.out.println("Sum all "+sum);
	}
}
