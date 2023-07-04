package ex01;

import java.util.*;

public class Condition {

	public static void run() {
		Scanner sc = new Scanner(System.in);

		// if문, switch~case문

//
//		int grade = sc.nextInt();
//		String result = "";
//
//		if (grade >= 90) {
//			if (grade >= 95) {
//				result = "A+";
//			} else {
//				result = "A0";				
//			}
//		} else if (grade >= 80) {
//			if (grade >= 85) {
//				result = "B+";
//			} else {
//				result = "B0";				
//			}
//		} else if (grade >= 70) {
//			if (grade >= 75) {
//				result = "C+";
//			} else {
//				result = "C0";				
//			}
//		} else if (grade >= 60) {
//			result = "D";
//		} else {
//			result = "F";
//		}
//		System.out.println("등급 : " + result);
		System.out.print("시간 : ");
		int time = sc.nextInt();
		
		switch (time) { 
		case 6:
			System.out.println("기상.");
			break;
		case 7:
			System.out.println("출근하세요.");
			break;
		case 12:
			System.out.println("점심식사하세요!");
			break;
		case 18:
			System.out.println("퇴근하세요.");
			break;
		case 19:
			System.out.println("저녁식사 드세요");
			break;
		case 20:
			System.out.println("퇴근하시라니까요");
			break;
		case 21:
			System.out.println("제발 퇴근하세요");
			break;
		case 22:
			System.out.println("이러다 건강 망치셔요");
			break;
		case 23:
			System.out.println("퇴근해서 다행이에요");
			break;
		case 24:
			System.out.println("취침하세요");
			break;
		}
		
		
	}
}
