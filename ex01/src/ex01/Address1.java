package ex01;

import java.util.*;

public class Address1 {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();

		// 샘플데이터
		Student stu = new Student("20231", "홍길동", "인천 서구 경서동");
		students.add(stu);
		stu = new Student("20232", "심청이", "인천 부평구 계산동");
		students.add(stu);
		stu = new Student("20233", "이순신", "서울 강서구 화곡동");
		students.add(stu);

		boolean roof = true;
		while (roof) {
			System.out.println("==========================");
			System.out.println("1.주소등록 | 2.주소목록 | 3.주소검색 | 4.주소변경 | 5.회원탈퇴 | 0.종료");
			System.out.print("메뉴선택 > ");
			String menu = sc.nextLine();
			
			boolean find = false; //이렇게 여러곳에서 쓸 값은 밖에서 빼는게 상책
			switch (menu) {
			case "0":
				roof = false;
				break;
			case "1":
				stu = new Student();
				stu.setSno("2023" + (students.size()+1));
				System.out.println("학번 > " + stu.getSno());
				System.out.print("이름 > ");
				stu.setName(sc.nextLine());
				System.out.print("주소 > ");
				stu.setAddress(sc.nextLine());
				System.out.print("학과 > ");
				String nDept = sc.nextLine();
				if (nDept != "") stu.setDept(nDept);
				students.add(stu);
				System.out.println("학생 등록이 완료되었습니다.");
				System.out.println("현제 " + students.size() + "명이 등록되어있습니다.");
				break;
			case "2":
				for (Student st : students)
					System.out.println(st.toString());
				break;
			case "3":
				System.out.print("이름 입력 > ");
				String search = sc.nextLine();
				for(Student st : students) {
					if (st.getName().equals(search)) {
						System.out.println(st.toString());
						find = true;
						break;
					}
				}
				if (!find) System.out.println("학생을 찾을 수 없습니다.");
				break;
			case "4":
				System.out.print("이름 입력 > ");
				search = sc.nextLine();
				for(Student st : students) {
					if (st.getName().equals(search)) {
						find = true;
						System.out.println("이름 : " + st.getName());
						System.out.println("주소 : " + st.getAddress());
						System.out.println("학과 : " + st.getDept());
						System.out.print("변경하실 학과를 입력하세요 > ");
						String cDept = sc.nextLine();
						if (cDept != "") {
							System.out.println(st.getDept() + "에서 " +cDept +"로 학과변경이 완료되었습니다.");
							st.setDept(cDept);
						}
						break;
					}
				}
				if (!find) System.out.println("학생을 찾을 수 없습니다.");
				break;
			case "5":
				System.out.print("학번 입력 > ");
				search = sc.nextLine();
				for (int i = 0; i<students.size();i++) {
					if (students.get(i).getSno().equals(search)) {
						find = true;
						students.remove(i);
						System.out.println("탈퇴가 완료되었습니다.");
						break;
					}
				}
				if (!find) System.out.println("학생을 찾을 수 없습니다.");
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!");
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
