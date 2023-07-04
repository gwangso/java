package ex01;

import java.util.Scanner;

public class Address {
	public static void run() { 
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		
		int count = 0;
		boolean roof = true;
		while (roof) {
			System.out.println("==========================");
			System.out.println("1.주소등록 | 2.주소목록 | 3.검색 | 4.주소변경 | 0.종료");
			System.out.print("메뉴선택 > ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "0":
				roof = false;
				break;
			case "1":
				Student std = new Student();
				std.setSno("23"+(count+1));
				System.out.println("학번 > "+std.getSno());
				System.out.print("이름 > ");
				std.setName(sc.nextLine());
				System.out.print("주소 > ");
				std.setAddress(sc.nextLine());
				System.out.print("학과 > ");
				String nDept = sc.nextLine();
				if (nDept != "") std.setDept(nDept);
				students[count] = std;
				count++;
				System.out.println(count + "명 학생등록");
				break;
				
			case "2":
				System.out.println();
				System.out.println("==============================");
				for (int i = 0; i<count;i++) {
//					Student stu = students[i]
//					system.out.println(stu.toString());
//					이렇게 써도 됨
					System.out.println(students[i].toString());
				}//for문 종료
				break;
				
			case "3":
				System.out.print("이름 입력 > ");
				String search = sc.nextLine();
				boolean find = false;
				for (int i = 0; i<count;i++) {
					Student stu = students[i];
					if (stu.getName().equals(search)) {
						find = true;
						System.out.println(stu.toString());
						break;
					}
				}//for문 종료
				if(!find) System.out.println("학생이 존재하지 않습니다.");
				break;
				
			case "4":
				System.out.print("변경할 이름 > ");
				String update = sc.nextLine();
				find = false;
				for (int i = 0; i<count; i++) {
					if(update.equals(students[i].getName())) {
						find = true;
						System.out.println("이름 : " + students[i].getName());
						System.out.println("주소 : " + students[i].getAddress());
						System.out.print("새로운 주소 > ");
						String newAddress = sc.nextLine();
						if (newAddress != "") {	
							students[i].setAddress(newAddress);
							System.out.println("새로운 주소로 변경되었습니다.");
						}
					}
				}
				if (!find) System.out.println("학생이 존재하지 않습니다.");
				break;
//			case "5":
//				
//				System.out.println(find);
//				이럴 경우 find에 값이 없을 가능성이 있기 때문에 값을 줘야한다.
//				변수선언은 switch문 안에서 이미 한번 선언되었으므로 반복할 필요 없지만
//				하지만 find에 값을 저장하는것은 별개의 문제다.
			default:
				System.out.println("메뉴를 다시 선택하세요!");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
