package string;

public abstract class Calc implements Calculator{


	@Override
	public int add(int a, int b)
	{
		System.out.println("add");
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("sub");
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		System.out.println("mul");
		return 0;
	}

	
	public abstract int div(int a, int b) ;

}
