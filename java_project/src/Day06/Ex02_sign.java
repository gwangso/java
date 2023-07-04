package Day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이름, 아이디, 비밀번호
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] date = new String[10]; // 날짜 추가

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		// 날짜 시간의 형식으 설정하고 싶을 때 사용하는 포멧
		// yyyy는 연도, MM은 월, dd는 일, hh는 시간, mm은 분, ss는 초

		int cnt = 0;

		while (true) {
			System.out.println("===========마켓커리===========");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("선택 => ");
			int menu1 = sc.nextInt();
			System.out.println();
			if (menu1 == 1) {
				System.out.print("사용자 이름을 입력해주세요 => ");
				name[cnt] = sc.next();

				System.out.print("사용하실 아이디를 입력해주세요 => ");
				id[cnt] = sc.next();
				System.out.print("사용하실 비밀번호를 입력해주세요 => ");

				LocalDateTime now = LocalDateTime.now(); // 현제 날짜 시간 구하는 법
				date[cnt] = dtf.format(now);
				// dtf.format은 아까 datetimeformatter의 형식 변수이다. 거기에 현제시간변수 now를 넣는 것

				pw[cnt] = sc.next();
				cnt++;
			} else if (menu1 == 2) {
				System.out.println("======Login Page=======");
				System.out.print("Id 입력 > ");
				String AccessId = sc.next();
				System.out.print("Pw 입력 > ");
				String AccessPw = sc.next();
				boolean idRun = false;
				boolean pwRun = false;
				for (int i = 0; i < cnt; i++) {
					if (!AccessId.equals(id[i])) {
						idRun = true;
					} else if (!AccessPw.equals(pw[i])) {
						pwRun = true;
					} else {
						System.out.println("로그인 성공.");
					}
				}
				if (idRun) {
					System.out.println("아이디가 틀렸습니다.");
				} else if (pwRun) {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else if (menu1 == 3) {
				System.out.println("이름\t아이디\t페스워드\t가입날짜");
				System.out.println("==================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
				}
			} else if (menu1 == 0) {
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");

	}

}
