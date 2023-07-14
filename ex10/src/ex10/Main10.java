package ex10;

import java.util.*;
import java.text.*;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("\n*********** 메인메뉴 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.학생관리 |2.강좌관리 |3.수강신청관리 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				Students.run();
				break;
			case "2":
				Courses.run();
				break;
			case "3":
				Enrols.run();
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}// switch
		}//while
	}//Main method
}//Main class
