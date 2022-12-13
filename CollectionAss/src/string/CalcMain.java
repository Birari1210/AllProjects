package string;

public class CalcMain extends Calc{

	public static void main(String[] args)
	{
		CalcMain cm= new CalcMain();
		cm.add(0, 0);
		cm.div(0, 0);
		cm.sub(0, 0);
		cm.mul(0, 0);

	}

	@Override
	public int div(int a, int b)
	{
		System.out.println("div");
		return 0;
	}

}
