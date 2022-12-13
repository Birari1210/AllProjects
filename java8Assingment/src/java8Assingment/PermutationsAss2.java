package java8Assingment;

public class PermutationsAss2 {

	static void PermutationsAss2(String perm, String word)
	{
		if (word.isEmpty()) {
			System.out.println(perm + word);
		} 
		else {
			for (int i = 0; i < word.length(); i++)
			{
				PermutationsAss2(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
	public static void PermutationsAss2(String input) {
		PermutationsAss2(" ", input);
	}

	public static void main(String[] args) {

		PermutationsAss2("ABCD");
	}
}