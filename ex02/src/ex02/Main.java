package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("1.성적관리 | 2.상품코드");
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			ScoreManagement.run();
			break;
		case "2":
			Sale.run();
			break;
		default:
			System.out.println("다시선택");
			break;
		}
		

	}

}
