package TestMain;

public class MyCode {

	public static int findMax(int a []) {

		int Max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(Max<a[i])
			{
				Max=a[i];
			}
		}
		return Max;
	}
	public static double areaCircle(double r)
	{
		return(3.14*r*r);
	}

}
