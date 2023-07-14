package ex11;

import java.util.*;

public class Facility {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		CampDAO cdao = new CampDAO();
		FacilDAO fdao = new FacilDAO();
		boolean run = true;

		while (run) {
			System.out.println("\n*********** 시설물관리메뉴 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.시설물목록 |2.캠핑장시설물등록 |3.캠핑장시설물삭제 |0.메인메뉴");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				System.out.println("시설물번호\t시설물이름  [총 "+fdao.list().size()+"개]");
				for (FacilVO vo : fdao.list()) {
					vo.print_land();
				}
				break;
			case "2":
				boolean rep = true;
				while(rep) {
					System.out.print("\n캠핑장 번호 > ");
					String icno = sc.nextLine();
					if(icno=="") {
						System.out.println("시설물등록을 취소합니다.");
						rep = false;
					}else {
						CampVO icvo = cdao.search(icno);
						if(icvo.getCname()==null) {
							System.out.println("없는 캠핑장입니다.");
						}else {
							while(true) {
								System.out.println("캠핑장 이름 : " + icvo.getCname());
								List<CampFacilVO> cflist = fdao.cflist(icno);
								if (cflist.size()==0) {
									System.out.println("등록된 시설물이 없습니다.");
								}else {
									for (int i = 0; i<cflist.size();i++) {
										cflist.get(i).print_land();
									}								
								}
								System.out.println("-----------------------------");
								System.out.println("전체 시설물 목록");
								for(FacilVO ifvo : fdao.list()) {
									ifvo.print_land();
								}
								System.out.print("등록할 시설물 입력 > ");
								String ifno = sc.nextLine();
								if(ifno=="") {
									System.out.println("시설물등록을 취소합니다.");
									rep = false;
									break;
								}else {
									if(checkIfno(ifno,cflist, fdao.list())) {
										fdao.cfinsert(icno,Integer.parseInt(ifno));
										System.out.println("시설물등록이 완료되었습니다.");
									}
									System.out.println();
								}
							}
						}
					}					
				}
				break;
			case "3":
				boolean rep2 = true;
				while (rep2) {
					System.out.println("캠핑장번호 > ");
					String dcno = sc.nextLine();
					if (dcno=="") {
						System.out.println("시설물 삭제를 취소합니다.");
						break;
					}else {
						CampVO dcvo = cdao.search(dcno);
						if (dcvo.getCname()==null) {
							System.out.println("존재하지 않는 캠핑장입니다.");
						}else {
							while (true) {
								System.out.println("캠핑장이름 : " + dcvo.getCname());
								List<CampFacilVO> cfarray = fdao.cflist(dcno);
								if (cfarray.size()==0) {
									System.out.println("등록된 시설물이 없습니다.");
								}else {
									for (CampFacilVO vo : cfarray) {
										System.out.printf("%d:%s |\t",vo.getFno(), vo.getFname());
									}
									System.out.println("\n--------------------");
									System.out.println("삭제할시설물번호 > ");
									String dfno = sc.nextLine();
									if (dfno=="") {
										System.out.println("시설물 삭제를 취소합니다.");
										rep2 = false;
										break;
									}else {
										if(checkDfno(dfno,cfarray)) {
											System.out.print("정말로 삭제하시겠습니까?");
											String ok = sc.nextLine();
											if(ok.equals("Y") || ok.equals("y") || ok.equals("ㅛ")) {
												fdao.delete(dcno, Integer.parseInt(dfno));
												System.out.println("삭제가 완료되었습니다.");
											}else {
												System.out.println("삭제를 취소합니다.");
												rep2=false;
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
				System.out.println("다시 입력해주세요.");
			}// switch
		}//while
	}
	public static boolean checkIfno(String fno, List<CampFacilVO> cfarray, List<FacilVO> farray) {
		boolean ok = true;
		try {
			int result = Integer.parseInt(fno);
			boolean find = false;
			for(CampFacilVO vo : cfarray){
				if(vo.getFno() == result) find=true;
			}
			if (find) {
				System.out.println("이미 등록된 시설물입니다.");
				ok=false;
			}
			find = false;
			for(FacilVO vo : farray) {
				if (vo.getFno()==result) find=true;
			}
			if(!find) {
				System.out.println("존재하지 않는 시설물입니다.");
				ok=false;
			}
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요");
			ok=false;
		}
		return ok;
	}
	
	public static boolean checkDfno(String fno, List<CampFacilVO> cfarray) {
		boolean ok = true;
		try {
			int result = Integer.parseInt(fno);
			boolean find = false;
			for (CampFacilVO vo : cfarray) {
				if (vo.getFno()==result) find=true;
			}
			if (!find) { 
				System.out.println("등록되지 않은 시설물입니다.");
				ok=false;
			}
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요");
			ok = false;
		}
		return ok;
	}
	
}
