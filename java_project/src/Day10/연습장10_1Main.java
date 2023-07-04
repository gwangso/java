package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Day09.연습장09_1;

public class 연습장10_1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<연습장10_1> join = new ArrayList<연습장10_1>();

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.회원정보 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				연습장10_1 j = new 연습장10_1(); // 객체 생성
				System.out.print("이름 > ");
				String nName = sc.next();
				System.out.print("id > ");
				String nId = j.lengthCheck();
				System.out.print("pw > ");
				String nPw = sc.next();
				연습장10_1 w = new 연습장10_1(nName, nId, nPw);
//				j.setName(nName);
//				j.setId(nId);
//				j.setPw(nPw);
				join.add(w);
				System.out.println("회원가입 성공");
			} else if (menu == 2) {
				String loginId = sc.next();
				String loginPw = sc.next();
				boolean find = false;
				for (int i = 0; i < join.size(); i++) {
					if (loginId.equals(join.get(i).getId()) && loginPw.equals(join.get(i).getPw())) {
						find = true;
						System.out.println("로그인 성공");
						break;
					}
				}
				if (!find) {
					System.out.println("로그인 실패");
				}

			} else if (menu == 3) {
				System.out.println("회원 목록");
				System.out.println("=======================================");
				for (int i = 0; i < join.size(); i++) {
					join.get(i).print();
					break;
				}

			} else if (menu == 0) {
				break;

			} else {
				System.out.println("다시선택");

			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
}
