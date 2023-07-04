package Day04;

import java.util.Scanner;

public class Ex02_login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pw = "1234";
		
		boolean run1 = true;
		
		while (run1) {
			System.out.println("==========로그인==========");
			System.out.print("로그인 할 아이디 => ");
			String loginId = sc.next();
			System.out.print("로그인 비밀번호 => ");
			String loginPw = sc.next();
			
			if (loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.print("아이디 혹은 비밀번호가 틀렸습니다.\n재시도하시겠습니까?(Y/y) => ");
				String retry = sc.next();
				if (!retry.equals("Y")&&!retry.equals("y")) {
					break;
				}
			}
		}
		System.out.println("프로그램을 종료하겠습니다.");
	}

}
