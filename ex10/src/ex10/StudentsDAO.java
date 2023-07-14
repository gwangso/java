package ex10;

import java.util.*; 
import java.sql.*;

public class StudentsDAO {
	Connection con = Database.connect();
	
	//목록
	public List<StudentsVO> list(){
		List<StudentsVO> list = new ArrayList<StudentsVO>();
		try {
			String sql = "SELECT * FROM TBL_STUDENTS order by scode";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentsVO vo = new StudentsVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setSdept(rs.getString("sdept"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생목록 출력 오류 : " + e.toString());
		}
		return list;
	}
	
	//조회
	public StudentsVO search(String scode){
		StudentsVO vo = new StudentsVO();
		try {
			String sql = "SELECT * FROM TBL_STUDENTS WHERE SCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setSdept(rs.getString("sdept"));
			}
		}catch(Exception e) {
			System.out.println("학생조회 출력 오류 : " + e.toString());
		}
		return vo;
	}	
	
	//새로운학번 구하기
	public String getNscode() {
		String nscode = "";
		try {
			String sql = "SELECT MAX(SCODE)+1 NCODE FROM TBL_STUDENTS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				nscode = rs.getString("NCODE");
			}
		}catch(Exception e) {
			System.out.println("새로운 학번 출력 오류 : " + e.toString());
		}
		return nscode;
	}
	
	//등록
	public void insert(StudentsVO vo) {
		try {
			String sql = "INSERT INTO TBL_STUDENTS(SCODE,SNAME,SDEPT) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getScode());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getSdept());
			ps.execute();
		}catch(Exception e) {
			System.out.println("신규등록 오류 : " + e.toString());
		}
	}
	
	public void update(StudentsVO vo) {
		try {
			String sql = "UPDATE TBL_STUDENTS SET SNAME=?, SDEPT=? WHERE SCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSname());
			ps.setString(2, vo.getSdept());
			ps.setString(3, vo.getScode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생정보 갱신 오류 : " + e.toString());
		}
	
	}
	
	
	
}