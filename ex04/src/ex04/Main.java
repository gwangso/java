package ex04;

public class Main {
	public static void main(String[] args) {		
		StudentDAO dao = new StudentDAO();
		
		//목록출력
		for (StudentVO vo : dao.list()) {
			vo.print_land();
//			System.out.printf("%d\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
		
		//입력
		StudentVO s = new StudentVO(20,"수소","66번국도","010-5163-3589");
		dao.insert(s);
		System.out.println("삽입성공");

		//조회
		System.out.println(dao.read(11));
		
	
		//삭제
		dao.delete(20);
		
		//수정
		StudentVO stu = new StudentVO(13,"헬륨","리장타워","010-6982-4218");
		dao.update(stu);
		for (StudentVO vo : dao.list()) {
			vo.print_land();
//			System.out.printf("%d\t%s\t%s\t%s\n", vo.getSno(),vo.getName(),vo.getAddress(),vo.getPhone());
		}
	}
}
