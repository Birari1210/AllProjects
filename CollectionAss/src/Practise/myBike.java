package Practise;

//abstraction example;

 abstract class Bike {

        abstract void run();
        
}
 
public class myBike extends Bike
{
	public void run()
	{
		System.out.println("inside run...");
	}
	
	public static void main(String[] args) 
	{
	  Bike b = new myBike();
	  b.run();
    }	
}

