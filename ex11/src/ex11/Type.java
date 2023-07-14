package ex11;

import java.util.*;

public class Type {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		CampDAO cdao = new CampDAO();
		TypeDAO tdao = new TypeDAO();
		boolean run = true;

		while (run) {
			System.out.println("\n*********** 시설물관리메뉴 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.캠핑유형목록 |2.캠핑장유형등록 |3.캠핑장유형삭제 |0.메인메뉴");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				System.out.println("시설물번호\t시설물이름  [총 " + tdao.list().size() + "개]");
				for (TypeVO vo : tdao.list()) {
					vo.print_land();
				}
				break;
			case "2":
				boolean rep1 = true;
				while (rep1) {
					System.out.print("캠핑장번호 > ");
					String scno = sc.nextLine();
					if (scno == "") {
						System.out.println("등록 취소");
						break;
					} else {
						CampVO icvo = cdao.search(scno);
						if (icvo.getCname() == null) {
							System.out.println("없는 캠핑장입니다.");
						} else {
							while (true) {
								System.out.println("캠핑장 이름 : " + icvo.getCname());
								for (CampTypeVO vo : tdao.ctlist(scno)) {
									System.out.printf("%d\t%s\n", vo.getTno(), vo.getTname());
								}
								System.out.println("------------------------");
								System.out.println("남은 유형");
								for (TypeVO vo : tdao.leftlist(scno)) {
									vo.print_land();
								}
								System.out.println("추가하실 유형 > ");
								String itno = sc.nextLine();
								if (itno == "") {
									System.out.println("등록 취소");
									rep1 = false;
									break;
								} else {
									if (check(itno)) {
										TypeVO itvo = tdao.search(Integer.parseInt(itno));
										if (itvo.getTname() == null) {
											System.out.println("없는 유형입니다.");
										} else {
											boolean che = false;
											for (CampTypeVO vo : tdao.ctlist(scno)) {
												if (vo.getTno() == Integer.parseInt(itno)) {
													che = true;
												}
											}
											if (che) {
												System.out.println("이미 있는 유형입니다.");
											} else {
												System.out.print("정말로 추가하시겠습니까?");
												String ok = sc.nextLine();
												if (ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
													tdao.ctinsert(scno, Integer.parseInt(itno));
													System.out.println("추가가 완료되었습니다.");
												} else {
													System.out.println("추가를 취소합니다.");
													rep1 = false;
													break;
												}
											}
										}
									}

								}
							}
						}
					}
				}
				break;
			case "3":
				boolean rep2 = true;
				while (rep2) {
					System.out.print("캠핑장번호 > ");
					String dcno = sc.nextLine();
					if (dcno == "") {
						System.out.println("삭제 취소");
						break;
					} else {
						CampVO dcvo = cdao.search(dcno);
						if (dcvo.getCname() == null) {
							System.out.println("없는 캠핑장입니다.");
						} else {
							boolean rep3 = true;
							while (rep3) {
								System.out.println("캠핑장 이름 : " + dcvo.getCname());
								for (CampTypeVO vo : tdao.ctlist(dcno)) {
									System.out.printf("%d\t%s\n", vo.getTno(), vo.getTname());
								}
								System.out.println("------------------------");
								System.out.print("\n삭제할 유형을 선택하세요 > ");
								String dtno = sc.nextLine();
								if (dtno == "") {
									System.out.println("삭제 취소");
									rep2 = false;
									break;
								} else {
									if (check(dtno)) {
										CampTypeVO dctvo = tdao.ctsearch(dcno, Integer.parseInt(dtno));
										if (dctvo.getTname() == null) {
											System.out.println("없는 유형입니다.");
										} else {
											System.out.print("정말로 삭제하시겠습니까?");
											String ok = sc.nextLine();
											if (ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
												tdao.delete(dcno, dctvo.getTno());
												System.out.println("삭제가 완료되었습니다.");
											} else {
												System.out.println("삭제를 취소합니다.");
												rep2 = false;
												rep3 = false;
												break;
											}
										}
									}
								}
							}
						}
					}
				}
				break;
			default:
				System.out.println("다시선택해주세요");
			}
		}
	}

	public static boolean check(String tno) {
		boolean ok = false;
		try {
			int a = Integer.parseInt(tno);
			ok = true;
			return ok;
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요");
			return ok;
		}

	}
}
