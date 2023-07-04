package Day10;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MembershipMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Membership> join = new ArrayList<Membership>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd - hh:mm:ss");
		
		int access = -1;
			
		while (true) {
			
			if (access < 0) {
				System.out.println("========스마트뱅킹========");
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			} else {
				System.out.println("========스마트뱅킹========");
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료");
			}
			
			System.out.print("메뉴선택 > ");
			int menu1 = sc.nextInt();
			
			if (menu1 == 1) {
				if (access < 0) {
					Membership m = new Membership();
					m.nJoin();
					join.add(m);
					System.out.println("'" + m.getName() + "'님, 회원가입을 축하합니다.");
				} else {
					System.out.println("예금주\t아이디\t비밀번호\t계좌번호\t잔액\t\t가입일");
					System.out.println("=======================================================================");
					join.get(access).print();
				}
				
			} else if (menu1 == 2) {
				if (access < 0) {
					System.out.println("=======Login Page=======");
					System.out.print("아이디 > ");
					String loginId = sc.next();
					System.out.print("비밀번호 > ");
					String loginPw = sc.next();
					boolean find = false;
					for (int i = 0; i < join.size(); i++) {
						if (loginId.equals(join.get(i).getId()) && loginPw.equals(join.get(i).getPw())) {
							System.out.println(join.get(i).getName() + "님 반갑습니다!");
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
					for (Membership i : join) {
						i.print();
					}
				} else {
					System.out.print("입금하실 금액을 입력해 주세요 >");
					int inmoney = sc.nextInt();
//					Membership m = new Membership();
					join.get(access).deposit(inmoney);
					System.out.println(inmoney + "를 입금하셨습니다.");
					System.out.printf("현제 %s님에게 남아있는 잔액은 %,d 입니다.\n", join.get(access).getId(), join.get(access).getBalance());
				}
				
			} else if (menu1 == 4 && access >= 0) {
				System.out.print("출금하실 금액을 입력해 주세요 >");
				int outmoney = sc.nextInt();
				
				if (outmoney <= join.get(access).getBalance()) {
					System.out.print("비밀번호를 입력해 주세요 > ");
					String accPw = sc.next();
					if (accPw.equals(join.get(access).getPw())) {
						join.get(access).outgo(outmoney);
						System.out.println(outmoney + "를 출금하셨습니다.");
						System.out.printf("현제 %s님에게 남아있는 잔액은 %,d 입니다.\n", join.get(access).getId(), join.get(access).getBalance());
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
				for (int i = 0; i < join.size(); i++) {
					if (toAccount.equals(join.get(access).getPw())) {
						a = i;
						break;
					}
				}
				if (accPw.equals(join.get(access).getPw())) {
					if (sendmoney <= join.get(access).getBalance()) {
						if (a != -1) {
							join.get(access).outgo(sendmoney);
							join.get(a).deposit(sendmoney);
							System.out.println(join.get(a).getId() + "님에게 " + sendmoney + "를 송금하셨습니다.");
							System.out.println("현제 " + join.get(access).getId() + "님에게 남아있는 잔액은 " + join.get(access).getBalance() + "입니다.");
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