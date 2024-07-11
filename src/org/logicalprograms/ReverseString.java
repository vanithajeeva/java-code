package org.logicalprograms;

public class ReverseString {
	public static void main(String[] args) {

//		without using 2nd variable 
		String s2 = "vanitha";
		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i));
		}
		System.out.println();

//	    increment 
		String s = "vanitha";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		System.out.println(r);

//	    decrement
		String s3 = "vanitha";
		String r3 = "";
		for (int i = s3.length() - 1; i >= 0; i--) {
			char at = s3.charAt(i);
			r3 = r3 + at;
		}
		System.out.println(r3);

//		short decrement
		String s1 = "vanitha";
		String r1 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			r1 = r1 + s1.charAt(i);
		}
		System.out.println(r1);

	}
}
