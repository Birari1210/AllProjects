package CollectionAss;

public class PrimeNo {
	
	public static String Prime()
	{
		int num =6;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if( num%i == 0)
				count++;
		}
		if(count==0)
			return "Number is Prime";
		else
			return "number is not Prime";
	}

     public static void main(String[] args) {
		
    	 PrimeNo p = new PrimeNo();
    	 System.out.println(p.Prime());
    	 
	}
}
