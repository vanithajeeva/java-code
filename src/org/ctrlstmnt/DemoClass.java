package org.ctrlstmnt;

public class DemoClass {
	public static void main(String[] args) {
		int a = 27;
		
		if (a%5==0) {
			System.out.println("given number is divided by 5");
		} else {
			System.out.println("given number is not divided by 5");
		}
		String s = "WelComeToJava";
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		int upperCount=0;
		int lowerCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char eachChar = s.charAt(i);
			if(Character.isUpperCase(eachChar)) {
				upperCount++;
			}else {
				lowerCount++;
			}
		}
		
		System.out.println("Upper case count "+upperCount);
		System.out.println("Lower case count "+lowerCount);
		
	
	
	}
}
