package ex10;

import java.sql.*;
import java.util.*;

public class CoursesDAO {
	Connection con = Database.connect();
	
	//과목 목록
	public List<CoursesVO> list(){
		List<CoursesVO> list = new ArrayList<CoursesVO>();
		try {
			String sql = "SELECT * FROM TBL_COURSES";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CoursesVO vo = new CoursesVO();
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("과목목록 출력 오류 : " + e.toString());
		}
		return list;
	}
	
	//과목 조회
	public CoursesVO search(String ccode) {
		CoursesVO vo = new CoursesVO();
		try { 
			String sql = "SELECT * FROM TBL_COURSES WHERE CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ccode);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
			}
		}catch(Exception e) {
			System.out.println("과목조회 출력 오류 : " + e.toString());
		}
		return vo;
	}
	
	//과목 코드
	public String getNccode() {
		String nccode= "";
		try {
			String sql = "SELECT MAX(CCODE)+1 NCCODE FROM TBL_COURSES";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				nccode = rs.getString("NCCODE");
			}
			
		}catch(Exception e) {
			System.out.println("다음코드 출력 오류 : " + e.toString());
		}
		
		return nccode;
	}
	
	//과목 등록
	public void insert(CoursesVO vo) {
		try {
			String sql = "INSERT INTO TBL_COURSES(CCODE, CNAME) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCcode());
			ps.setString(2, vo.getCname());
			ps.execute();
		}catch(Exception e) {
			System.out.println("과목등록 오류 : " + e.toString());
		}
	}
	
	//과목 수정
	public void update(CoursesVO vo) {
		try {
			String sql = "UPDATE TBL_COURSES SET CNAME=? WHERE CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCname());
			ps.setString(2, vo.getCcode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("과목등록 오류 : " + e.toString());
		}
	}
}
