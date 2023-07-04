package Day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	// ※ ArrayList라는 클래스가 따로 있다.
	public static void main(String[] args) {
		String[] a = new String[10];

		a[0] = "안녕";
//		System.out.println(a[0]);
		a[0] = "안녕하세요";
//		System.out.println(a[0]);
		
		a[1] = "반가워요";
		a[2] = "잘있어요";
		a[3] = "다시만나요";
		// arrayList : 집어넣을 때마다 칸이 늘어남, 즉, 아직 방이 없다.
		// 배열은 칸을 정해둠
		List<String> b = new ArrayList<String>(); //인터페이스 때 배움
		//ArrayList<String> b = new ArrayList<String>();라고 써도 된다.
		b.add("안녕하세요"); // ArrayList에 값을 추가하는 방법
		b.add("반가워요");
		b.add("잘있어요");
		b.add("다시만나요");
		
		for(int i = 0; i<a.length;i++) { // length는 필드
			if (a[i] != null) {
				System.out.println(a[i]);				
			}
		}
		for(int i = 0; i<b.size() ;i++) { // size()는 리스트의 길이 메서드
			System.out.println(b.get(i));
		}
		
		
		System.out.println(b.get(0)); // ArrayList의 0번째 인덱스 값 리턴
		b.set(0, "こんにちは"); // ArrayList에 있는 0번째 인덱스의 값 변경
		System.out.println(b.get(0));
		
	}
}
