package Day09;

import java.util.Scanner;

public class 연습장09_1main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		연습장09_1 join[] = new 연습장09_1[10];

		int cnt = 0;

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.회원정보 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (cnt < join.length) {
					join[cnt] = new 연습장09_1(); // 객체 생성
					System.out.print("이름 > ");
					join[cnt].setName(sc.next());

					System.out.print("id > ");
					join[cnt].setId(sc.next());

					System.out.print("pw > ");
					join[cnt].setPw(sc.next());

					cnt++;
				} else {
					System.out.println("더 이상 회원을 추가할 수 없습니다.");
				}
			} else if (menu == 2) {

			} else if (menu == 3) {
				System.out.println("회원 목록");
				System.out.println("=======================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\n", join[i].getName(), join[i].getId(), join[i].getPw());
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
