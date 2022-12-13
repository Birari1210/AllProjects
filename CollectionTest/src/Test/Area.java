package Test;

public class Area {
	public void computeArea(Shape shape,Print print,int length ,int breadth)
	{
		int result = shape.execute(length, breadth);
		print.print (result);
	}
       public static void main(String[] args)
       {
    	   Area a = new Area();
    	   
    	   a.computeArea((a,b)->a*b,(result));
       }
		
		
	

}
