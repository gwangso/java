package ex08;

import java.util.*;
import java.text.*;
import java.sql.*;

public class Main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDAO adao = new AccountDAO();
		DetailDAO ddao = new DetailDAO();
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 |2.계좌조회 |3.입금 |4.출금 |5.이체 |6.계좌목록 조회 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				System.out.print("예금주 > ");
				String nName = sc.nextLine();
				if (nName == "") {
					System.out.println("계좌생성을 취소합니다.");
					System.out.println("처음으로 돌아갑니다.");
					break;
				} else {
					AccountVO navo = new AccountVO();
					navo.setAname(nName);
					int nBalance = input("초기입금액");
					if (nBalance == 0) {
						System.out.println("계좌생성을 취소합니다.");
						System.out.println("처음으로 돌아갑니다.");
					} else {
						navo.setBalance(nBalance);
						System.out.print("계좌를 생성하시겠습니까(Y/y) > ");
						String ok = sc.nextLine();
						if (ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
							int newano = adao.insert(navo);
							DetailVO ndvo = new DetailVO();
							ndvo.setAno(newano);
							ndvo.setAmount(nBalance);
							ndvo.setDtype("입금");
							ddao.insert(ndvo);
							System.out.println(newano + "번 계좌가 새로 생성되었습니다.");
						} else {
							System.out.println("계좌생성을 취소합니다.");
							System.out.println("처음으로 돌아갑니다.");
						}
					}
				}
				break;
			case "2":
				System.out.println("\n==============계좌조회===================");
				while (true) {
					int sano = input("\n조회할계좌번호");
					if (sano == 0) {
						System.out.println("조회를 종료합니다.");
						break;
					} else {
						AccountVO savo = adao.search(sano);
						if (savo.getAname() == null) {
							System.out.println("없는 계좌입니다.");
						} else {
							savo.print_port();
							System.out.println(
									"=========================================================================\n");
							System.out.println("거래번호\t입출금액\t\t거래종류\t거래일");
							System.out.println(
									"----------------------------------------------------------------------------");
							for (DetailVO sdvo : ddao.list(sano)) {
								System.out.printf("%d\t%,d원\t\t%s\t%s\n", sdvo.getDno(), sdvo.getAmount(),
										sdvo.getDtype(), sdf.format(sdvo.getDdate()));
							}
							break;
						}
					}
				}
				break;
			case "3":
				while (true) {
					int deano = input("입금계좌번호 입력");
					if (deano == 0) {
						System.out.println("입금 취소");
						System.out.println("처음으로 돌아갑니다.");
						break;
					} else {
						try {
							AccountVO deavo = adao.search(deano);
							if (deavo.getAname() == null) {
								System.out.println("해당 계좌번호가 존재하지 않습니다.");
							} else {
								deavo.print_port();
								int dep = input("입금 금액 입력");
								if (dep == 0) {
									System.out.println("입금 취소");
									System.out.println("처음으로 돌아갑니다.");
									break;
								} else {
									deavo.setBalance(deavo.getBalance() + dep);
									adao.update(deavo);
									DetailVO dedvo = new DetailVO();
									dedvo.setAno(deano);
									dedvo.setAmount(dep);
									dedvo.setDtype("입금");
									ddao.insert(dedvo);
									System.out.println("입금이 완료되었습니다.");
									break;
								}
							}
						} catch (Exception e) {
							System.out.println("조회 오류 : " + e.toString());
						}
					}
				}
				break;
			case "4":
				boolean repeat = true;
				while (repeat) {
					int wdano = input("출금계좌번호 입력");
					if (wdano == 0) {
						System.out.println("출금 취소");
						System.out.println("처음으로 돌아갑니다.");
						break;
					} else {
						try {
							AccountVO wdavo = adao.search(wdano);
							if (wdavo.getAname() == null) {
								System.out.println("해당 계좌번호가 존재하지 않습니다.");
							} else {
								wdavo.print_port();
								System.out.println("---------------------------------------------");
								while (true) {
									int wtd = input("출금 금액 입력");
									if (wtd == 0) {
										System.out.println("출금 취소");
										System.out.println("처음으로 돌아갑니다.");
										repeat = false;
										break;
									} else {
										if (wdavo.getBalance() >= wtd) {
											System.out.print("정말로 출금하시겠습니까?(Y/y)");
											String ok = sc.nextLine();
											if (ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
												wdavo.setBalance(wdavo.getBalance() - wtd);
												adao.update(wdavo);
												DetailVO wddvo = new DetailVO();
												wddvo.setAno(wdano);
												wddvo.setAmount(wtd);
												wddvo.setDtype("출금");
												ddao.insert(wddvo);
												System.out.println("출금이 완료되었습니다.");
												repeat = false;
												break;
											} else {
												System.out.println("출금을 취소합니다.");
												System.out.println("처음으로 돌아갑니다.");
												repeat = false;
												break;
											}
										} else {
											System.out.println("잔액이 부족합니다.");
										}
									}
								}
							}
						} catch (Exception e) {
							System.out.println("계좌조회 오류 : " + e.toString());
						}
					}
				}
				break;
			case "5":
				repeat = true;
				while (repeat) {
					int outac = input("사용할 계좌번호");
					if (outac == 0) {
						System.out.println("이체 취소");
						System.out.println("처음으로 돌아갑니다.");
						break;
					} else {
						AccountVO outavo = adao.search(outac);
						if (outavo.getAname() == null) {
							System.out.println("해당 계좌번호가 존재하지 않습니다.");
							System.out.println("다시입력해주세요");
						} else {
							outavo.print_port();
							int inac = input("이체할 계좌번호");
							if (inac == 0) {
								System.out.println("출금 취소");
								System.out.println("처음으로 돌아갑니다.");
								break;
							} else {
								AccountVO inavo = adao.search(inac);
								if (inavo.getAname() == null) {
									System.out.println("해당 계좌번호가 존재하지 않습니다.");
									System.out.println("다시입력해주세요");
								} else {
									inavo.print_port();
									while (true) {
										int transfer = input("이체 금액");
										if (transfer == 0) {
											System.out.println("이체 취소");
											System.out.println("처음으로 돌아갑니다.");
											break;
										} else {
											if (outavo.getBalance() >= transfer) {
												System.out.print("정말로 이체하시겠습니까?(Y/y)");
												String ok = sc.nextLine();
												if (ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
													outavo.setBalance(outavo.getBalance() - transfer);
													inavo.setBalance(inavo.getBalance() + transfer);
													adao.update(outavo);
													adao.update(inavo);
													DetailVO otdvo = new DetailVO();
													otdvo.setAno(outavo.getAno());
													otdvo.setAmount(transfer);
													otdvo.setDtype("출금");
													ddao.insert(otdvo);
													DetailVO itdvo = new DetailVO();
													itdvo.setAno(inavo.getAno());
													itdvo.setAmount(transfer);
													itdvo.setDtype("입금");
													ddao.insert(itdvo);
													System.out.println("이체완료");
													System.out.println(outavo.toString());
													System.out.println(inavo.toString());
													repeat=false;
													break;
												} else {
													System.out.println("이체 취소");
													System.out.println("처음으로 돌아갑니다.");
													repeat = false;
													break;
												}
											} else {
												System.out.println("잔액이 부족합니다.");
											}
										}
									}
								}
							}
						}
					}
				}
				break;
			case "6":
				System.out.println("============계좌목록============");
				System.out.println("계좌번호\t예금주\t잔액");
				for (AccountVO vo : adao.list()) {
					vo.print_land();
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택해주세요.");
			}// switch
		} // while
		System.out.println("==프로그램 종료==");
	}// main mathod

	public static int input(String title) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.print(title + " > ");
			String str = sc.nextLine();
			if (str == "")
				str = "0";
			try {
				if (str != "0") {
					number = Integer.parseInt(str);
					return number;
				} else {
					return number;
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
		}
	}

}// main class
