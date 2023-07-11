package ex03;

public class Main {

	public static void main(String[] args) {
//		Jusso.run();
//		Database.connect();
		StudentDAO dao = new StudentDAO();
		//출력
		System.out.println("출력");
		for (StudentVO vo : dao.list()) {
			System.out.printf("%s\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
		//조회
		System.out.println("조회");
		System.out.println(dao.search("20230002"));
		
		//삽입
		System.out.println("삽입");
		StudentVO n = new StudentVO(5,"수소", "66번국도", "010-1235-5609");
		dao.insult(n);
		for (StudentVO vo : dao.list()) {
			System.out.printf("%s\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
		//삭제
		System.out.println("삭제");
		dao.delete("20230002");
		for (StudentVO vo : dao.list()) {
			System.out.printf("%s\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
		//수정
		System.out.println("수정");
		StudentVO c = new StudentVO(3,"칼륨", "리장타워", "010-5632-0179");
		dao.update(c);
		for (StudentVO vo : dao.list()) {
			System.out.printf("%s\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
		
	}

}
