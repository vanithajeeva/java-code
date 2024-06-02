package org.arraycollectionlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListSetMapTypes {
	public static void main(String[] args) {

		Set<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);

		System.out.println("set " + s);

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
		

		
		
		
	}
}

