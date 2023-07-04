package Day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술연산자
		int a = 10;
		int b = 4;
		System.out.println(a + b); 
		System.out.println(a - b); 
		System.out.println(a * b);
		System.out.println(a / b); // 정수만 나오는 상황이라 값이 2 라고 나온다.
		System.out.println(a % b); // 나눈 후 나머지
		System.out.println("==================");
		
		// 비교연산자
		System.out.println(a > b); // 초과  true
		System.out.println(a < b); // 미만  false
		System.out.println(a >= b); // 이상 true
		System.out.println(a <= b); // 이하 false
		System.out.println(a == b); // 같다 false
		System.out.println(a != b); // 같지 않다 true
		
		int c = 2; 
		System.out.println(a / b == c);
		System.out.println("===========");
		
		a = 10;
		b = 10; 
		c = 9;
		// 논리 연산자 &&(and), ||(or), !(not => true면 false로)
		System.out.println(a > c && b > c); // &&(and) => true, a>b 맞음. b>c 맞음
		System.out.println(a > b && c > b); // => 틀림 a>b true, c>b false
		System.out.println(a > b && a > c);
		System.out.println(c > a || a >= b); // true, c>a false, a>=b true
		System.out.println(a != b || a == b); // true, a=b ture, a!=b false
		System.out.println(!(a > c));
		System.out.println(!(a > b && b > c)); // true, 안에 있는게 false
		System.out.println(a > b && !(b > c)); // false, a>b false, !(b>c) false
		System.out.println(a > b || !(b > c)); // false,
	}

}
