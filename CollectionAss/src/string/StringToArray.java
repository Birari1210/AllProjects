package string;

public class StringToArray 
{
	//convert string to array using split
	public static void main(String[] args)
	{
		String str ="akash,vinod,prasad,nikhil,santosh";
		String[] split = str.split(",");
		for (int i = 0; i < split.length; i++) 
		{
			System.out.println(split[i]);
		}
		
	}
}
