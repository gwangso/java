package Day04;

import java.util.Scanner;

public class Ex08_sign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String id = "";
		String pw = "";
		boolean login = false;
		
		while (true) {
			System.out.println("===========회원가입=============");
			if(login) {
				System.out.println("1.회원정보 2.로그아웃 0.종료");
			}else {
				System.out.println("1.회원가입 2.로그인 0.종료");	
			}
			
			System.out.print("메뉴를 선택해주세요 => ");
			int menu1 = sc.nextInt();
			
			if (menu1 == 1){
				if(login) {
					System.out.println("이름\t아이디\t비밀번호");
					System.out.println("---------------------------");
					System.out.printf("%s\t%s\t%s\n",name, id, pw);
				}else {
					System.out.print("이름을 입력해주십시오 => ");
					name = sc.next();
					System.out.print("사용하실 아이디를 입력해주십시오 => ");
					id = sc.next();
					System.out.print("사용하실 페스워드를 입력해주십시오 => ");
					pw = sc.next();
					System.out.println(name + "님, 회원가입을 축하드립니다.");
				}
				
				
			}else if (menu1 == 2) {
				if(login) {
					login = false;
					System.out.println(name + "님이 로그아웃 되었습니다.");
				}else {
					while (true) {
						System.out.println("-----Login Page-----");
						System.out.print("아이디를 입력해주세요 => ");
						String loginId = sc.next();
						System.out.print("비밀번호를 입력해주세요 => ");
						String loginPw = sc.next();
						if (loginId.equals(id) && loginPw.equals(pw)) {
							System.out.println("로그인 완료");
							login = true;
							break;
						}else {
							System.out.println("로그인 실패");
							System.out.print("다시시도하겠습니까(Y/y) => ");
							String menu2 = sc.next();
							if (!(menu2.equals("Y")||menu2.equals("y"))) {
								break;
							}
					
						}
					}
				}
			}else if (menu1 == 0) {
				break;
			}else {
				System.out.println("0~3까지 입력 가능합니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
