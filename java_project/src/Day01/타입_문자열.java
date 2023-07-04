package Day01;

public class 타입_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "홍길동";
		String b = "이순신";
		String c = "심청이";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("a변수의 값은 : " + a );
		System.out.println("a, b, c의 값은 = " + a + b + c);
		System.out.println("a, b, c의 값은 = " + a + ", " + b + ", " + c);
		
		System.out.println("====================");
		int d = 10;
		int e = 20;
		System.out.println("d 변수의 값은 : " + d);
		System.out.println("d + e 변수의 값은 : " + d + e);
		System.out.println("d + e로 적으면 d와 e를 문자열로 연결한다");
		System.out.println("d+e 변수의 값은 : " + (d + e));
		
		char aa = 'a';
		char bb = 'b';
		char cc = 'c';
		
		// 출력예시)
		// a변수의 값은 : 홍길동
		// b변수의 값은 : 이순신
		// c변수의 값은 : 심청이
		
		System.out.println(aa + "변수의 값은 : " + a);
		System.out.println(bb + "변수의 값은 : " + b);
		System.out.println(cc + "변수의 값은 : " + c );
	}

}
