package Day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[10]; // 회원가입 이름 배열
		String[] id = new String[10]; // 회원가입 아이디 배열
		String[] pw = new String[10]; // 회원가입 비밀번호 배열
		String[] date = new String[10]; // 회원가입 날짜
		int[] balance = new int[10]; // 회원 잔액
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");

		int cnt = 0;
		boolean login = false;
		int loginIndex = -1;

		while (true) {
			System.out.println("=======마켓컬리=======");
			if (login) {
				System.out.println("1.물품구매 2.로그아웃 3.회원정보(" + name[loginIndex] + "님) 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (login) {
					// 물품구매
					while (true) {
						System.out.printf("========마켓커리 물품구매========[%,d원]\n", balance[loginIndex]);
						System.out.println("1.짜장면(6000) 2.짬뽕(7000) 3.탕수육(12000) 4.충전 0.나가기");
						System.out.print("선택 > ");
						int menu2 = sc.nextInt();
						if (menu2 == 1) {
							if (balance[loginIndex] >= 6000) {
								System.out.println("짜장면 구매");
								balance[loginIndex] -= 6000;
							} else {
								System.out.println("잔액 부족");
							}
						} else if (menu2 == 2) {
							if (balance[loginIndex] >= 7000) {
								System.out.println("짬뽕 구매");
								balance[loginIndex] -= 7000;
							} else {
								System.out.println("잔액 부족");
							}
						} else if (menu2 == 3) {
							if (balance[loginIndex] >= 12000) {
								System.out.println("탕수육 구매");
								balance[loginIndex] -= 12000;
							} else {
								System.out.println("잔액 부족");
							}
						} else if (menu2 == 4) {
							System.out.print("충전하실 금액을 입력해주세요 > ");
							balance[loginIndex] += sc.nextInt();
							System.out.println("현제 남아있는 잔고 : " + balance[loginIndex]);
						} else if (menu2 == 0) {
							break;
						} else {
							System.out.println("0~4까지의 수중 정해주세요.");
						}
					}
				} else {
					System.out.print("이름을 입력해주세요 > ");
					String newName = sc.next();
					String newId;
					boolean find = false;
					allroof: while (true) {
						System.out.print("아이디를 입력해주세요 > ");
						newId = sc.next();
						for (int i = 0; i <= cnt; i++) {
							if (newId.equals(id[i])) {
								System.out.println("중복되는 아이디입니다.");
								System.out.print("다시 입력하시겠습니까(Y/y) > ");
								String re = sc.next();
								if ((re.equals("Y") || re.equals("y"))) {
									break;
								} else {
									System.out.println("처음으로 돌아갑니다.");
									break allroof;
								}
							} else {
								find = false;
							}
						}
						if (find) {
							System.out.print("비밀번호를 입력해주세요 > ");
							String newPw = sc.next();
							name[cnt] = newName;
							id[cnt] = newId;
							pw[cnt] = newPw;
							LocalDateTime now = LocalDateTime.now();
							date[cnt] = dtf.format(now);
							System.out.println("회원가입에 성공했습니다.");
							cnt++;
						}
					}
				}
			} else if (menu == 2) {
				if (login) {
					// 로그아웃
					login = false;
					loginIndex = -1;
					System.out.println("로그아웃 되었습니다.");
				} else {
					System.out.print("아이디 > ");
					String loginId = sc.next();
					System.out.print("비밀번호 > ");
					String loginPw = sc.next();
					boolean findId = false;
					boolean findPw = false;
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i])) {
							findId = true;
							if (loginPw.equals(pw[i])) {
								System.out.println("로그인 성공");
								login = true;
								loginIndex = i;
								findPw = false;
								break;
							} else {
								findPw = true;
							}
						}
					}
					if (!findId) {
						System.out.println("아이디가 틀렸습니다.");
					}
					if (findPw) {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			} else if (menu == 3) {
				if (login) {
					// 회원 정보
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("==================================");
					System.out.printf("%s\t%s\t%s\t%s\n", name[loginIndex], id[loginIndex], pw[loginIndex],
							date[loginIndex]);
				} else {
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("==================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
					}
				}
			} else if (menu == 0) {
				break;
			} else {

			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
