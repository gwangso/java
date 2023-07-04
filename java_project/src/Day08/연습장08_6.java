package Day08;

public class 연습장08_6 {

	public static void main(String[] args) {
		// Day09.Animal을 가져오는 방법2 
		Day09.Animal jo = new Day09.Animal();
		jo.mang = "망";
//		g.gang = "강";  err 
		// 이렇게 가져올 수 없다. 
		// gang은 같은 페키지, Day09와 Day 08은 다른 페키지
		// 따라서 set/get을 이용해 가져올 수 있다.
		System.out.println(jo.mang);
	}

}
