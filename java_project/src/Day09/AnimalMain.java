package Day09;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("<강아지>");
		Animal dog = new Animal();
//		dog.name = "뽀삐";
//		dog.sound = "뀨잉뀨잉";
//		dog.leg = 4;
//		// 는 private으로 설정되어 있어서 이렇게 접근 불가
		dog.setName("뽀삐");
		// 이럴 경우 Animal dog 클래스 내부에서 this.name = name;이 실행됨
		// 같은 class에서 작동하는 문구이기에 Animal.dog 객체의 private name에 "뽀삐"가 입력될 수 있음
		dog.setSound("뀨잉뀨잉");
		dog.setLeg(4);
		dog.print();
		
		System.out.println("<고양이>");
		Animal cat = new Animal();
		cat.setName("야용이");
		cat.setSound("야~~옹");
		cat.setLeg(4);
		cat.print();
		
		System.out.println("<닭>");
		Animal chicken = new Animal();
		chicken.setLeg(2);
		chicken.setName("꼬꼬");
		chicken.setSound("구구까까");
		chicken.print1();
		
		System.out.println("<뱀>");
		Animal snake = new Animal();
		snake.setName("비얌");
		snake.setSound("샤이샤이");
		snake.setLeg(0);
		snake.print1();	
	}
}
