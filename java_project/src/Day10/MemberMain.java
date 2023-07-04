package Day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> privacy = new ArrayList<Member>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

		while (true) {
			System.out.println("=======맴버관리=======");
			System.out.println("1.맴버등록 2.맴버리스트 3.검색 4.비밀번호변경 5.맴버삭제 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이메일 등록 > ");
				String nEmail = sc.next();
				System.out.print("비밀번호 설정 > ");
				String nPw = sc.next();
				System.out.print("이름 > ");
				String nName = sc.next();
				String date = dtf.format(LocalDateTime.now());
				Member m2 = new Member(nEmail, nPw, nName, date);
				privacy.add(m2);
				System.out.println("'" + nName + "'님 회원가입이 완료되었습니다.");
			} else if (menu == 2) {
				System.out.println("이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("______________________________________________________");
				for (int i = 0; i < privacy.size(); i++) {
					privacy.get(i).print();
				}
			} else if (menu == 3) {
				System.out.print("이메일을 입력해주세요 > ");
				String search = sc.next();
				boolean find = false;
				for (int i = 0; i < privacy.size(); i++) {
					if (search.equals(privacy.get(i).getEmail())) {
						find = true;
						privacy.get(i).print();
						break;
					}
				}
				if (!find) {
					System.out.println("이메일을 찾을 수 없습니다.");
				}
			} else if (menu == 4) {
				System.out.print("이메일을 입력해주세요 > ");
				String search = sc.next();
				boolean find = false;
				for (int i = 0; i < privacy.size(); i++) {
					if (search.equals(privacy.get(i).getEmail())) {
						find = true;
						System.out.println("수정할 비밀번호 > ");
						privacy.get(i).setPw(sc.next());
						// 위의 방식은 객체의 일부분을 바꾸는 방식이다.
						// privacy.set(i, null)은 객체자체를 바꾸는 역할이다.
						// 그래서 set(int, null)은 많이 안쓰임
						break;
					}
				}
				if (!find) {
					System.out.println("이메일을 찾을 수 없습니다.");
				}
			} else if (menu == 5) {
				System.out.print("이메일을 입력해주세요 > ");
				String search = sc.next();
				boolean find = false;
				for (int i = 0; i < privacy.size(); i++) {
					if (search.equals(privacy.get(i).getEmail())) {
						find = true;
						privacy.remove(i);
						System.out.println("성공적으로 탈퇴했습니다.");
						break;
					}
				}
				if (!find) {
					System.out.println("이메일을 찾을 수 없습니다.");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
