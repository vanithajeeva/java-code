package org.encapsulation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecretSetClass {
	public static void main(String[] args) {
		PojoClass pc = new PojoClass();
		pc.setAge(34);
		pc.setId(1234);
		pc.setName("jeevanantham");

		System.out.println(pc.getAge());
		System.out.println(pc.getId());
		System.out.println(pc.getName() + "\n");

		System.out.println("user defined list");
		List<PojoClass> l = new ArrayList();
		l.add(pc);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getAge());
			System.out.println(l.get(i).getId() + "\n");
		}

		System.out.println("user defined set");
		Set<PojoClass> s = new LinkedHashSet();
		s.add(pc);
		for (PojoClass pojoClass : s) {
			System.out.println(pc.getAge());
			System.out.println(pc.getName());
			System.out.println(pc.getId()+"\n");
		}

		System.out.println("user defined map");
		Map<Integer, PojoClass> m = new LinkedHashMap();
		m.put(10, pc);
		Set<Entry<Integer, PojoClass>> set = m.entrySet();
		for (Entry<Integer, PojoClass> entry : set) {
			System.out.println(entry.getValue().getAge());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
		}

	}
}
