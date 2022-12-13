package com.test.java;

public class PallindromStringArray {
//3) Given a String count the number of words in the String that are palindrome.

	public static void main(String[] args) {

		String sa[] = { "aka", "asd", "madam", "mal", "malam" };
		int count = 0;
		for (int i = 0; i < sa.length; i++) {
			String s = sa[i];
			int j = 0;

			char[] ca = s.toCharArray();
			int k = ca.length - 1;
			while (j < k) {
				char temp = ca[j];
				ca[j] = ca[k];
				ca[k] = temp;
				j++;
				k--;
			}
			String s2 = new String(ca);
			if (s.equals(s2)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
