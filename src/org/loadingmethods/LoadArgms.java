package org.loadingmethods;

public class LoadArgms {
	private void companyName(int id) {
		System.out.println("company id : " + id);
	}

	private void companyName(long phoneno, String location, int pincode) {
		System.out.println("company phoneno : " + phoneno);
		System.out.println("company location : " + location);
		System.out.println("company pincode is : " + pincode);
	}

	private void companyName(String name, char grade) {
		System.out.println("company grade is : " + grade);
	}

	private void companyName(char grade, String name) {
		System.out.println("company grade is : " + grade);
	}

	public static void main(String[] args) {
		LoadArgms ci = new LoadArgms();
		ci.companyName(3452);
		ci.companyName(9876543210l, "avadi", 109);
		
		ci.companyName("Asus company", 'o');
		ci.companyName('o', "Asus company");
	}
}
