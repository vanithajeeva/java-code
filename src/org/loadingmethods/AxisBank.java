package org.loadingmethods;

public class AxisBank extends BankInfo {
	public void deposit(String name) {
		System.out.println("deposit name is vani");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving(7654);
		ab.fixed(87.5);
		ab.deposit(null);
	}
}
