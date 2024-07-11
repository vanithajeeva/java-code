package org.logicalprograms;

import java.util.HashMap;
import java.util.Map;

public class NumberTasks {
	public static void main(String[] args) {

		// odd & even numbers
		int a = 11;
		if (a % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		// Sum & Count of even numbers
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
				sum = sum + i;
				count++;
			}
		}
		System.out.println("sum of even no: " + sum);
		System.out.println("count of even no: " + count);

		// Swapping of two numbers
		System.out.println("=====swapping of two number====");
		int c = 12;
		int d = 22;
		int e = d;

		d = c;
		c = e;

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// Without using 3rd variable by arithmetic operators
		System.out.println("===Without using 3rd variable by arithmetic operators====");
		int f = 12;
		int g = 22;

		f = f + g; // 12+22=34
		g = f - g; // 34-22=12
		f = f - g; // 34-12=22

		System.out.println("f = " + f);
		System.out.println("g = " + g);

		// Reversal & Palindrome of a numbers
		System.out.println("======Reversal & Palindrome of a numbers ======");

		int s = 1551;
		int u, k = 0, z = s;

		while (z > 0) {
			u = z % 10; // 1551%10=1, 155%10=5,15%10=5,1%10=1;f
			k = (k * 10) + u; // 0*10+1=1, 1*10+5=15,15*10+5=155,155*10+1=1551;
			z = z / 10; // 1551/10=155,155/10=15,15/10=1,1/10=0;
		}

		System.out.println(k);
		if (s == k) {
			System.out.println("its palindrome");

		} else {
			System.out.println("its not palindorme");
		}

		// Sum & Count the numbers
		System.out.println("=====Sum & Count the numbers=====");
		int p = 1551;
		int o, y = 0, r = p;
		int cnt = 0;
		while (r > 0) {
			o = r % 10; // 1551%10=1,155%10=5,15%10=5,1%10=1;
			y = y + o; // 0+1=1, 1+5=6,6+5=11,11+1=12;
			r = r / 10; // 1551/10=155,155/10=15,15/10=1,1/10=0;
			cnt++; // 0+1=1, 1+1=2, 2+1=3,3+1=4;

		}
		System.out.println(y);
		System.out.println(cnt);

		// Amstrong number is sum of the cube of the each number
		System.out.println("=====Amstrong number=====");
		int v = 153;
		int m, n = 0;
		int num = v, counts = 0;

		while (v > 0) {
			m = v % 10;
			n = (m * m * m) + n;
			v = v / 10;
			counts++;
		}
		if (num == n) {
			System.out.println("Amstrong number");

		} else {
			System.out.println("not Amstrong number");
		}
		System.out.println(counts);

		System.out.println("====String Reversal====");

		String str = "madam";
		String rev = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char h = str.charAt(i);
//			rev = rev + h;
//		}
//		System.out.println(rev);
//
//		// to check palindrome in String using equals in if condition
//		if (str.equals(rev)) {
//			System.out.println("palindrome");
//
//		} else {
//			System.out.println("not palindrome");
//		}

//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;

		}
		System.out.println(rev);

		System.out.println("====String reversal of each word using split====");
		String name = "jiiva bob";
		String change = "";
		String[] splitname = name.split(" ");
		for (String split : splitname) {
			change = change + split + " ";
		}
		System.out.println(change);

		System.out.println("===String reverse");

		String st = "Good Morning Students";
		String revs = "";
		String[] allwords = st.split(" ");
		for (String word : allwords) {
			String q = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				char at = word.charAt(i);
				q = q + at;
			}
			revs = revs + q + " ";
		}
		System.out.println(revs);

		System.out.println("====pick vowels from word====");
		String greet = "Welcome";
		String result = "";

		for (int i = 0; i < greet.length(); i++) {
			char A = greet.charAt(i);
			if (A == 'a' || A == 'e' || A == 'i' || A == 'o' || A == 'u') {
				result = result + A;
			}
		}
		System.out.println(result);

		System.out.println("===get count of types of character====");

		String sentence = "Welcome To Java Class @123";
		int caps = 0;
		int small = 0;
		int number = 0;
		int special = 0;
		for (int i = 0; i < sentence.length(); i++) {
			char single = sentence.charAt(i);
			if (Character.isUpperCase(single)) {
				caps = caps + 1;
			} else if (Character.isLowerCase(single)) {
				small = small + 1;
			} else if (Character.isDigit(single)) {
				number = number + 1;
			} else {
				special = special + 1;
			}
		}
		System.out.println("capital letter count: " + caps);
		System.out.println("small letter count: " + small);
		System.out.println("number count: " + number);
		System.out.println("special character count: " + special);

		System.out.println("====change case sensitive====");
		String content = "WeLcOmEToJaVa";
		int uppercount = 0;
		int lowercount = 0;
		for (int i = 0; i < content.length(); i++) {
			char convert = content.charAt(i);
			if (Character.isUpperCase(convert)) {
				uppercount++;
			} else {
				lowercount++;
			}
		}
		System.out.println("upper case count: " + uppercount);
		System.out.println("lower case count: " + lowercount);

		System.out.println("====get the count of character====");

		String word = "Java";
		Map<Character, Integer> letter = new HashMap<Character, Integer>();
		for (int i = 0; i < word.length(); i++) {
			char cat = word.charAt(i);
			if (!letter.containsKey(cat)) {
				letter.put(cat, 1);

			} else {
				Integer integer = letter.get(cat);
				letter.put(cat, integer + 1);
			}
		}
		System.out.println(letter);

		System.out.println("=====get the count of word======");

		String line = "java is a java programming language";
		String[] oneword = line.split(" ");
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for (String one : oneword) {
			String onetxt = one.toString();
			if (!wordcount.containsKey(onetxt)) {
				wordcount.put(onetxt, 1);

			} else {
				Integer integer = wordcount.get(onetxt);
				wordcount.put(onetxt, integer + 1);
			}
		}
		System.out.println(wordcount);

		System.out.println("=====number is prime or not======");

		int n1 = 3;
		int m1, flag = 0;

		m1 = n1 / 2;

		if (n1 == 0 || n1 == 1) {
			System.out.println(n1 + " is not a prime number");

		} else {
			for (int i = 2; i <= m1; i++) {
				if (n1 % i == 0) {
					System.out.println(n1 + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n1 + " is a prime number");
			}
		}

		System.out.println("====count odd and even b/w 1 to 100====");

		int se = 0, so = 0;
		int oc = 0, ec = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				se = se + i;
				ec++;
			} else {
				so = so + i;
				oc++;
			}
		}
		System.out.println("sum of even no: " + se);
		System.out.println("count of even no: " + ec);
		System.out.println("sum of odd no: " + so);
		System.out.println("count of odd no: " + oc);

		System.out.println("====user input sum the number====");

//		int kk, vj, group;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		kk = scan.nextInt();
//		System.out.println("Enter the second number:");
//		vj = scan.nextInt();
//		group = kk + vj;
//		System.out.println("the sum of two numbers kk and vj is:" + group);

	}

}
