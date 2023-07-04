package Day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01_login_acoount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		String[] date = new String[10];
		int cnt = 0;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd - hh:mm:ss");

		int access = -1;

		while (true) {

			if (access < 0) {
				System.out.println("========스마트뱅킹========");
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			} else {
				System.out.println("========스마트뱅킹========" + name[access]);
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료");
			}

			System.out.print("메뉴선택 > ");
			int menu1 = sc.nextInt();

			if (menu1 == 1) {
				if (access < 0) {
					System.out.print("이름을 입력해주세요 > ");
					name[cnt] = sc.next();
					System.out.print("사용하실 아이디를 입력해주세요 > ");
					id[cnt] = sc.next();
					System.out.print("사용하실 비밀번호를 입력해주세요 > ");
					pw[cnt] = sc.next();
					System.out.print("사용하실 계좌번호를 입력해주세요 > ");
					account[cnt] = sc.next();
					System.out.print("초기입금액을 입력해주세요 > ");
					balance[cnt] += sc.nextInt();
					LocalDateTime now = LocalDateTime.now();
					date[cnt] = dtf.format(now);
					System.out.println(name[cnt] + "님, 회원가입을 축하합니다.");
					cnt++;
				} else {
					System.out.println("예금주\t아이디\t비밀번호\t계좌번호\t잔액\t\t가입일");
					System.out.println("=======================================================================");
					System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s\n", name[access], id[access], pw[access],
							account[access], balance[access], date[access]);
				}

			} else if (menu1 == 2) {
				if (access < 0) {
					System.out.println("=======Login Page=======");
					System.out.print("아이디 > ");
					String loginId = sc.next();
					System.out.print("비밀번호 > ");
					String loginPw = sc.next();
					boolean find = false;
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							System.out.println(name[i] + "님 반갑습니다!");
							find = true;
							access = i;
							break;
						}
					}
					if (!find) {
						System.out.println("로그인 실패");
					}
				} else {
					access = -1;
					System.out.println("로그아웃 되셨습니다.");
				}

			} else if (menu1 == 3) {
				if (access < 0) {
					System.out.println("회원목록\n예금주\t아이디\t비밀번호\t계좌번호\t잔액\t\t가입일");
					System.out.println("=======================================================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s\n", name[i], id[i], pw[i], account[i], balance[i],
								date[i]);
					}
				} else {
					System.out.print("입금하실 금액을 입력해 주세요 >");
					int inmoney = sc.nextInt();
					balance[access] += inmoney;
					System.out.println(inmoney + "를 입금하셨습니다.");
					System.out.printf("현제 %s님에게 남아있는 잔액은 %,d 입니다.\n", name[access], balance[access]);
				}

			} else if (menu1 == 4 && access >= 0) {
				System.out.print("출금하실 금액을 입력해 주세요 >");
				int outmoney = sc.nextInt();

				if (outmoney <= balance[access]) {
					System.out.print("비밀번호를 입력해 주세요 > ");
					String accPw = sc.next();
					if (accPw.equals(pw[access])) {
						balance[access] -= outmoney;
						System.out.println(outmoney + "를 출금하셨습니다.");
						System.out.printf("현제 %s님에게 남아있는 잔액은 %,d 입니다.\n", name[access], balance[access]);
					} else {
						System.out.println("비밀번호를 틀리셨습니다.");
					}
				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu1 == 5 && access >= 0) {

				System.out.print("보내실 계좌번호를 입력하십시오 > ");
				String toAccount = sc.next();
				System.out.print("송금하실 금액을 입력하십시오 > ");
				int sendmoney = sc.nextInt();
				System.out.print("비밀번호를 입력해 주세요 > ");
				String accPw = sc.next();

				int a = -1;
				for (int i = 0; i < cnt; i++) {
					if (toAccount.equals(account[i])) {
						a = i;
						break;
					}
				}

				if (accPw.equals(pw[access])) {
					if (sendmoney <= balance[access]) {
						if (a != -1) {
							balance[access] -= sendmoney;
							balance[a] += sendmoney;
							System.out.println(name[a] + "님에게 " + sendmoney + "를 송금하셨습니다.");
							System.out.println("현제 " + name[access] + "님에게 남아있는 잔액은 " + balance[access] + "입니다.");
						} else {
							System.out.println("계좌를 찾을 수 없습니다.");
						}
					} else {
						System.out.println("잔액이 부족합니다.");
					}

				} else {
					System.out.println("비밀번호를 틀리셨습니다.");
				}
			} else if (menu1 == 0) {
				break;
			} else {
				System.out.println("다시선택해주세요");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
