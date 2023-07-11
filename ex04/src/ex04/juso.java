package ex04;

import java.util.*;

public class juso {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<StudentVO> students = new ArrayList<StudentVO>();

		int cnt = 11;
		// Sample Data
		StudentVO std = new StudentVO(cnt++, "마그네슘", "지브롤터", "010-1010-1010");
		students.add(std);
		std = new StudentVO(cnt++, "알루미늄", "하나무라", "010-4851-4684");
		students.add(std);
		std = new StudentVO(cnt++, "붕소", "부산", "010-2323-4461");
		students.add(std);

		allroof: while (true) {
			System.out.println("================================================");
			System.out.println("1.등록 | 2.목록 | 3.조회 | 4.수정 | 5.삭제 | 0.종료");
			System.out.print("메뉴 선택 > ");
			String menu1 = sc.nextLine();

			switch (menu1) {
			case "0":
				break allroof;

			case "1":
				StudentVO nStd = new StudentVO();
				nStd.setSno(cnt++);
				System.out.println("학번 > " + nStd.getSno());
				System.out.print("이름 > ");
				nStd.setName(sc.nextLine());
				System.out.print("주소 > ");
				nStd.setAddress(sc.nextLine());
				System.out.print("연락처 > ");
				nStd.setPhone(sc.nextLine());
				students.add(nStd);
				System.out.println("학생 등록 완료");
				System.out.println("현제 학생 수 : " + students.size());
				break;

			case "2":
				System.out.println("학번\t\t이름\t주소\t연락처");
				System.out.println("================================================");
				for (int i = 0; i < students.size(); i++) {
					students.get(i).print_land();
				}
				break;

			case "3":
				System.out.print("학번 입력 > ");
				String find = sc.nextLine();
				boolean srh = false;
				StudentVO fstd = new StudentVO();
				for (StudentVO s : students) {
					if (s.getSno() == (Integer.parseInt(find))) {
						srh = true;
						fstd.print_port();
						break;
					}
				}
				if (!srh) {
					System.out.println("학생없음");
				}
				break;

			case "4":
				System.out.println("===========수정페이지===========");
				System.out.print("학번 입력 > ");
				find = sc.nextLine();
				fstd = new StudentVO();
				srh = false;
				fstd = new StudentVO();
				for (StudentVO s : students) {
					if (s.getSno() == (Integer.parseInt(find))) {
						srh = true;
						System.out.println("주소 변경 > ");
						String cad = sc.nextLine();
						s.setAddress(cad);
						break;
					}
				}
				if (!srh) {
					System.out.println("학생없음");
				}
				break;

			case "5":
				System.out.println("===========삭제페이지===========");
				System.out.print("학번 입력 > ");
				find = sc.nextLine();
				srh = false;
				fstd = new StudentVO();
				for (StudentVO s : students) {
					if (s.getSno() == (Integer.parseInt(find))) {
						students.remove(fstd);
						System.out.println("삭제 완료");
						break;
					}
				}
				if (!srh) {
					System.out.println("학생없음");
				}
				break;
			default:
				System.out.println("왜 하라는대로 안하는거야.다시 선택해!");

			}
			System.out.println();
		}
		System.out.println("프로그램이 종료됩니다.");
	}

}// run
