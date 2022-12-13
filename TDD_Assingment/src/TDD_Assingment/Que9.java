package TDD_Assingment;

public class Que9 {
		
	public static String remove() {
		String str= "This @ Red $car-.";
		String s1="";
        char[] s = str.toCharArray();
        int endIndex = 0;
        for (int i = 0; i < s.length; i++) {
 
            if ((s[i] >= 'A' && s[i] <= 'Z')  || (s[i] >= 'a' && s[i] <= 'z')) {
                s[endIndex] = s[i];
                endIndex++;
            }
        }
        //System.out.println(String.valueOf(s).substring(0, endIndex));
        // String s1=new String(s);
        //System.out.println(s1);
        s1=String.valueOf(s).substring(0, endIndex);
        System.out.println(s1);
        return s1;
    }
	
	public static void main(String[] args)
	    {
	        System.out.println(Que9.remove());
	    }
}
