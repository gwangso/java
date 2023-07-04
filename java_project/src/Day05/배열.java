package Day05;

import java.util.Scanner;

public class 배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		String name1 = "홍길동";
//		String name2 = "이순신";
//		String name3 = "심청이";
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
//		
//		System.out.println();
//		System.out.println("-------------------------------");
//		System.out.println();
//		
//		// 배열 쓰는 방법 1
//		String[] names1 = {"홍길동", "이순신", "심청이"};
//		//String names[] = {"홍길동", "이순신", "심청이"};
//		System.out.println(names1[0]);
//		System.out.println(names1[1]);
//		System.out.println(names1[2]);
//		//System.out.println(names[4]);
//		// 없는 인덱스 실행 시 에러(예외) 발생
//		
		// 배열 선언 방법 2
		String[] names2 = new String[5]; // 5칸 짜리 빈 배열 만들기
		// names1 의 index => [0], [1], [2], [3], [4] 총 5개
		names2[0] = "신립";
		names2[1] = "이일";
		names2[2] = "장보고";
		names2[3] = "이순신";
		names2[4] = "관구검";
		//names2[5] = "장동건"; => 에러 발생
		
		// 배열길이확인
		System.out.println("배열의 길이 : " + names2.length);
		
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
		
		

	}

}
