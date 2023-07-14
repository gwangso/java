package ex10;

import java.text.*;
import java.util.*;

public class Enrols {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		StudentsDAO sdao = new StudentsDAO();
		CoursesDAO cdao = new CoursesDAO();
		EnrolsDAO edao = new EnrolsDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;
		
		while (run) {
			System.out.println("\n*********** 수강신청관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.수강신청목록 |2.수강신청 |3.수강철회 |4.성적등록 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			case "1":
				System.out.println("학번\t이름\t과목코드\t과목명\t\t\t점수\t신청일");
				for(EnrolsVO vo : edao.list()) {
					vo.print_land();
				}
				break;
			case "2":
				System.out.print("학번 > ");
				String scode = sc.nextLine();
				if(scode=="") {
					System.out.println("수강신청 취소합니다.");
				}else {
					StudentsVO ssvo = sdao.search(scode);
					if (ssvo.getSname()==null) {
						System.out.println("해당학생이 존재하지 않습니다.");
					}else {
						ssvo.print_port();
						System.out.println("-------------------------------");
						List<EnrolsVO> sarray = edao.slist(scode);
						if (sarray.size()==0) {
							System.out.println("수강신청내역 없음");
						}else {
							for (EnrolsVO vo : sarray) {
								vo.print_land();
							}
							System.out.println("-------------------------------");
							
							//수강신청할 목록
							List<CoursesVO> aarray = cdao.list();
							for (CoursesVO vo : aarray) {
								vo.print_land();
							}
							System.out.print("수강신청 과목 > ");
							String ccode = sc.nextLine();
							if(ccode=="") {
								System.out.println("수강신청 취소합니다.");
							}else {
								CoursesVO scvo = cdao.search(ccode);
								if(scvo.getCname()==null) {
									System.out.println("해당 과목이 존재하지 않습니다.");
								}else {
									EnrolsVO sevo = edao.search(scode, ccode);
									if (sevo.getSname()!=null) {
										System.out.println("이미 수강신청한 내용입니다.");
									}else {
										edao.insult(scode,ccode);
										System.out.println("수강신청 완료");
									}
								}
							}
						}
					}
				}
//				System.out.print("학번 > ");
				break;
			case "3":
				
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}// switch
		}//while		
	}
}