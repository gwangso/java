package Day08;

import Day09.Animal;

public class 연습장08_5 {

	public static void main(String[] args) {
		// Day09.Animal을 가져오는 방법2
		Animal g = new Animal();
		g.mang = "망"; // public은 다른 페키지에서도 가져올 수 있다.
//		g.gang = "강";  err 
		// 이렇게 가져올 수 없다. 
		// gang은 같은 페키지, Day09와 Day 08은 다른 페키지
		// 따라서 set/get을 이용해 가져올 수 있다.
		
		// public이나 default는 이렇게 set/get과 같은 방식을 가져와야 한다.
		System.out.println(g.mang);
		g.setName("맘스터치");
		g.setSound("터치터치");
		g.setLeg(18);
		System.out.printf("%s/%s/%d\n",g.getName(),g.getSound(),g.getLeg());
	}

}
