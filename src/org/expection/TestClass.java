package org.expection;

import java.io.EOFException;
import java.io.IOException;

public class TestClass {
	public static void main(String[] args) {
		try {
			System.out.printf("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.printf("2");
			// System.exit(0);
		} finally {
			System.out.printf("3");
		}
		System.out.printf("4");
		System.out.println();

		try {
			System.out.printf("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {
			Throwable obj = new Throwable("Sample");
			try {
				throw obj;
			} catch (Throwable e1) {
				System.out.printf("8");
			}
		} finally {
			System.out.printf("3");
		}
		System.out.printf("4");
		System.out.println();

		try {
			System.out.printf("1");
			int value = 10 / 0;
			throw new IOException();
		} catch (EOFException e) {
			System.out.printf("2");
		} catch (ArithmeticException e) {
			System.out.printf("3");
		} catch (NullPointerException e) {
			System.out.printf("4");
		} catch (IOException e) {
			System.out.printf("5");
		} catch (Exception e) {
			System.out.printf("6");
		}

	}
}
