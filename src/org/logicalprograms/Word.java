package org.logicalprograms;

public class Word {
	public static void main(String[] args) {

		System.out.println("====String reversal of each word using split====");

//		String st = "Good Morning Students";
//
//		String[] words = st.split(" ");
//		String revs = "";
//
//		for (String word : words) {
//			String q = "";
//
//			for (int i = word.length() - 1; i >= 0; i--) {
//				q = q + word.charAt(i);
//			}
//			revs = revs + q + " ";
//		}
//		System.out.print(revs);

		String s = "Welcome to Home jiiva";
		// 0123456
		String[] split = s.split(" ");
		String r = "";

		for (int i = split.length - 1; i >= 0; i--) {

			if (i == 0) {
				r = r + split[i];
			} else {
				r = r + split[i] + " ";
			}
		}
		System.out.println(r);

	}

}
