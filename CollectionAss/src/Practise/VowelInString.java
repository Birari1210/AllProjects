package Practise;

public class VowelInString {

	public static void main(String[] args) {

         String str= "prasad birari";
         int count=0;
         for (int i = 0; i <str.length(); i++) {
        	
        	 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
        			 {
        		       count++;
        		        System.out.println(str.charAt(i)+"Index no "+i); 
        		      
        			 }
			
		}
         System.out.println("total count of vowel is"+ count);
	}

}
