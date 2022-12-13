package MyProgram;

public class FactNum {

	public static float factorialNum(int f)
	{
		if(f<2)
			return 1;
		return f * factorialNum(f-1);	
	}
	public static void main(String[] args) 
	{
		//FactNum fac = new FactNum();
		float fac=factorialNum(1);
		System.out.println(fac);	
	}
}
