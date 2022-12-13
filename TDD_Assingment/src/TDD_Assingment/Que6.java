package TDD_Assingment;

public class Que6 {

	public static int Vowel() {
	       String str = "Prasad";
		   int count = 0;
	      for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
	      System.out.println("number of vowel in String -" +count);
		return count;
	   }
//	public static void main(String[] args) {
//		Que6 obj = new Que6();
//		System.out.println(obj.Vowel());
//	}
}

