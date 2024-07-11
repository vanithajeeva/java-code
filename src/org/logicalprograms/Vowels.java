package org.logicalprograms;

public class Vowels {
	public static void main(String[] args) {
//		using if condition
		String s = "Welcome";
		String e = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				e = e + c;
			}
		}
		System.out.println(e);

//		without using if condition normal for loop		
		String word = "Rejiivanii";
		String str = word.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			switch (a) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(a + " is a vowel");
				break;
			default:
				System.out.println(a + " is not a vowel");
			}

		}

//		without using if condition enhanced for loop		
		String d = "HAppYbirthdaY";
		for (char w : d.toLowerCase().toCharArray()) {
			switch (w) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				System.out.println(w + " is a vowel");
				break;

			default:
				System.out.println(w + " is not a vowel");
			}

		}
//  	number of vowels 
		String f = "Hello World";
		int count = 0;
		for (char c : f.toLowerCase().toCharArray()) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number of vowels: " + count);

//		count each vowels in word
		String r = "Hello World";
		int[] vowelCount = new int[5]; // array to store count of each vowel

		for (char c : r.toLowerCase().toCharArray()) {
			switch (c) {
			case 'a':
				vowelCount[0]++;
				break;
			case 'e':
				vowelCount[1]++;
				break;
			case 'i':
				vowelCount[2]++;
				break;
			case 'o':
				vowelCount[3]++;
				break;
			case 'u':
				vowelCount[4]++;
				break;
			}
		}

		// print the count of each vowel
		System.out.println("a: " + vowelCount[0]);
		System.out.println("e: " + vowelCount[1]);
		System.out.println("i: " + vowelCount[2]);
		System.out.println("o: " + vowelCount[3]);
		System.out.println("u: " + vowelCount[4]);
	}

}
