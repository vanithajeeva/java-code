package org.ctrlstmnt;

public class ReplaceWork {
	public static void main(String[] args) {
		String name = "WelComeToJava";
		int upperCount = 0;
		int lowerCount = 0;

		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);

			if (Character.isUpperCase(charAt)) {
				upperCount++;
			} else {
				lowerCount++;

			}

		}
		System.out.println("Upper case count is :-" + "\n==================" + "\n" + upperCount);
		System.out.println("Lower case count is:-" + "\n===================" +"\n" +  lowerCount);

		String d = "Welcome to java class";
		boolean endsWith = d.endsWith("class");
		System.out.println(endsWith);

		String b = "WelcomE";
		String convert = "";
		for (int i = 0; i < b.length(); i++) {
			char charAt = b.charAt(i);
			if (Character.isUpperCase(charAt)) {
				convert = convert + Character.toLowerCase(charAt);

			} else {
				convert = convert + Character.toUpperCase(charAt);
			}

		}
		System.out.println("the given word " + convert);
	}

}
