package ex11;

import java.text.*;
import java.util.*;
import java.sql.*;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("\n*********** 캠핑장사이트 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.캠핑장관리 |2.시설물관리 |3.캠핑유형관리 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				Camp.run();
			case "2":
				Facility.run();
				break;
			case "3":
				Type.run();
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}// switch
		}//while
	}
}
