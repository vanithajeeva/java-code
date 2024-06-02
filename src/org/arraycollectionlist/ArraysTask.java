package org.arraycollectionlist;

import java.util.LinkedList;
import java.util.List;

public class ArraysTask {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int output = 0;

		for (int i = 0; i < a.length; i++) {

			output += a[i];
		}
		double average = output / a.length;
		System.out.println(output);
		System.out.println(average);

		int b[] = { 10, 10, 20, 50, 60, 80, 60, 50 };
		int c = -2;
		for (int i = 0; i < b.length; i++) {
			if (b[i] != -2) {
				for (int j = i + 1; j < b.length; j++) {
					if (b[i] == b[j]) {
						b[j] = c;

					}
				}
				System.out.print(b[i] + ",");
			}
		}
		System.out.println();
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(null);
		li.add(20);
		li.add(30);
		li.add(70);
		System.out.println(li);

		int size = li.size();
		System.out.println(size);
		System.out.println(li.size() - 1);

		Integer integer = li.get(4);
		System.out.println(integer);

		int indexOf = li.indexOf(30);
		System.out.println(indexOf);

		int i = li.lastIndexOf(20);
		System.out.println(i);

		boolean d = li.contains(30);
		System.out.println(d);

		li.add(100);
		li.add(300);
		System.out.println(li);

		boolean e = li.contains(300);
		System.out.println(e);

		li.set(4, 500);
		System.out.println(li);

		li.remove(8);
		System.out.println(li);

		boolean empty = li.isEmpty();
		System.out.println(empty);

	
	}

}
