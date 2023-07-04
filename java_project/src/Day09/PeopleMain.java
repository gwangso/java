package Day09;

public class PeopleMain {

	public static void main(String[] args) {
		People human1 = new People();
		System.out.println("이름\t나이");
		System.out.println("===============");
		human1.setName("홍길동");
		human1.setAge(90);
		human1.ageUp();
		System.out.println(human1.getName() + "\t" + human1.getAge());
		
		People human2 = new People("이순신", 80);
		human2.ageUp1(5);
		human2.print();
		
		System.out.println(human1.getName() + " 만 나이 : " + human1.getAge());
		System.out.printf("%s 만 나이 : %d\n",human2.getName(),human2.getAge());
	}

}
