package Test;

public class prime {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=99;
			int counter=0;	
			for(int i=2;i<n;i++)
			{	
					if(n%i==0)
					{
					
					counter++;
				   }
			}
			if(counter==0)
				{
					System.out.println(" Prime");
				}
			else
			System.out.println("not Prime");
}
}