package Assingment11OctObjectClass;

public class ComplexNumberAdd {
	
	public int[] Addition(int real1, int real2, int image1, int image2)
	{
		int arr[] = new int[2];
		arr[0]=real1+real2;
		arr[1]=image1+image2;
		return arr;		
	}
	
	public static void main(String[] args) {

		ComplexNumberAdd cn = new ComplexNumberAdd(); 
		
		int[] arr = cn.Addition(10, 15, 5, 10);
		int[] arr1 = cn.Addition(1, 5, 5, 10);

		System.out.println("Addition is "+arr1[0]+" + "+arr1[1]+"i");

		System.out.println(arr[0]+" + "+arr[1]+"i");
	}

}
