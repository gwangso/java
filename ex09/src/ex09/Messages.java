package ex09;

import java.text.*;
import java.util.*;

public class Messages {
	public static void run(UserVO login) {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		MessageDAO mdao = new MessageDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run = true;
		while (run) {
			System.out.println("\n********메시지관리**************************************");
			login = udao.search(login.getId());
			System.out.println(login.toString());
			System.out.println("\n1.받은메시지 |2.보낸메시지 |3.메시지전송 |4.메시지쓰레기통 |0.메인메뉴");
			System.out.print("메뉴 선택 >");
			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				break;
			case "1":
				System.out.println("\n==========받은메시지 조회===========================");
				System.out.println("메시지넘버\t\t송신자(이름)\t송신일");
				for (MessageVO vo : mdao.receiveList(login.getId())) {
					System.out.printf("%d\t\t%s(%s)\t%s\n", vo.getMid(), vo.getSender(), vo.getUname(),
							sdf.format(vo.getSdate()));
					System.out.println();
				}
				boolean repeat1 = true;
				while (repeat1) {
					int searchmid = input("조회하실 메세지번호를 입력하세요");
					if (searchmid == 0) {
						System.out.println("메시지 조회를 취소합니다.");
						break;
					} else {
						MessageVO rmvo = mdao.receivesearch(searchmid,login.getId());
						if (rmvo.getSender() == null) {
							System.out.println("없는 메시지입니다.");
						} else {
							System.out.println("메시지 내용 : " + rmvo.getMessage());
							System.out.println("\n1.메시지 삭제 |2.다른 메시지 보기 |0.처음으로 돌아가기");
							System.out.print("선택 > ");
							String menu2 = sc.nextLine();
							switch (menu2) {
							case "0":
								System.out.println("처음으로 돌아갑니다.");
								repeat1 = false;
								break;
							case "1":
								while (true) {
									System.out.println("정말로 삭제하시겠습니까?");
									String dok = sc.nextLine();
									if (dok.equals("y") || dok.equals("Y") || dok.equals("ㅛ")) {
										mdao.recieveDel(rmvo.getMid());
										System.out.println("보낸 메시지가 삭제되었습니다.");
										break;
									} else {
										System.out.println("삭제를 취소했습니다.");
										break;
									}

								}
								break;
							case"2":
								System.out.println();
								break;
							default:
								System.out.println("다시선택");
							}
						}
					}
				}

				break;
			case "2":
				System.out.println("\n==========보낸메시지 조회===========================");
				System.out.println("메시지넘버\t\t수신자(이름)\t송신일");
				for (MessageVO vo : mdao.sendList(login.getId())) {
					System.out.printf("%d\t\t%s(%s)\t%s\n", vo.getMid(), vo.getReceiver(), vo.getUname(),
							sdf.format(vo.getSdate()));
					System.out.println();
				}
				boolean repeat2 = true;
				while (repeat2) {
					int searchmid = input("조회하실 메세지번호를 입력하세요");
					if (searchmid == 0) {
						System.out.println("메시지 조회를 취소합니다.");
						break;
					} else {
						MessageVO smvo = mdao.sendsearch(searchmid,login.getId());
						if (smvo.getSender() == null) {
							System.out.println("없는 메시지입니다.");
						} else {
							System.out.println("메시지 내용 : " + smvo.getMessage());
							System.out.println("\n1.메시지 삭제 |2.다른 메시지 보기 |0.처음으로 돌아가기");
							System.out.print("선택 > ");
							String menu2 = sc.nextLine();
							switch (menu2) {
							case "0":
								System.out.println("처음으로 돌아갑니다.");
								repeat2 = false;
								break;
							case "1":
								while (true) {
									System.out.println("삭제하시겠습니까?");
									String dok = sc.nextLine();
									if (dok.equals("y") || dok.equals("Y") || dok.equals("ㅛ")) {
										mdao.sendDel(smvo.getMid());
										System.out.println("보낸 메시지가 삭제되었습니다.");
										break;
									} else {
										System.out.println("삭제를 취소했습니다.");
										break;
									}

								}
								break;
							case"2":
								System.out.println();
								break;
							default:
								System.out.println("다시선택");
							}
						}
					}
				}
				break;
			case "3":
				System.out.println("==========메시지전송===========================");
				MessageVO sendvo = new MessageVO();
//				System.out.println("송신인 : " + login.getUname());
				sendvo.setSender(login.getId());
				while (true) {
					System.out.print("받을 사람 > ");
					String receiver = sc.nextLine();
					if (receiver == "") {
						System.out.println("메시지 전송을 취소합니다.");
						break;
					} else {
						UserVO revo = udao.search(receiver);
						if (revo.getUname() == null) {
							System.out.println("없는 사람");
						} else {
							sendvo.setReceiver(receiver);
							System.out.print("메시지 내용 > ");
							String message = sc.nextLine();
							if (message == "") {
								System.out.println("메시지 전송을 취소합니다.");
								break;
							} else {
								sendvo.setMessage(message);
								mdao.insert(sendvo);
								udao.updatepoint(login.getId());
								System.out.println("메시지 전송 완료");
								break;
							}
						}
					}
				}
				break;
			case "4":
				System.out.println("==========휴지통===========================");
				System.out.println("메시지넘버\t\t수신자\t\t송신자\t\t발송일");
				for (MessageVO vo : mdao.trash(login.getId())) {
					System.out.printf("%d\t\t%s\t\t%s\t\t%s\n", vo.getMid(), vo.getSender(), vo.getReceiver(),sdf.format(vo.getSdate()));
					System.out.println();
				}
				System.out.println("============================================\n");
				break;
			default:
				System.out.println("다시 선택해주세요");
			}
		}
	}

	public static int input(String str) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print(str + " > ");
			String fjj = sc.nextLine();
			if (fjj == "")
				fjj = "0";
			try {
				num = Integer.parseInt(fjj);
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요");
			}
		}
		return num;
	}
}
