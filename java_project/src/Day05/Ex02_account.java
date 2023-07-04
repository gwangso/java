package Day05;

import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] names = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;

		while (true) {
			System.out.println("======인천일보은행======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 => ");

			int menu = 0;
			if (sc.hasNextInt()) {
				menu = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

			if (menu == 1) {
				System.out.print("이름을 입력해주십시오 => ");
				names[cnt] = sc.next();
				System.out.print("사용하실 계좌번호를 입력해주십시오 => ");
				account[cnt] = sc.next();
				System.out.print("초기 잔액을 입금해주십시오 => ");
				balance[cnt] = sc.nextInt();
				cnt++;
				
			} else if (menu == 2) {
				System.out.print("입금하실 계좌를 입력해주십시오 => ");
				String access = sc.next();
				boolean ok = true;
				for (int i = 0; i < names.length; i++) {
					if (access.equals(account[i])) {
						ok = false;
						System.out.print("입금할 금액을 선택해주십시오 => ");
						balance[i] += sc.nextInt();
						System.out.println("입금이 완료되었습니다.");
						System.out.println(names[i] + "님의 현재 잔액은 " + balance[i] + "입니다.");
					}
				}
				if (ok) {
					System.out.println("입금하실 계좌를 잘못입력하셨습니다.");
					System.out.println("처음으로 돌아갑니다.");
				}

			} else if (menu == 3) {
				System.out.print("출금하실 계좌를 입력해주십시오 => ");
				String access = sc.next();
				boolean ok = false;
				boolean run2 = false;
				for (int i = 0; i < names.length; i++) {
					if (access.equals(account[i])) {
						ok = true;
						while (true) {
							System.out.print("출금할 금액을 선택해주십시오 => ");
							int pay = sc.nextInt();
							if (balance[i] < pay) {
								System.out.println("잔액이 부족합니다.");
								System.out.print("다시입력하시겠습니까(Y/y) => ");
								String re = sc.next();
								if (!(re.equals("y") || re.equals("Y"))) {
									run2 = true;
									break;
								}
							} else {
								balance[i] -= pay;
								System.out.println("출금이 완료되었습니다.");
								System.out.println(names[i] + "님의 현재 잔액은 " + balance[i] + "입니다.");
								break;
							}
							
						}
					}
				}
				if (!ok) {
					System.out.println("출금하실 계좌를 잘못입력하셨습니다.");
					System.out.println("처음으로 돌아갑니다.");
				}
				if (run2) {
					System.out.println("출금을 종료합니다.");
				}

			} else if (menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("==================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", names[i], account[i], balance[i]);
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("0~4까지만 입력할 수 있습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료하겠습니다.");

	}

}
