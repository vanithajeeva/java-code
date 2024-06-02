package org.riddermethods;

public class StateControl {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
// i=1   i<=4   j=1   j<=3  p=j   j++   i++
//  1 	1<=4t   1	1<=3t	1	1+1
//	            2	2<=3t	2	2+1
//				3	3<=3t	3	3+1
//				4	4<=3f.........		1+1
//	2	2<=4t    1	1<=3t	1	1+1
//	            2	2<=3t	2	2+1
//				3	3<=3t	3	3+1
//				4	4<=3f.........		2+1
//	3	3<=4t	 1	1<=3t	1	1+1
//	            2	2<=3t	2	2+1
//				3	3<=3t	3	3+1
//				4	4<=3f.........		3+1
//	4	4<=4t	 1	1<=3t	1	1+1
//	            2	2<=3t	2	2+1
//				3	3<=3t	3	3+1
//				4	4<=3f.........		4+1
//	5	5<=4f...............				
				System.out.println(i);
			}
		}
	}
}
