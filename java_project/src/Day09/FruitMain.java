package Day09;

public class FruitMain {

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		// 	Fruit	apple	=	new	Fruit();
		//	클래스	객체이름			생성자!!

		apple.name = "사과";
		apple.color = "초록";
		apple.isSeed = true;
		apple.print();
	
		// 두번째 생성자 사용하여 멜론객체 생성
		Fruit melon = new Fruit("멜론");
		melon.color = "연두";
		melon.isSeed = true;
		melon.print();
	
		// 세번째 생성자 사용하여 orange객체 생성
		Fruit orange = new Fruit("오랜지", "주황색");
		orange.isSeed = true;
		orange.print();

		Fruit banana = new Fruit("바나나","노랑",false);
		banana.print();
	}
}
