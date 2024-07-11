package org.logicalprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String s = "Welcome";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!m.containsKey(c)) {
				m.put(c, 1);

			} else {
				Integer in = m.get(c);
				m.put(c, in + 1);
			}
		}
		System.out.println(m);

		String str = "Java is a Java programming language";
		Map<String, Integer> mi = new LinkedHashMap<String, Integer>();
		String[] split = str.split(" ");
		for (String word : split) {
			String w = word.toString();
			if (!mi.containsKey(w)) {
				mi.put(w, 1);

			} else {
				Integer a = mi.get(w);
				mi.put(w, a + 1);
			}
		}
		System.out.println(mi);
	}
}
