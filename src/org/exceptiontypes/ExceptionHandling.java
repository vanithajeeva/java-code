package org.exceptiontypes;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			System.out.println("do not divide be a no of 0");
		} catch (NullPointerException e) {
			System.out.println("do not fetch a character from null ");
		}catch (ArrayIndexOutOfBoundsException e) {
System.out.println("do not fetch a value beyond its index");
		} finally {
			System.out.println("finally block is being executed");
		}
		System.out.println(3);

	}
}
