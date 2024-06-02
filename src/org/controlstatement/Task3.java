package org.controlstatement;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {

			// for (int j = 1; j <=5-i; j++) {
			// System.out.print(" ");
			// }
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		Scanner s = new Scanner(System.in);
		int arm = 0, temp;
		System.out.println("enter the number");
		int num = s.nextInt();
		temp = num;
		while (num > 0) {
			int rem = num % 10;
			arm = rem * rem * rem + arm;
			num = num / 10;
		}
		if (temp == arm) {
			System.out.println(temp + " is  amstrong number");
		} else {
			System.out.println(temp + " is not amstrong number");
		}
		int no = 56789;
		int rem = 0;
		while (no > 0) {
			rem = rem * 10 + no % 10;
			no = no / 10;
		}
		System.out.println(rem);
		int vj = 123;
		int cv = 0;
		while (vj > 0) {
			vj = vj / 10;
			cv++;
		}
		System.out.println(cv);

		String name = "vanitha pretty";
		String result = "";
		String[] split = name.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result += split[i] + " ";
		}
		System.out.println(result);
		int rj = 123;
		int num1 = 0;
		for (int i = rj; i > 0; i = i / 10) {
			num1 = num1 + i % 10;
		}
		System.out.println(num1);
		int pd = 2002;
		int red = 0;
		while (pd > 0) {
			red = red * 10 + pd % 10;
			pd = pd / 10;
		}
		System.out.println(red);
	}
}
