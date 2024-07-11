package org.arraycollectionlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetMapTypes {
	public static void main(String[] args) {

		int a = Simple.a;
		System.out.println(a);

		Simple.vani();

		Set<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(49);
		s.add(null);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);

		boolean contains = s.contains(60);
		System.out.println("set " + s);
		System.out.println(contains);
		Set<Integer> li = new HashSet<>();
		li.addAll(s);
		System.out.println(li);

		Set<Integer> ts = new TreeSet<>();
		ts.add(90);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		ts.add(20);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(10);
		ts.add(30);
		ts.add(80);
		System.out.println(ts);

		List<Integer> b = new ArrayList<Integer>(ts);
		Integer i = b.get(4);
		System.out.println(b);
		System.out.println(i);

		Set<Integer> v = new LinkedHashSet<Integer>(ts);
		System.out.println(v);
	}
}
