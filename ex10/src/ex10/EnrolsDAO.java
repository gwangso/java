package ex10;

import java.sql.*;
import java.util.*;

public class EnrolsDAO {
	Connection con = Database.connect();

	// 특정학생이
	public List<EnrolsVO> list() {
		List<EnrolsVO> list = new ArrayList<EnrolsVO>();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS1 ORDER BY CCODE";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EnrolsVO vo = new EnrolsVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setGrade(rs.getInt("grade"));
				vo.setEdate(rs.getTimestamp("edate"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("수강신청목록 출력 오류 : " + e.toString());
		}
		return list;
	}

	public List<EnrolsVO> slist(String scode) {
		List<EnrolsVO> list = new ArrayList<EnrolsVO>();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS1 where Scode=? ORDER BY CCODE";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EnrolsVO vo = new EnrolsVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setGrade(rs.getInt("grade"));
				vo.setEdate(rs.getTimestamp("edate"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("수강신청목록 출력 오류 : " + e.toString());
		}
		return list;
	}

	public List<EnrolsVO> clist(String ccode) {
		List<EnrolsVO> list = new ArrayList<EnrolsVO>();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS1 WHERE CCODE=? ORDER BY SCODE";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ccode);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EnrolsVO vo = new EnrolsVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setGrade(rs.getInt("grade"));
				vo.setEdate(rs.getTimestamp("edate"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("수강신청 변경 오류 : " + e.toString());
		}
		return list;
	}

	public void insult(String scode, String ccode) {
		try {
			String sql = "INSERT INTO TBL_ENROLS(SCODE,CCODE) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ps.setString(2, ccode);
			ps.execute();
		} catch (Exception e) {
			System.out.println("수강신청 등록 오류 : " + e.toString());
		}
	}

	public void update(EnrolsVO vo) {
		try {
			String sql = "UPDATE TBL_ENROLS SET CCODE=? WHERE SCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCcode());
			ps.setString(2, vo.getScode());
			ps.execute();
		} catch (Exception e) {
			System.out.println("수강신청 변경 오류 : " + e.toString());
		}
	}

	public EnrolsVO search(String scode, String ccode) {
		EnrolsVO vo = new EnrolsVO();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS1 WHERE SCODE=? AND CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ps.setString(2, ccode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setGrade(rs.getInt("grade"));
				vo.setEdate(rs.getTimestamp("edate"));
			}
		} catch (Exception e) {
			System.out.println("수강신청 변경 오류 : " + e.toString());
		}
		return vo;
	}
}
