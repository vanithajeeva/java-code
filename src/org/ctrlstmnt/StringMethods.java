package org.ctrlstmnt;

public class StringMethods {
	public static void addNameId(String addName) {
		int vowels = 0;
		int consonant = 0;
		System.out.println("enter the name: ");
		for (int i = 0; i < addName.length(); i++) {
			char c = addName.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels=vowels+1;

			} else {
				consonant=consonant+1;

			}

		}

		System.out.println(vowels);
		System.out.println(consonant);
	}

	public static void main(String[] args) {
		addNameId("welcome");
	}
}
