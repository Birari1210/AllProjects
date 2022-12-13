package ArrayAndStringAssingment13oct;

public class DemonstrateStringBuilderAndBuffer {

	
	public static void main(String[] args) {
		
		        long Time = System.currentTimeMillis();  
		        StringBuffer sb = new StringBuffer("Prasad");  
		        for (int i=0; i<10000; i++){  
		            sb.append(" Birari"); 
		            System.out.println(sb);
		            break;
		        }  
		        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - Time) + "ms"); 
		        
		        Time = System.currentTimeMillis();  
		        StringBuilder sb2 = new StringBuilder("Hello ");  
		      
		        for (int i=0; i<10000; i++)
		        {  
		            sb2.append("Developer");  
		            System.out.println(sb2);
		            break;
		        }  
		        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - Time) + "ms");  
		
	}
	

}
