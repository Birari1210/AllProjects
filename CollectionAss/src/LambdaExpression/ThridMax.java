package LambdaExpression;

interface MaxNum
{
	void max();
}

public class ThridMax {

	public static void main(String[] args) {

	MaxNum obj=()->{
		int a[]= {10,20,30,40,50,60,70,80,90};
		int b=a.length;
		for(int i=0;i<b;i++)
		{
			//int temp =0;
			for(int j=i+1;j<b;j++)
			{
				if(a[i]>a[j])
				{
				  int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("max="+a[b-2]);
	 };
	 obj.max();
	}

}

