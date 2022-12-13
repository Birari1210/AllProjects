package Assingment;

public class DecimalToBinary1 {

	int index=0;
    int arr[] = new int[10];
    int num=10;
	public void decimaltobinary()
	{
		// num=10;
		while(num>0)
		{
			int res=num%2;
			arr[index++]=res;
			num= num/2;	
		}
		
		for (int i =index-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {

		DecimalToBinary1 decimalToBinary1 = new DecimalToBinary1();
		decimalToBinary1.decimaltobinary();
		
	}

}
