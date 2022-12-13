package TDD_Assingment;

public class Que_8 {
	
	//static int a[]={1,2,5,6,3,2};  

	  public static boolean even_odd()
	  {
		int a[]={4,6,8,12}; 
		
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0)
		{  
			System.out.println("Array contains Even number");
			return true;
		  }  
		} 
		System.out.println("array contains odd Number");
		return false;
	}

	  //  public static void main(String[] args) {
//	
//	  Que_8 obj = new Que_8();
//    System.out.println(Que_8.even_odd());
//  }	

}
