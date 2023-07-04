package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 연습장11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		int fAccount = 100;

		while (true) {
			System.out.println("=======인천일보은행=======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Account n = new Account();
				System.out.print("이름 > ");
				n.setName(sc.next());
				System.out.print("계좌번호 > ");
				n.setAccount(sc.next());
				System.out.print("초기입금 > ");
				n.setBalance(sc.nextInt());
				list.add(n);
				System.out.println("회원가입 성공");
				
			} else if (menu == 2) {
				System.out.print("입금 계좌 > ");
				String search = sc.next();
				System.out.print("입금 금액 > ");
				int inMoney = sc.nextInt();
				boolean find = false;
				for (Account i : list) {
					if (i.searchAccount(search)) {
						find = true;
						i.deposit(inMoney);
						System.out.println("입금 완료");
						break;
					}
				}
				if (!find) {
					System.out.println("계좌 없음");
				}
				
			} else if (menu == 3) {
				System.out.print("출금 계좌 > ");
				String search = sc.next();
				System.out.print("출금 금액 > ");
				int ounMoney = sc.nextInt();
				boolean find = false;
				for (Account o : list) {
					if (o.searchAccount(search)) {
						find = true;
						if (o.withdraw(ounMoney)) {
							System.out.println("출금 완료");
						}else {
							System.out.println("잔액 부족");
						}
						break;
					}
				}
				if (!find) {
					System.out.println("계좌 없음");
				}
				
			} else if (menu == 4) {
				System.out.println("이름\t계좌번호\t잔액\t가입일");
				System.out.println("================================");
				for (int i = 0; i < list.size();i++) {
					list.get(i).print();
				}
			} else if (menu == 5) {
				System.out.print("출금계좌 > ");
				String go = sc.next();
				System.out.print("입금계좌 > ");
				String come = sc.next();
				System.out.print("송금금액 > ");
				int send = sc.nextInt();
				boolean of = false;
				boolean in = false;
				for(Account o : list) {
					if (o.searchAccount(go)) {
						of = true;
						for (Account i : list) {
							if (i.searchAccount(come)) {
								in = true;
								if (o.withdraw(send)) {
									i.deposit(send);
									System.out.println("송금 완료.");
								}else {
									System.out.println("잔액이 부족합니다.");
								}
								break;
							}
						}
						break;
					}
				}
				if (of) {
					if (!in) {
						System.out.println("입금계좌 없음");
					}
				}else {
					System.out.println("출금계좌 없음");
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
