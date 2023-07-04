package Day01;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		double b = a; // 자동형변환
		System.out.println(b);
		
		double c = 3.14;
		// int d = c; => 오류가 발생한다. int는 소수점 아래 못받음
		// System.out.println(d); 
		// 이 때 소수점 아래는 버림(반올림 X)
		int d = (int)c; // 강제 형변환, 3.14를 강제로 정수(3)로 변환
		System.out.println(d);
	
		
	}

}