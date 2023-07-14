package ex09;

import java.text.*;
import java.util.*;

public class Main09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
//		MessageDAO mdao = new MessegeDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;

		while (run) {
			System.out.println("*********** 메인메뉴관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.사용자등록 |2.사용자목록 |3.사용자조회 |4.사용자수정 |5.사용자삭제 |6.메시지관리 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				while (true) {
					System.out.print("아이디를 입력해주세요* > ");
					String nid = sc.nextLine();
					if (nid=="") {
						System.out.println("등록을 취소했습니다.\n처음으로 돌아갑니다.");
						break;
					}else {
						UserVO nuvo = udao.search(nid);
						if (nuvo.getUname()!=null) {
							System.out.println("중복되는 아이디입니다.\n");
						}else {
							nuvo.setId(nid);
							System.out.print("이름을 입력해주세요* > ");
							String nName = sc.nextLine();
							if (nName == "") {
								System.out.println("등록을 취소했습니다.\n처음으로 돌아갑니다.");
								break;
							}else {
								nuvo.setUname(nName);
							}
							System.out.print("전화번호를 입력해주세요 > ");
							String nPhone = sc.nextLine();
							nuvo.setPhone(nPhone);
							System.out.println();
							nuvo.print_land();
							System.out.print("\n해당 정보로 등록을 하시겠습니까?(Y/y) >");
							String nok = sc.nextLine();
							if (nok.equals("y") || nok.equals("Y") || nok.equals("ㅛ")) {
								udao.insert(nuvo);
								System.out.println("신규등록이 완료되었습니다.");
							}else {
								System.out.println("등록을 취소했습니다.\n처음으로 돌아갑니다.");
							}
							break;
						}
					}
				}
				break;
			case "2":
				System.out.println("=============사용자목록===============");
				System.out.println("아이디\t\t이름\t\t포인트\t전화번호");
				for (UserVO vo : udao.list()) {
					vo.print_land();
				}
				System.out.println(udao.list().size() + "명이 등록되어 있습니다.");
				break;
			case "3":
				while(true) {
					System.out.print("조회할 아이디를 입력해주세요* > ");
					String sid = sc.nextLine();
					if (sid=="") {
						System.out.println("조회를 취소했습니다.\n처음으로 돌아갑니다.");
						break;
					}else {
						UserVO suvo = udao.search(sid);
						if (suvo.getUname()==null) {
							System.out.println("존재하지 않는 아이디입니다.");
						}else {
							suvo.print_port();
							break;
						}
					}
				}//while문
				break;
			case "4":
				while(true) {
					System.out.print("수정할 아이디를 입력해주세요* > ");
					String uid = sc.nextLine();
					if (uid=="") {
						System.out.println("수정을 취소했습니다.\n처음으로 돌아갑니다.");
						break;
					}else {
						UserVO uuvo = udao.search(uid);
						if (uuvo.getUname()==null) {
							System.out.println("존재하지 않는 아이디입니다.");
						}else {
							System.out.print("이름 : " + uuvo.getUname() + " > ");
							String uname=sc.nextLine();
							if (uname!="") uuvo.setUname(uname);
							System.out.print("전화번호 : " + uuvo.getPhone() + " > ");
							String uphone = sc.nextLine();
							if(uphone!="") uuvo.setPhone(uphone);
							System.out.println();
							uuvo.print_land();
							System.out.print("\n해당 정보로 수정하시겠습니까(Y/y) > ");
							String uok = sc.nextLine();
							if (uok.equals("y") || uok.equals("Y") || uok.equals("ㅛ")) {
								udao.update(uuvo);
								System.out.println("수정이 완료되었습니다.");
							}else {
								System.out.println("수정을 취소했습니다.\n처음으로 돌아갑니다.");
							}
							break;
						}
					}					
				}
				break;
			case "5":
				while (true) {
					System.out.print("삭제할 아이디를 입력해주세요* > ");
					String did = sc.nextLine();
					if (did=="") {
						System.out.println("삭제를 취소했습니다.\n처음으로 돌아갑니다.");
						break;
					}else {
						UserVO duvo = udao.search(did);
						if(duvo.getUname()==null) {
							System.out.println("존재하지 않는 아이디입니다.");
						}else {
							duvo.print_port();
							System.out.print("정말로 삭제하시겠습니까?(Y/y)");
							String dok = sc.nextLine();
							if (dok.equals("y") || dok.equals("Y") || dok.equals("ㅛ")) {
								System.out.print("진짜로 레알 삭제하시겠습니까?(Y/y)");
								String dok2 = sc.nextLine();
								if (dok2.equals("y") || dok2.equals("Y") || dok2.equals("ㅛ")) {
									System.out.print("삭제해도 후회안할 자신 있으십니까?(Y/y)");
									String dok3 = sc.nextLine();
									if (dok3.equals("y") || dok3.equals("Y") || dok3.equals("ㅛ")) {
										System.out.print("삭제한다?(Y/y)");
										String dok4 = sc.nextLine();
										if (dok4.equals("y") || dok4.equals("Y") || dok4.equals("ㅛ")) {
											udao.delete(did);
											System.out.println("삭제 완료");
										}else {
											System.out.println("삭제를 취소했습니다(잘생각했어).\n처음으로 돌아갑니다.");
										}	
										break;										
									}else {
										System.out.println("삭제를 취소했습니다(잘생각했어).\n처음으로 돌아갑니다.");
										break;
									}
								}else {
									System.out.println("삭제를 취소했습니다.\n처음으로 돌아갑니다.");
									break;
								}
							}else {
								System.out.println("삭제를 취소했습니다.\n처음으로 돌아갑니다.");
								break;
							}
						}
					}
				}
				break;
			case "6":
				System.out.print("사용할 아이디 > ");
				String useid = sc.nextLine();
				if(useid=="") {
					System.out.println("메시지관리를 취소합니다.\n처음으로 돌아갑니다.");
				}else {
					UserVO useuvo = udao.search(useid);
					if(useuvo.getUname()==null) {
						System.out.println("사용자가 존재하지 않습니다.");
					}else {
						Messages.run(useuvo);						
					}
				}
				break;
			default:
				System.out.println("다시 선택해주세요");
			}//switch
			System.out.println();
		}//while run
		System.out.println("프로그램 종료");
	}//main method
}//Main class
