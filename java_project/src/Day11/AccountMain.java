package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();

		while (true) {
			System.out.println("=======인천일보은행=======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Account a = new Account();
				System.out.print("성함을 입력해주세요 > ");
				a.setName(sc.next());
				System.out.print("사용하실 계좌번호를 입력해주세요 > ");
				a.setAccount(sc.next()); // 이것 역시 100부터 시작
				System.out.print("초기입금액을 입력해주세요 > ");
				a.setBalance(sc.nextInt());
				list.add(a);
				System.out.println("계좌생성에 성공하셨습니다.");

			} else if (menu == 2) {
				System.out.print("입금할 계좌의 번호를 입력해주세요 >");
				String search = sc.next();
				boolean find = false;
				System.out.print("입금할 금액을 입력해주세요 > ");
				int inMoney = sc.nextInt();
				for (Account s : list) {
					if (s.getAccount().equals(search)) {
						find = true;
						s.deposit(inMoney);
						System.out.println(inMoney + "를 입금하셨습니다.");
						System.out.println("'" + s.getName() + "'님의 현재 잔액은 [" + s.getBalance() + "]입니다.");
						break;
					}
				}
				if (!find) {
					System.out.println("계좌번호를 찾을 수 없습니다.");
				}
			} else if (menu == 3) {
				System.out.print("출금할 계좌의 번호를 입력해주세요 >");
				String search = sc.next();
				boolean find = false;
				System.out.print("출금할 금액을 입력해주세요 > ");
				int outMoney = sc.nextInt();
				for (Account s : list) {
					if (search.equals(s.getAccount())) {
						find = true;
						if (s.withdraw(outMoney)) {
							System.out.println(outMoney + "를 출금하셨습니다.");
							System.out.println("'" + s.getName() + "'님의 현재 잔액은 [" + s.getBalance() + "]입니다.");
						} else {
							System.out.println("잔액이 부족합니다.");
						}
						break;
					}
				}
				if (!find) {
					System.out.println("계좌번호를 찾을 수 없습니다.");
				}

			} else if (menu == 4) {
				System.out.println("이름\t계좌번호\t잔액\t가입일");
				System.out.println("=======================");
				for (Account s : list) {
					s.print();
				}
			} else if (menu == 5) {
				System.out.print("출금할 계좌를 입력해주세요 > ");
				String outAccount = sc.next();
				System.out.print("입금 계좌를 입력해주세요 > ");
				String inAccount = sc.next();
				System.out.print("송금하실 금액을 입력해주세요 > ");
				int sendMoney = sc.nextInt();
				int of = -1;
				int in = -1;
				for (int i = 0; i<list.size(); i++) {
					if (list.get(i).getAccount().equals(outAccount)) {
						of = i;
						break;
					}
				}
				for(int i=0; i<list.size(); i++) {
					if(outAccount.equals(list.get(i).getAccount())) {
						of = i;
					}
					if(inAccount.equals(list.get(i).getAccount())) {
						in = i;
					}
				}
				if(of == -1) {
					System.out.println("출금계좌를 찾을 수 없습니다.");
				}else if(in == -1) {
					System.out.println("입금계좌를 찾을 수 없습니다.");
				}else {
					if(list.get(of).withdraw(sendMoney)) {
						list.get(in).deposit(sendMoney);
						System.out.println("이체성공");
					}else {
						System.out.println("잔액부족");
					}
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
