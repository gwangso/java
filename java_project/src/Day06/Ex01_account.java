package Day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];

		int cnt = 0;
		
		while (true) {
			System.out.println("=================은행=================");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌목록 6.개인정보수정 0.종료");
			System.out.print("메뉴 선택 => ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("예금주의 성함을 입력해주세요 => ");
				name[cnt] = sc.next();
				System.out.print("사용하실 계좌번호를 입력해주세요 => ");
				account[cnt] = sc.next();
				System.out.print("초기입금액을 입력해주세요 => ");
				balance[cnt] = sc.nextInt();
				cnt++;
			
			} else if (menu == 2) {
				System.out.print("계좌번호를 입력해주세요 => ");
				String access = sc.next();
				boolean run2 = false;
				for (int i = 0; i < account.length; i++) {
					if (access.equals(account[i])) {
						run2 = true;
						System.out.print("입금하실 금액을 입력해 주세요 => ");
						int dps = sc.nextInt();
						balance[i] += dps;
						System.out.println(dps + "를 입금하셨습니다.");
						System.out.printf("현제 %s님의 계좌에 남은 금액은 %,d원입니다.",name[i],balance[i]);
					}
				}
				if (!run2) {
					System.out.println("계좌번호를 잘못입력했습니다.");
				}
			
			} else if (menu == 3) {
				System.out.print("계좌번호를 입력해 주세요 => ");
				String access = sc.next();
				boolean run2 = false; // 계좌번호 판단
				for (int i = 0; i < account.length; i++) {
					if (access.equals(account[i])) {
						run2 = true;
						System.out.print("출금할 금액을 입력해주세요 => ");
						int wtd = sc.nextInt();
						int com = wtd/10;
						
						if (wtd +com <= balance[i]) {
							balance[i] -= wtd+com;
							System.out.println((wtd+com) + "를 출금합니다.");
							System.out.println("수수료 : " + com);
							System.out.printf("현제 %s님의 계좌에 남은 금액은 %,d원입니다.",name[i],balance[i]);
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
				if (!run2) {
					System.out.println("계좌번호를 잘못 입력하셨습니다.");
				}
			} else if (menu == 4) {
				System.out.println("아직 준비중인 기능입니다.");
			
			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("===========================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}
			}else if (menu == 6) {
				System.out.print("계좌번호를 입력해주세요 => ");
				String access = sc.next();
				for (int i= 0; i<account.length; i++) {
					if (access.equals(account[i])){
						System.out.print("성함을 입력해 주세요 => ");
						String nName = sc.nextLine();
						if (nName != " ") {
							name[i] = nName;
						}
						System.out.println("사용하실 계좌번호를 입력하세요 => ");
						String nAccount = sc.nextLine();
						if (nAccount != " ") {
							account[i] = nAccount;
						}
					}
				}
			} else if (menu == 0) {
				break;
			
			} else {
				System.out.println("'0~3'중에 선택해주세요");
			
			}
			System.out.println();
		
		}
		System.out.println("프로그램 종료");
	
	}
}
