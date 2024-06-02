package org.ctrlstmnt;

public class StringTypes {
	/*
	 * Author: Vanitha
	 * Description: this  method is used for the phone number verification
	 * Created on: 04-Mar-2024
	 * Updated on: 04-Mar-2024
	 */
	public static void addPhoneNumber(String enterPhoneNumber) {
		
		String phoneNumber = enterPhoneNumber;
		String alphaSpecial="";
		String numeric="";
		
		if(phoneNumber.length()==10) {
			for (int i = 0; i < phoneNumber.length(); i++) {								
				char singleDigit = phoneNumber.charAt(i);
				if(Character.isAlphabetic(singleDigit)) {
					alphaSpecial=alphaSpecial+singleDigit;
					//alphaSpecial=""+a
					//alphaSpecial=a%$+b=a%$b
				}
				else if(Character.isDigit(singleDigit)) {
					numeric=numeric+singleDigit;
					//numeric=""+1=1
					//numeric=1+2=12
					//numeric=12+3=123
				}else {
					alphaSpecial=alphaSpecial+singleDigit;
					//alphaSpecial=a+%=a%
					//alphaSpecial=a%+$=a%$
				}
			}
			if(numeric.length()==10) {
			System.out.println("Given phone number is vaild number "+numeric);
			}else {
				System.out.println("Given phone number may consist alphabetic or special character "+alphaSpecial);
			}
		}
		else if(phoneNumber.length()<10){
			System.out.println("Given phone number limit is less than 10 digit "+phoneNumber);
		}
		else if(phoneNumber.length()>10){
			System.out.println("Given phone number limit is greater than 10 digit "+phoneNumber
					);
		}
	}
	
	public static void wiseVersaForcharacterString(String enterUpperLowerCaseData) {
		System.out.println("The given String is = "+enterUpperLowerCaseData);
		String wiseVersa="";
		for (int i = 0; i < enterUpperLowerCaseData.length(); i++) {
			char eachChar = enterUpperLowerCaseData.charAt(i);
			if(Character.isUpperCase(eachChar)) {
				wiseVersa=wiseVersa+Character.toLowerCase(eachChar);
			}else {
				wiseVersa=wiseVersa+Character.toUpperCase(eachChar);
			}
		}
		System.out.println("Wise versa of the Character to upper & Lower case = "+wiseVersa);
	}
	
	public static void main(String[] args) {
		wiseVersaForcharacterString("WElcomE");
		
	}

}
