package ex05;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class StudentDAO {
	Connection con = Database.connect();

	// 출 력
	public List<StudentVO> list() { // 여러명의 학생들의 정보를 리턴받겠다.
		List<StudentVO> array = new ArrayList<StudentVO>();

		try { // try문에 있는 것을 실행하다 오류가 발생하면 catch문을 실행하라
			String sql = "select * from tbl_students order by sno desc";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirth(rs.getDate("birth"));
				vo.setGrade(rs.getInt("grade"));
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("학생목록 출력 오류 : " + e.toString());
		}
		return array;
	}

	// 새로운 학번 구하기
	public String getNo() {
		String no = "";
		try {
			String sql = "select max(sno)+1 nno from tbl_students";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				no = rs.getString("nno");
			}
		} catch (Exception e) {
			System.out.println("새로운 학번 구하기 오류 : " + e.toString());
		}
		return no;
	}

	// 삽 입
	public void insert(StudentVO vo) {
		try {
			String sql = "insert into tbl_students (sno,sname,dept,birth,grade) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSno());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getDept());
			ps.setDate(4, (Date) vo.getBirth());
			ps.setInt(5, vo.getGrade());
			ps.execute();
			System.out.println(vo.getSname() + "학생 등록 완료");
		} catch (Exception e) {
			System.out.println("학생 입력 오류 : " + e.toString());
		}
	}

	// 조회
	public StudentVO search(String sno) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "select * from tbl_students where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirth(rs.getDate("birth"));
				vo.setGrade(rs.getInt("grade"));
			}
		} catch (Exception e) {
			System.out.println("학생 조회 오류 : " + e.toString());
		}
		return vo;
	}

	// update
	public void update(StudentVO vo) {
		try {
			String sql = "update tbl_students set sname=?,dept=?,birth=?,grade=? where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSname());
			ps.setString(2, vo.getDept());
			ps.setDate(3, (Date) vo.getBirth());
			ps.setInt(4, vo.getGrade());
			ps.setString(5, vo.getSno());
			ps.execute();
			System.out.println("수정 완료");
		} catch (Exception e) {
			System.out.println("학생정보 수정 오류 : " + e.toString());
		}
	}

	// 삭제
	public void delete(String sno) {
		try {
			String sql = "delete from tbl_students where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ps.execute();
			System.out.println("제거 완료");
		} catch (Exception e) {
			System.out.println("학생 제거 오류 : " + e.toString());
		}
	}
}
