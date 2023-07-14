package ex10;

import java.text.*;
import java.util.*;

public class Courses {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		CoursesDAO cdao = new CoursesDAO();
		EnrolsDAO edao = new EnrolsDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;
		
		while (run) {
			System.out.println("\n*********** 강좌관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.강좌목록 |2.강좌조회 |3.강좌등록 |4.강좌수정 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			case "1":
				System.out.println("과목코드\t과목명");
				for (CoursesVO vo : cdao.list()) {
					vo.print_land();
				}
				break;
			case "2":
				while (true) {
					System.out.print("과목코드 조회 > ");
					String sccode = sc.nextLine();
					if (sccode == "") {
						System.out.println("조회를 취소합니다.");
						break;
					}else {
						CoursesVO scvo = cdao.search(sccode);
						if (scvo.getCname()==null) {
							System.out.println("없는 과목입니다.");
						}else {
							scvo.print_port();
							System.out.println("------------------------------------");
							List<EnrolsVO> carray = edao.clist(sccode);
							if(carray.size()==0) {
								System.out.println("수강 학생이 없습니다.");
							}else {
								for (EnrolsVO vo : carray) {
									System.out.printf("%s\t%s\t%d\t%s\n",
											vo.getScode(),vo.getSname(),
											vo.getGrade(),
											sdf.format(vo.getEdate()));
								}
								System.out.println("학생 수 : " + carray.size());
							}
							break;
						}
					}
				}
				break;
			case "3":
				CoursesVO ncvo = new CoursesVO();
				System.out.println("과목코드 > " + cdao.getNccode());
				ncvo.setCcode(cdao.getNccode());
				System.out.print("과목이름 > " );
				String ncname = sc.nextLine();
				if(ncname == "") {
					System.out.println("과목등록을 취소합니다.");
				}else {
					ncvo.setCname(ncname);
					System.out.print("해당 정보로등록하시겠습니까?(Y/y) > ");
					String nok = sc.nextLine();
					if (nok.equals("Y") || nok.equals("y") || nok.equals("ㅛ")) {
						cdao.insert(ncvo);
						System.out.println("등록이 완료되었습니다.");
					}else {
						System.out.println("과목등록을 취소합니다.");
					}
				}
				break;
			case "4":
				while (true) {
					System.out.print("과목코드 조회 > ");
					String sccode = sc.nextLine();
					if (sccode == "") {
						System.out.println("조회를 취소합니다.");
						break;
					}else {
						CoursesVO scvo = cdao.search(sccode);
						if (scvo.getCname()==null) {
							System.out.println("없는 과목입니다.");
						}else {
							System.out.print("강좌 이름 : " + scvo.getCname() + " > ");
							String ucname = sc.nextLine();
							if(ucname == "") {
								System.out.println("갱신을 취소합니다.");
								break;
							}else {
								scvo.setCname(ucname);
								System.out.println("");
								System.out.print("해당 정보로 갱신하시겠습니까?(Y/y) > ");
								String uok = sc.nextLine();
								if (uok.equals("Y") || uok.equals("y") || uok.equals("ㅛ")) {
									cdao.update(scvo);
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
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}// switch
		}//while		
	}
}
