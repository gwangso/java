package ex05;

import java.sql.Date;
import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		// 출력
		while (run) {
			List<StudentVO> array = dao.list();
			System.out.println("\n******* 학생관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				StudentVO stu = new StudentVO();
				stu.setSno(dao.getNo());
				System.out.println("학번 > " + stu.getSno());
				System.out.print("이름 > ");
				stu.setSname(sc.nextLine());
				System.out.print("학과 > ");
				stu.setDept(sc.nextLine());
				System.out.print("생일(19990101 형식으로 적어주세요) > ");
				String d = sc.nextLine();
				String form = String.format("%s-%s-%s", d.subSequence(0, 4),d.subSequence(4, 6),d.substring(6,8));
				
				stu.setBirth(Date.valueOf(form));
				
				System.out.print("학년 > ");
				String nGrade = sc.nextLine();
				if (nGrade.equals("1") || nGrade.equals("2") || nGrade.equals("3") || nGrade.equals("4")) {
					stu.setGrade(Integer.parseInt(nGrade));
				} else {
					stu.setGrade(1);
				}
				dao.insert(stu);
				break;
			case "2":
				System.out.print("학번 입력 > ");
				String sno = sc.nextLine();
				StudentVO stu2 = dao.search(sno);
				if (stu2.getSname() == null) {
					System.out.println("학생 없음");
				} else {
					System.out.println("이름 : " + stu2.getSname());
					System.out.println("학과 : " + stu2.getDept());
					System.out.println("생일 : " + stu2.getBirth());
					System.out.println("학년 : " + stu2.getGrade());
				}
				break;
			case "3":
				for (StudentVO vo : array) {
//					String date = sdf.format(vo.getBirth());
//					System.out.printf("%s\t%s\t%s\t%s\t%d\n",vo.getSno(),vo.getSname(),vo.getDept(),date,vo.getGrade());

//					System.out.println(vo.toString());

					vo.printLand();
				}
				break;
			case "4":
				stu = new StudentVO();
				System.out.print("학번입력 > ");
				String uno = sc.nextLine();
				StudentVO stu3 = dao.search(uno);
				if (stu3.getSname() != null) {
					stu.setSno(uno);
					System.out.print("이름 : " + stu3.getSname() + " => ");
					String uName = sc.nextLine();
					if (uName != "")
						stu3.setSname(uName);
					System.out.print("학과 > " + stu3.getDept() + " => ");
					String uDept = sc.nextLine();
					if (uDept != "")
						stu3.setDept(uDept);
					System.out.print("생일 > " + stu3.getBirth() + " => ");
					String uBirth = sc.nextLine();
					if (uBirth != "")
						stu3.setBirth(Date.valueOf(uBirth));
					System.out.print("학년 > ");
					String uGrade = sc.nextLine();
					if (uGrade != "")
						stu3.setGrade(Integer.parseInt(uGrade));
					System.out.print("수정하시겠습니까?(Y/y) ");
					String sel2 = sc.nextLine();
					if (sel2.equals("Y") || sel2.equals("y") || sel2.equals("ㅛ")) {
						dao.update(stu3);
					} else {
						System.out.println("처음으로 돌아갑니다.");
					}

				} else {
					System.out.println("학생을 찾을 수 없습니다.");
				}
				break;
			case "5":
				System.out.print("학번 입력 > ");
				String dno = sc.nextLine();
				StudentVO stu4 = dao.search(dno);
				if (stu4.getSname() != null) {
					dao.search(dno);
					System.out.print("삭제하시겠습니까?(Y/y) ");
					String sel = sc.nextLine();
					if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
						dao.delete(dno);
					} else {
						System.out.println("처음으로 돌아갑니다.");
					}
				} else {
					System.out.println(dno + "번 학생은 존재하지 않습니다.");
				}
				break;
			default:
				System.out.println("메뉴를 다시선택하세요!");
			}// switch
			System.out.println();
		} // while
		System.out.println("프로그램을 종료합니다.");
	}

}