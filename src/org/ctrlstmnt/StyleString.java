package org.ctrlstmnt;

public class StyleString {
	public static void main(String[] args) {
		String add = "9, natesan st, srisakthi nagar, annanur";

		if (add.contains("chennai")) {
			System.out.println("address mentioned with city");
		} else {
			System.out.println("address mention without city");
		}
		String id = "rejudoctor22@gmail.com";

		boolean contains = id.contains("@");
		System.out.println("if @ is there valu is : " + contains);

		String a = "89034259823457";
		String alphaSpecial = "";
		String numeric = "";

		if (a.length() ==10) {
			for (int i = 0; i < a.length(); i++) {
				char onedigit = a.charAt(i);
				if (Character.isAlphabetic(onedigit)) {
					alphaSpecial = alphaSpecial + onedigit;

				} else if (Character.isDigit(onedigit)) {
					numeric = numeric + onedigit;

				} else {
					alphaSpecial = alphaSpecial + onedigit;

				}

			}
			if (numeric.length() ==10) {
				System.out.println("valid number "+numeric);
			} else {
				System.out.println("contains alphaspecial or alphabetic "+alphaSpecial);
			}
			if (a.length()==10) {
				System.out.println("valid phone number");
			}
			else if (a.length()>10) {
				System.out.println("number greater than ten");
			}
			
			else if (a.length()<10) {
				
			}System.out.println("number less than ten");
			
			
			
			
			
			
			
			
			
			
			
			
			

		}

	}

}
