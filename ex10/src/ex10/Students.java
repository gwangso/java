package ex10;

import java.text.*;
import java.util.*;

public class Students {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		StudentsDAO sdao = new StudentsDAO();
		EnrolsDAO edao = new EnrolsDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("\n*********** 학생관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.학생목록 |2.학생조회 |3.학생등록 |0.메인메뉴");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			case "1":
				List<StudentsVO> array = sdao.list();
				System.out.println("학번\t이름\t학과");
				System.out.println("---------------------------------------");
				for (StudentsVO vo : array) {
					vo.print_land();
				}
				break;
			case "2":
				while (true) {
					System.out.print("\n조회할 학번 입력 > ");
					String sscode = sc.nextLine();
					if (sscode=="") {
						System.out.println("조회를 취소합니다.");
						break;
					}else {
						StudentsVO ssvo = sdao.search(sscode);
						if (ssvo.getSname()==null) {
							System.out.println("학생이 존재하지 않습니다.");
						}else {
							ssvo.print_port();
							System.out.println("------------------------------------");
							List<EnrolsVO> sarray = edao.slist(sscode);
							if (sarray.size()==0) {
								System.out.println("수강신청내역이 없습니다.");
								break;
							}else {
								for (EnrolsVO vo : sarray) {
									System.out.printf("%s\t%-20"
											+ "s\t%d\t%s\n",
											vo.getCcode(),vo.getCname(),
											vo.getGrade(),sdf.format(vo.getEdate()));
								}
							}
						}
					}
				}
				break;
			case "3":
				StudentsVO nsvo = new StudentsVO();
				System.out.println("학번 > " + sdao.getNscode());
				nsvo.setScode(sdao.getNscode());
				System.out.print("이름 > ");
				String nsname = sc.nextLine();
				if(nsname=="") {
					System.out.println("등록을 취소합니다.");
				}else {
					nsvo.setSname(nsname);
					System.out.print("학과 > ");
					String nsdept = sc.nextLine();
					if (nsdept == "") {
						System.out.println("등록을 취소합니다.");
					}else {
						nsvo.setSdept(nsdept);
						System.out.println(nsvo.toString());
						System.out.print("해당 정보로등록하시겠습니까?(Y/y) > ");
						String nok = sc.nextLine();
						if (nok.equals("Y") || nok.equals("y") || nok.equals("ㅛ")) {
							sdao.insert(nsvo);
							System.out.println("등록이 완료되었습니다.");
						}else {
							System.out.println("등록을 취소합니다.");
						}
					}
				}
				break;
			case "4":
				while (true) {
					System.out.print("학번 조회 > ");
					String sscode = sc.nextLine();
					if (sscode == "") {
						System.out.println("조회를 취소합니다.");
						break;
					}else {
						StudentsVO scvo = sdao.search(sscode);
						if (scvo.getSname()==null) {
							System.out.println("없는 학생입니다.");
						}else {
							System.out.print("이름 : " + scvo.getSname() + " > ");
							String usname = sc.nextLine();
							if(usname == "") {
								System.out.println("갱신을 취소합니다.");
								break;
							}else {
								scvo.setSname(usname);
								System.out.print("학과 : " + scvo.getSdept() + " > ");
								String usdept = sc.nextLine();
								if(usdept == "") {
									System.out.println("갱신을 취소합니다.");
									break;
								}else {
									scvo.setSdept(usdept);
									System.out.print("해당 정보로 갱신하시겠습니까?(Y/y) > ");
									String uok = sc.nextLine();
									if (uok.equals("Y") || uok.equals("y") || uok.equals("ㅛ")) {
										sdao.update(scvo);
										System.out.println("갱신이 완료되었습니다.");
										break;
									}else {
										System.out.println("갱신을 취소합니다.");
										break;
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
	}//run method
}//Students class
