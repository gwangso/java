package ex07;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOimpl(); // 인터페이스는 생성자가 없어서 impl의 생성자 사용
		SaleDAOimpl sdao = new SaleDAOimpl();
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |6.판매정보조회 |7.판매등록 |8.판매현황 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				ProductVO ivo = new ProductVO();
				System.out.print("상품 이름 > ");
				ivo.setPname(sc.nextLine());
				boolean run2 = true;
				while (run2) {
					int nPrice = input("상품가격");
					if(nPrice == 0) {
						System.out.println("가격설정을 다시해주세요");
					}else {
						ivo.setPprice(nPrice);
						run2=false;
					}
				}
				try {
					dao.insert(ivo);
					System.out.println("상품등록이 완료되었습니다.");
				} catch (Exception e) {
					System.out.println("상품등록 오류 : " + e.toString());
				}
				break;
			case "2":
				System.out.print("상품 코드 > ");
				String pcode = sc.nextLine();
				if (pcode == "") {
					System.out.println("처음으로 돌아갑니다.");

				} else {
					try {
						ProductVO svo = dao.search(Integer.parseInt(pcode));
						if (svo.getPname() == null) {
							System.out.println("해당 상품이 존재하지 않습니다.");
						} else {
							svo.print_port();
						}
					} catch (Exception e) {
						System.out.println("상품 조회 오류" + e.toString());
					}
				}
				break;
			case "3":
				System.out.println("상품코드\t상품이름\t\t\t\t상품각격");
				try {
					for (ProductVO vo : dao.list()) {
						vo.print_land();
					}
				} catch (Exception e) {
					System.out.println("목록출력 오류입니다." + e.toString());
				}
				break;
			case "4":
				System.out.print("상품 코드 > ");
				String ucd = sc.nextLine();
				try {
					if (ucd == "") {
						System.out.println("처음으로 돌아갑니다.");
					} else {
						ProductVO uvo = dao.search(Integer.parseInt(ucd));
						if (uvo.getPname() == null) {
							System.out.println("해당 상품이 존재하지 않습니다.");
						} else {
							System.out.println("상품 이름 : " + uvo.getPname());
							System.out.print("새로운 상품이름 > ");
							String uName = sc.nextLine();
							if (uName !="") uvo.setPname(uName);
							System.out.println("상품 가격 : " + df.format(uvo.getPprice()));
							int uPrice = input("새로운 상품가격");
							if (uPrice != 0) uvo.setPprice(uPrice);	
							System.out.print("수정하시겠습니까?(Y/y) > ");
							String ok = sc.nextLine();
							if (ok.equals("y") || ok.equals("Y") || ok.equals("ㅛ")) {
								dao.update(uvo);
								uvo.print_port();
								System.out.println("수정 완료");
							}else {
								System.out.println("상품수정이 취소되었습니다.");
							}
						}
					}
				} catch (Exception e) {
					System.out.println("상품수정 오류 : " + e.toString());
				}
				break;// switch의 브레이크
			case "5":
				System.out.print("삭제할 상품코드 > ");
				String dcd = sc.nextLine();
				try {
					if (dcd == "") {
						System.out.println("처음으로 돌아갑니다.");
					} else {
						ProductVO dvo = dao.search(Integer.parseInt(dcd));
						if (dvo.getPname() == null) {
							System.out.println("해당 상품이 존재하지 않습니다.");
						} else {
							dvo.print_port();
							System.out.print("삭제하시겠습니까?(Y/y) > ");
							String ok = sc.nextLine();
							if (ok.equals("y") || ok.equals("Y") || ok.equals("ㅛ")) {
								dao.delete(dvo.getPcode());
								System.out.println("상품삭제완료!");
								// 상품이 팔린정보(자식테이블)가 있으면 팔리지 않음
							} else {
								System.out.println("상품삭제를 취소했습니다.");
							}
						}
					}
				} catch (Exception e) {
					System.out.println("상품삭제 오류 : " + e.toString());
				}
				break;
			case "6":
				int spcode = input("조회할 상품 코드");
				if(spcode == 0) {
					System.out.println("처음으로 돌아갑니다.");
				}else {
					try {
						ProductVO jvo = dao.search(spcode);
						if(jvo.getPname()==null) {
							System.out.println("해당 상품이 존재하지 않습니다.");
						}else {
							jvo.print_port();
							System.out.println("----------------------------");
							System.out.println("판매코드\t상품코드\t판매량\t판매가격\t\t총금액\t\t판매일");
							System.out.println("======================================================");
							for (SaleVO vo : sdao.list(spcode)) {
								System.out.printf("%d\t%d\t%d\t%,d원\t\t%,d원\t%s\n",
										vo.getScode(),
										vo.getPcdoe(),
										vo.getQnt(),
										vo.getSprice(),
										(vo.getQnt()*vo.getSprice()),
										sdf.format(vo.getSdate()));
							}
						}
					} catch (Exception e) {
						System.out.println("상품별 판매목록 조회 오류" + e.toString());
					}
				}
				break;
			case "7":
				int icode = input("등록할상품코드");
				if (icode==0) {
					System.out.println("처음으로 돌아갑니다.");
				}else {
					try {
						ProductVO spvo = dao.search(icode);
						if (spvo.getPname()==null) {
							System.out.println("해당 상품이 없습니다.");
						} else {
							spvo.print_port();
							SaleVO ssvo = new SaleVO();
							ssvo.setPcdoe(icode);
							System.out.println("----------------------------------");
							int sqnt = input("판매수량");
							if (sqnt == 0) {
								System.out.println("판매 수량이 없습니다.");
							}else {
								ssvo.setQnt(sqnt);
								int ssprice = input("판매가격");
								if (ssprice == 0) {
									ssvo.setSprice(spvo.getPprice());
								}else {
									ssvo.setSprice(ssprice);
								}
								sdao.insert(ssvo);
								System.out.println("판매등록 완료!");
							}
						}
					} catch (Exception e) {
						System.out.println("매출등록 오류 : " + e.toString());
					}
				}
				break;
			case "8":				
				int sum_qnt =0;
				int sum_price = 0;
				System.out.println("상품코드\t상품이름\t\t총상품개수\t총상품가격");
				System.out.println("=============================================");
				for(SaleVO vo : sdao.sum_list()) {
					System.out.printf("%d\t%s\t\t%d개\t%,d원\n",
							vo.getPcdoe(), vo.getPname(),
							vo.getQnt(),vo.getSprice());
					sum_qnt += vo.getQnt();
					sum_price += vo.getSprice();
				}
				System.out.println("------------------------------------------");
				System.out.printf("총판매수 : %d\t 총판매금액 : %,d원\n",
						sum_qnt,sum_price);
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!");
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}

	// 숫자입력 메서드
	public static int input(String str) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(str + " > ");
			try {
				String temp = sc.nextLine();
				if (temp != "") {
					number = Integer.parseInt(temp);
				}
				return number;
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요!");
			}
		}
	}

}
