package ArrayAndStringAssingment13oct;

public class AccendingOrder {

	public static void main(String[] args) {
		String s[] = { "nilesh", "rakesh", "jay", "akash"};
		
		
		System.out.println("arrange string  on the basis of the length are  : ");
		
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() > s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			System.out.print(" " + s[i]);
		}

	}

}
