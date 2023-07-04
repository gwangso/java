package Day10;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Animal();
//		dog.name = "강아지";
//		dog.sound = "멍멍";
//		dog.leg = 4;
		System.out.println("<강아지>");
		dog.setName("뽀삐");
		dog.setSound("으르렁");
		dog.setleg(4);
		System.out.printf("%s\t%s\t%d\n",
				dog.getName(),dog.getSound(),dog.getLeg());
		
		Animal cat = new Animal();
		System.out.println("고양이");
		cat.setName("액체괴물");
		cat.setSound("미양");
		cat.setleg(4);
		System.out.printf("%s\t%s\t%d\n",
				cat.getName(),cat.getSound(),cat.getLeg());
		
		Animal chi = new Animal();
		System.out.println("<닭>");
		chi.setName("은봉이");
		chi.setSound("꼬꼬");
		chi.setleg(2);
		chi.print();
		
		Animal snk = new Animal();
		System.out.println("<뱀>");
		snk.setName("장어");
		snk.setSound("스르륵");
		snk.setleg(0);
		snk.print();
		
	}
}
