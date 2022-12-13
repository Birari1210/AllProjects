package TDD_Assingment;

	
	public class Que4 {

		public static boolean Armstromgnumber() {
		
	        int number = 1634; 
	        int originalNumber; 
	        int count;
	        int result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            count = originalNumber % 10;
	            result += Math.pow(count, 4);
	            originalNumber /= 10;
	        }

	        if(result == number)
	         return true; //"Armstrong number";
	        else
	          return false; //"Not Armstrong number."
	    }
//    public static void main(String[] args) {
//              
//    	Que4 obj = new Que4();
//    	
//    	System.out.println(obj.Armstromgnumber());
//    }
	}

		
//	    public boolean check(int input) {
//	        int digit; 
//	        int sumOfPower = 0;
//	        int temp = input;
//	        int digits = countDigit(input);
//	        while (temp != 0) {
//	            digit = temp % 10;
//	            
//	            sumOfPower = sumOfPower + (int) Math.pow(digit, digits);
//	            temp /= 10;
//	        }
//	        return sumOfPower == input;
//	    }
//
//	    static int countDigit(long n) {
//	        return (int) Math.floor(Math.log10(n) + 1);
	 

//	    public static void main(String[] args) {
//			Que4 obj = new Que4();
//			System.out.println(obj.check(371));
//			
//		}

//}
