package org.controlstatement;

public class Task2 {

	public static void main(String[] args) {

		int age = 10;
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}

		int even = 11;
		if (even % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}

		int a = 100;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");

			}
		}
		System.out.println();

		int b = 100;
		int c = 0;
		for (int i = 1; i <= b; i++) {
			if (i % 2 == 1) {
				c = c + i;
			}
		}
		System.out.println(c);
		int d = 100;
		int e = 0;
		for (int i = 1; i <= d; i++) {
			if (i % 2 == 0) {
				e = e + 1;
			}
		}
		System.out.println(e);

		int f = 5;
		int g = 1;
		for (int i = 1; i <= f; i++) {
			g = i * g;
		}
		System.out.println(g);

		int h = 0;
		int k = 1;
		int l, count = 0;
		System.out.print(h + " " + k);
		while (count < 10) {
			l = h + k;
			System.out.print(" " + l);
			h = k;
			k = l;
			count++;
		}
		System.out.println("\n");

		int x = 0;
		int y = 0;
		int z = 13;
		y = z / 2;
		if (z == 0 || z == 1) {
			System.out.println(z + " is not prime number");

		} else {
			for (int i = 2; i <= y; i++) {
				if (z % i == 0) {
					System.out.println(z + " is not prime number");
					x = 3;
					break;

				}
			}
			if (x == 0) {
				System.out.println(z + " is prime number");

			}

		}
	}
}
