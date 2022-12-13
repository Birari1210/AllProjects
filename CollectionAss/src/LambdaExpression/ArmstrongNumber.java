package LambdaExpression;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;
		int sum=0;
		int mul =0;
		
		for(int i=1;i<=num;i++)
		{
			mul=i*i*i;
			sum=sum+mul;
		}
		System.out.println(sum);
	}

}
