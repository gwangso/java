package Day09;

public class BoardMain {

	public static void main(String[] args) {
		// Board객체 하나 만들기
		// cntUp 메서드 사용하기
		// print 메서드 사용하기
		Board b1 = new Board("자바는 즐",10,true);
		b1.cntUp();
		b1.print();

		// Board객체 하나 만들기
		// cntUp1메서드 사용하고 리턴값
		// print메서드 사용하기
		Board b2 = new Board("거워",10,false);
		b2.cntUp1(5);
		b2.print();
	}
}
