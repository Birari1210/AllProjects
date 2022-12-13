package MyProgram;

public class Even {

	public static void main(String[] args) {

	int num = 5226993;
	     
	    int even=0;
	    int odd=0;
	    
	    while (num!=0)
	    {
	    	int rem = num% 10;
	    	if(rem%2==1)
	    		odd++;
	    	else
	    		even++;
	    	num/=10;
	    }
	    System.out.println("Even  "+even);
	    System.out.println("odd "+odd);	
	}

}
