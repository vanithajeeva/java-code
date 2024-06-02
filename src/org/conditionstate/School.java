package org.conditionstate;

import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) {
		int student1 = 99;
		int student2 = 55;
		int student3 = 49;
		int student4=89;
		
		List<Integer> li= new ArrayList<>();
		li.add(student1);
		li.add(student2);
		li.add(student3);
		li.add(student4);
		
		for (Integer et : li) {
			if (et>=80&&et<=100) {
				System.out.println("good");
			} else if(et>=0&&et<=50){
				System.out.println("fail");
			}
			else if(et>50&&et<80) {
				System.out.println("Average");
			}
		}
		

//		if (student1>=80&&student1<=100||student2>=80&&student2<=100||
//				student3>=80&&student3<=100) {
//			System.out.println("good");
//		} 
//		if(student1>=0&&student1<=50||student2>=0&&student2<=50
//				||student3>=0&&student3<=50){
//			System.out.println("fail");
//		}
//		if(student1>50&&student1<80||student2>50&&student2<80
//				||student3>50&&student3<80) {
//			System.out.println("Average");
//		}
	}
}
