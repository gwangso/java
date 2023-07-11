package ex06;

import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		SaleDAO sdao = new SaleDAO();
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |6.판매정보조회 |7.판매등록 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				ProductVO ip = new ProductVO();
//				System.out.println("코드 > " + );
				System.out.print("상품이름 > ");
				String iname = sc.nextLine();
				if (iname == "") {
					System.out.println("입력 종료");
					break;
				} else {
					while (true) {
						System.out.print("상품가격 > ");
						String iprice = sc.nextLine();
						if (isNumber(iprice)) {
							ip.setPname(iname);
							ip.setPprice(Integer.parseInt(iprice));
							dao.insult(ip);
							break;
						}
					}
				}
				break;
			case "2":
				while (true) {
					System.out.print("상품코드 > ");
					String scd = sc.nextLine();
					if (scd == "") {
						System.out.println("조회를 종료합니다.");
						break;
					} else {
						if (isNumber(scd)) {
							ProductVO ps = dao.searchCode(Integer.parseInt(scd));
							if (ps.getPname() == null) {
								System.out.println("해당상품이 존재하지 않습니다.");
							} else {
								ps.print_port();
								break;
							}
						}
					}
				}
				break;
			case "3":
				for (ProductVO vo : dao.list()) {
					System.out.printf("%d\t%-25s\t%s\n", vo.getPcode(), vo.getPname(), df.format(vo.getPprice()));
					// df.format을 하면 String으로 변하니까
					// %-20s 20칸을 만들고 왼쪽부터 채워넣기
				}
				break;
			case "4":
				boolean run2 = true;
				while (run2) {
					System.out.print("변경할 상품코드 > ");
					String ucd = sc.nextLine();
					if (ucd == "") {
						System.out.println("수정 취소");
						break;
					} else {
						if (isNumber(ucd)) {
							ProductVO uvo = dao.searchCode(Integer.parseInt(ucd));
							if (uvo.getPname() == null) {
								System.out.println("없는 상품");
							} else {
								System.out.println();
								uvo.print_port();
								System.out.print("변경할 이름 > ");
								String uname = sc.nextLine();
								if (uname != "") {
									uvo.setPname(uname);
								}
								while (true) {
									System.out.print("변경할 가격 > ");
									String uprice = sc.nextLine();
									if (isNumber(uprice)) {
										uvo.setPprice(Integer.parseInt(uprice));
										dao.update(uvo);
										break;
									}
								}
								break;

							}
						}
					}
				}
				break;
			case "5":
				while (true) {
					System.out.print("삭제할 상품코드 > ");
					String dcd = sc.nextLine();
					if (dcd == "") {
						System.out.println("삭제 취소");
						break;
					} else {
						if (isNumber(dcd)) {
							ProductVO dvo = dao.searchCode(Integer.parseInt(dcd));
							if (dvo.getPname() == null) {
								System.out.println("상품이 존재하지 않습니다.");
							} else {
								dvo.print_port();
								System.out.print("정말로 삭제하시겠습니까?(Y/y) > ");
								String ok = sc.nextLine();
								if (ok.equals("y") || ok.equals("Y") || ok.equals("ㅛ")) {
									try {
										dao.delete(dvo.getPcode());
									} catch (Exception e) {
										System.out.println("상품 삭제에 실패했습니다.");
									}
								} else {
									System.out.println("삭제를 취소했습니다.");
									System.out.println("처음으로 돌아갑니다.");
								}
								break;
							}
						}
					}
				}
				break;
			case "6":
				while (true) {
					System.out.print("조회할 상품코드 > ");
					String js = sc.nextLine();
					if (js.equals("")) {
						System.out.println("조회 취소");
						break;
					} else {
						if (isNumber(js)) {
							ProductVO jpvo = dao.searchCode(Integer.parseInt(js));
							if (jpvo.getPname() == null) {
								System.out.println("조회할 상품이 없습니다.");
							} else {
								jpvo.print_port(); // 판매상품 정보
								for (SaleVO vo : sdao.list(jpvo.getPcode())) {
									System.out.printf("%-15s\t%d\t%s\t%s\t%s\n", jpvo.getPname(), vo.getQnt(),
											df.format(vo.getSprice()), df.format(vo.getQnt() * vo.getSprice()),
											sdf.format(vo.getSdate()));
								}
								break;
							}
						}
					}

				}
				break;
			case "7":
				// 상품판매
				boolean f1 = true;
				boolean f2 = true;
				boolean f3 = true;
				while (f1) {
					System.out.print("상품 코드 조회 >");
					String ss = sc.nextLine();
					if (ss == "") {
						System.out.println("판매 취소");
						break;//f1의 break
					} else {
						if (isNumber(ss)) {
							ProductVO psvo = dao.searchCode(Integer.parseInt(ss));
							if (psvo.getPname() == null) {
								System.out.println("없는 상품입니다.");
							} else {
								psvo.print_port();
								SaleVO ssvo = new SaleVO();
								ssvo.setPcdoe(psvo.getPcode());
								while (f2) {
									System.out.print("판매 수량 > ");
									String bnum = sc.nextLine();
									if (bnum == "") {
										ssvo.setQnt(1);
										System.out.println("1개 구매");
									} else {
										if (isNumber(bnum)) {
											ssvo.setQnt(Integer.parseInt(bnum));
										} else {
											continue;
										}
									}
									while (f3) {
										System.out.print("판매 가격 > ");
										String sprice = sc.nextLine();
										if (sprice == "") {
											ssvo.setSprice(psvo.getPprice());
											System.out.println(psvo.getPname() + "의 가격은 "+ psvo.getPprice()+"입니다.");
											ssvo.setSprice(psvo.getPprice());
											System.out.println(ssvo.toString());
											sdao.sInsert(ssvo);
											System.out.println("판매등록이 완료되었습니다.");
											f1=false;
											break;
										} else {
											if (isNumber(sprice)) {
												ssvo.setSprice(Integer.parseInt(sprice));
												System.out.println(psvo.getPname() + "의 가격은 "+ ssvo.getSprice()+"입니다.");
												System.out.println(ssvo.toString());
												sdao.sInsert(ssvo);
												System.out.println("판매등록이 완료되었습니다.");
												f1=false;
												break;
											}
										} // 공백이 아닌 문자는 다시입력
									} // f3반복문
									break;
								} // f2반복문
							}
						} // 숫자 아닌 else문 생략
					}
				} // f1반복문
				break;//switch의 break;
			default:
				System.out.println("다시선택");
			}
		}
	}

	// 숫자인지 판별하는 메서드
	public static boolean isNumber(String str) {
		try {
			int number = Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요!");
			return false;
		}
	}
}
