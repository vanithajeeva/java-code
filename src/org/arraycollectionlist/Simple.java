package org.arraycollectionlist;

public abstract class Simple {

	static int a = 12;

	public static void vani() {
		System.out.println("vani");
	}

	public static void vani(int a) {
		System.out.println("vani");
	}

	public static final void main(String[] args) {

		Simple.vani();

		int i = Simple.a;
		System.out.println(i);

		// immutable
		String b = "reju";
		String h = "vani";
		String d = h.concat(b);

		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(h));
		System.out.println(System.identityHashCode(d));

		// mutable
		StringBuffer s = new StringBuffer("vanitha");
		StringBuffer s1 = new StringBuffer("jeeva");
		StringBuffer p = s.append(s1);

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(p));

	}
}
