package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> privacy = new ArrayList<User>();
		
		while (true) {
			System.out.println("==========회원시스템==========");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				User nMember = new User();
				System.out.print("이름 > ");
				nMember.setName(sc.next());
				System.out.print("아이디 > ");
				nMember.setId(sc.next());
				System.out.print("비밀번호 > ");
				nMember.setPw(sc.next());
				privacy.add(nMember); // 중요
				System.out.println("'" + nMember.getName() + "'님 회원가입 성공");
			}else if (menu == 2) {
				System.out.println("아이디 > ");
				String loginId = sc.next();
				System.out.println("비밀번호 > ");
				String loginPw = sc.next();
				boolean find = false;
				for (int i = 0; i<privacy.size();i++) {
					if (loginId.equals(privacy.get(i).getId()) && loginPw.equals(privacy.get(i).getPw())) {
						find = true;
						System.out.println("로그인 성공");
						break;
					}
				}
				if (!find) {
					System.out.println("로그인 실패");
				}
				
			}else if (menu == 3) {
				System.out.println("회원 리스트");
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("=====================================");
				for (int i = 0; i<privacy.size(); i++) {
					privacy.get(i).print();
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("다시 선택");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
