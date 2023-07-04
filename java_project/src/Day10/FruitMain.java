package Day10;

public class FruitMain {

	public static void main(String[] args) {
		
		System.out.println("<사용한생성자>\t과일이름\t색\t씨앗유무");
		
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "녹색";
		apple.isSeed = true;
		apple.print();
		Fruit banana = new Fruit("바나나");
		banana.color = "황색";
		banana.isSeed = false;
		banana.print();
		Fruit melon = new Fruit("멜론","녹색");
		melon.isSeed = true;
		melon.print();
		Fruit orange = new Fruit("오렌지","주황색",true);
		orange.print();
	}

}
