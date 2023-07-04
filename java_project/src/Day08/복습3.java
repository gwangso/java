package Day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		
		int idx = 0;
		
		while (true) {
			System.out.println("=======은행=======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 > ");
			int menu1 = sc.nextInt();
			
			if (menu1 == 1) {
				System.out.print("이름 > ");
				name[idx] = sc.next();
				System.out.print("계좌번호 > ");
				account[idx] = sc.next();
				System.out.print("초기잔액 > ");
				balance[idx] = sc.nextInt();
				System.out.println("회원가입 되었습니다.");
				idx++;
				
			} else if (menu1==2) {
				System.out.print("입금 계좌번호 > ");
				String inaccount = sc.next();
				boolean find = false;
				for (int i = 0; i<idx; i++) {
					if ( inaccount.equals(account[i])) {
						find = true;
						System.out.print("입금하실 금액 입력 > ");
						int inmoney = sc.nextInt();
						balance[i] += inmoney;
						System.out.printf("%,d원을 입금하셨습니다.\n",inmoney);
						System.out.printf("%s님의 현제 잔액은 %,d원입니다.\n",name[i],balance[i]);
						break;
					}
				}
				if (!find) {
					System.out.println("계좌를 찾울 수 없습니다.");
				}
				
			}else if (menu1 == 3 ) {
				System.out.print("출금 계좌번호 > ");
				String outaccount = sc.next();
				boolean find = false;
				for (int i = 0; i<idx; i++) {
					if ( outaccount.equals(account[i])) {
						find =true;
						while (true){
							System.out.print("출금하실 금액 입력 > ");
							int outmoney = sc.nextInt();
							if  (balance[i] >= outmoney) {
								balance[i] -= outmoney;
								System.out.printf("%,d원을 출금하셨습니다.\n",outmoney);
								System.out.printf("%s님의 현제 잔액은 %,d원입니다.\n",name[i],balance[i]);
								break;
							}else {
								System.out.println("잔액이 부족합니다.");
								break;
							}
						}
						break;
					}
				}
				if (!find) {
					System.out.println("계좌를 찾울 수 없습니다.");
				}
				
			}else if (menu1 == 4) {
				System.out.println("회원목록\n====================================");
				System.out.println("이름\t계좌번호\t잔액");
				for (int i = 0; i <idx ; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);			
				}
		
			}else if (menu1 == 0) {
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}

	}

}
