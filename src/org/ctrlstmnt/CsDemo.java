package org.ctrlstmnt;

public class CsDemo {
	public static void main(String[] args) {
		int a = 26;
		int b = 5;
		for (int i = 0; i < a; i = i + b) {
			// i=0, 0<26 true , i=0+5=5
			// i=5 , 5<26 true , i=5+5=10
			int n = i;
			// n=0
			// n=5
			for (int j = 1; j <= b; j++) {
				// j=1 , 1<=5 true, j=1+1=2
				int m = n + j;
				// m=0+1=1
				// m=5+1=6
				if (m <= a) {
					// 1<=26 true
					// 6<=26 true
					// 27<=26 false
					System.out.print(m + " ");
				}
			}
			System.out.println();
		}

	}
}