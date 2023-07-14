package ex11;

import java.util.Scanner;

public class Camp {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		CampDAO cdao = new CampDAO();

		boolean run = true;

		while (run) {
			System.out.println("\n*********** 캠핑장관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.캠핑장목록 |2.캠핑장조회 |3.캠핑장정보수정 |4.캠핑장추가 |0.메인메뉴");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				System.out.println("캠핑장번호\t캠핑장이름\t\t\t캠핑장주소\t캠핑장전화번호");
				for(CampVO vo : cdao.list()) {
					vo.print_land();
				}
				System.out.println("캠핑장 수 : " + cdao.list().size());
				break;
			case "2":
				while (true) {
					System.out.print("\n조회할 캠핑장 번호 > ");
					String scno = sc.nextLine();
					if(scno=="") {
						System.out.println("조회 취소");
						break;
					}else {
						CampVO scvo = cdao.search(scno);
						if (scvo.getCname()==null) {
							System.out.println("존재하지 않는 캠핑장입니다.");
						}else {
							scvo.print_port();
							break;							
						}//null값찾기
					}//scno빈칸확인 if문
				}//while
				break;
			case "3":
				while (true) {
					System.out.print("\n조회할 캠핑장 번호 > ");
					String scno = sc.nextLine();
					if(scno=="") {
						System.out.println("조회 취소");
						break;
					}else {
						CampVO ucvo = cdao.search(scno);
						if (ucvo.getCname()==null) {
							System.out.println("존재하지 않는 캠핑장입니다.");
						}else {
							ucvo.print_land();
							System.out.println();
							System.out.print("이름 : " + ucvo.getCname() + " > ");
							String ucname = sc.nextLine();
							if(ucname!="") ucvo.setCname(ucname); 
							System.out.print("주소 : " + ucvo.getCjuso() + " > ");
							String ucjuso = sc.nextLine();
							if(ucjuso!="") ucvo.setCjuso(ucjuso);
							System.out.print("전화번호 : " + ucvo.getCtel() + " > ");
							String uctel = sc.nextLine();
							if(uctel!="") ucvo.setCtel(uctel);
							ucvo.print_land();
							System.out.print("해당정보로 수정하시겠습니까?");
							String ok = sc.nextLine();
							if(ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
								cdao.update(ucvo);
								System.out.println("수정이 완료되었습니다.");
								break;
							}else {
								System.out.println("수정을 취소합니다.");
								break;
							}
						}//조회null값if
					}//조회if
				}//while
				break;
			case "4":
				CampVO ncvo = new CampVO();
				System.out.println("캠핑장 번호 > " + cdao.getNcno());
				ncvo.setCno(cdao.getNcno());
				System.out.print("캠핑장 이름 > ");
				String ncname = sc.nextLine();
				if(ncname=="") {
					System.out.println("등록을 취소합니다.");
					break;
				}else {
					ncvo.setCname(ncname);
					System.out.print("캠핑장 주소 > ");
					String ncjuso = sc.nextLine();
					ncvo.setCjuso(ncjuso);
					System.out.print("캠핑장 전화번호 > ");
					String nctel = sc.nextLine();
					ncvo.setCtel(nctel);
					ncvo.print_land();
					System.out.print("등록하시겠습니까? ");
					String ok = sc.nextLine();
					if(ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
						cdao.insert(ncvo);
						System.out.println("등록이 완료되었습니다.");
					}else {
						System.out.println("등록을 취소합니다..");
					}
				}
				break;
			default:
				System.out.println("다시 선택해주세요.");
			}
		}
	}
}
