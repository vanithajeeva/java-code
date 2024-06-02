package org.ctrlstmnt;

public class Calender {
	public static void main(String[] args) {
		int a = 30;
		for (int i = 1; i <= a; i++) {
			System.out.print(i + " ");
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}
}
