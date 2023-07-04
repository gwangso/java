package Day07;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int idx = 0;

		while (true) {
			System.out.println("=======은행=======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴선택 > ");
			int menu1 = sc.nextInt();

			if (menu1 == 1) {
				System.out.print("성함을 입력해 주세요 > ");
				name[idx] = sc.next();
				System.out.print("사용하실 계좌번호를 입력해주세요 > ");
				account[idx] = sc.next();
				System.out.print("초기 잔액을 설정해주세요 > ");
				balance[idx] += sc.nextInt();
				System.out.println("계좌생성을 축하드립니다.");
				idx++;

			} else if (menu1 == 2) {
				System.out.print("계좌번호를 입력해주세요 > ");
				String access = sc.next();
				boolean jud = false;
				for (int i = 0; i < idx; i++) {
					if (access.equals(account[i])) {
						System.out.print("입금하실 금액을 입력해주세요 > ");
						balance[i] += sc.nextInt();
						jud = true;
						break;
					}
				}
				if (!jud) {
					System.out.println("계좌를 잘못입력하셨습니다.");
				}

			} else if (menu1 == 3) {
				System.out.print("계좌번호를 입력해주세요 > ");
				String access = sc.next();
				boolean jud = false;

				for (int i = 0; i < idx; i++) {
					if (access.equals(account[i])) {
						jud = true;
						System.out.print("출금하실 금액을 입력해주세요 > ");
						int out = sc.nextInt();
						if (out > balance[i]) {
							System.out.println("잔액이 부족합니다.");
						} else {
							balance[i] -= out;
							System.out.println(name[i] + "님의 계좌에는 " + balance[i] + "원이 남아있습니다.");
						}
						break;
					}
				}
				if (!jud) {
					System.out.println("계좌를 잘못입력하셨습니다.");
				}

			} else if (menu1 == 4) {
				System.out.println("계좌정보\n예금주\t계좌번호\t잔액");
				System.out.println("===================================================");
				for (int i = 0; i < idx; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}

			} else if (menu1 == 5) {
				boolean run1 = false;
				boolean run2 = false;
				boolean run3 = false;
				System.out.print("출금하실 계좌를 입력해주세요 > ");
				String outAcoount = sc.next();
				for (int i = 0; i < idx; i++) {
					if (outAcoount.equals(account[i])) {
						run1 = true;
						System.out.print("입금하실 계좌를 입력해주세요 > ");
						String inAcoount = sc.next();
						for (int j = 0; j < idx; j++) {
							if (inAcoount.equals(account[j])) {
								run2 = true;
								System.out.print("이체하실 금액을 입력해주세요 > ");
								int money = sc.nextInt();
								if (money <= balance[i]) {
									run3 = true;
									balance[i] -= money;
									balance[j] += money;
									System.out.println(name[i] + "님이 " + name[j] + "님에게 " + money + "원을 송금하셨습니다.");
									System.out.println(name[i] + "님의 계좌의 잔액은 " + balance[i] + "입니다.");
									System.out.println(name[j] + "님의 계좌의 잔액은 " + balance[j] + "입니다.");
									i = idx;
									j = idx;
								}
							}
						}
					}
				}
				if (!run1) {
					System.out.println("출금하실 계좌를 잘못입력하셨습니다.");
				} else if (!run2) {
					System.out.println("입금하실 계좌를 찾을 수 없습니다.");
				} else if (!run3) {
					System.out.println("잔액이 부족합니다.");
				}
//				System.out.print("출금하실 계좌를 입력해주세요 > ");
//				String outAcoount = sc.next();
//				System.out.print("입금하실 계좌를 입력해주세요 > ");
//				String inAcoount = sc.next();
//				System.out.print("이체하실 금액을 입력해주세요 > ");
//				int money = sc.nextInt();
//
//				int outIndex = -1;
//				int inIndex = -1;
//				
//				for (int i=0;i<idx;i++) {
//					if (outAcoount.equals(account[i])) {
//						outIndex = i;
//					}
//					if (outAcoount.equals(account[i])) {
//						inIndex = i;
//					}
//				}
//				
//				if(outIndex == -1) {
//					System.out.println("출금하실 계좌를 잘못입력하셨습니다.");
//				}else if(inIndex == -1) {
//					System.out.println("입금하실 계좌를 잘못입력하셨습니다.");
//				}else {
//					if(balance[outIndex] >= money) {
//						balance[outIndex] -= money;
//						balance[inIndex] += money;
//					}else {
//						System.out.println("잔액이 부족합니다.");
//					}
//				}

			} else if (menu1 == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}