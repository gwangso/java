package Day02;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i = 1; i< 10; i ++) {
//			System.out.println(i);
//			if(i == 4) {
//				break;
//			}
//		}
//		
//		for(int i=1; i<=10; i++) {
//			if (i == 4) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		// 4가 나오지 않는것을 알 수 있다.
//		// 해당 순서를 실행하지 않고 넘어간다. 
		
		int dan = 7;
	
		for (int i = 1; i <=19; i++) {
			if (i == 5) {
				System.out.println("----------------");
				continue;
			}
			if (i == 9) {
				System.out.println("----------------");
				break;
			}
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		System.out.println(dan + "단을 종료합니다. 5단과 9단은 생략되었습니다.");
	}

}
