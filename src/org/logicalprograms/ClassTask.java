package org.logicalprograms;

public class ClassTask {
	public static void main(String[] args) {

		// odd or even
		System.out.println("odd or even sum & count");
		int sum = 0, count = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
				count++;
			}
		}
		System.out.println("sum of even no: " + sum);
		System.out.println("count of even no: " + count);

		// swapping of two numbers using third variable
		System.out.println("swapping of two numbers using third variable");
		int a = 10, b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// without using third variable by using arithmetic operators
		System.out.println("without using third variable by using arithmetic operators");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);

		// reverse the number and palindrome
		System.out.println("reverse the number and palindrome");
		int num = 123;
		int i, j = 0, d = num;
		while (d > 0) {
			i = d % 10;
			j = (j * 10) + i;
			d = d / 10;
		}
		System.out.println(j);

		if (num == j) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
		// amstrong number (sum of the cube of the each number)
		int e = 153;
		int k, l = 0;
		while (e > 0) {
			k = e % 10;
			l = (k * k * k) + l;
			e = e / 10;
		}

		if (e == l) {
			System.out.println("amstrong number");
		} else {
			System.out.println("not amstrong number");
		}

		// String reversal
		System.out.println("String reversal");

		String name = "hello world";
		String emp = "";

		for (int m = name.length() - 1; m >= 0; m--) {
			char at = name.charAt(m);
			emp = emp + at;
		}
		System.out.println(emp);
		if (emp == name) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");

		}
	}
}
