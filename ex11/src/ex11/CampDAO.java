package ex11;

import java.util.*;
import java.sql.*;

public class CampDAO {
	Connection con = Database.connect();

	public List<CampVO> list() {
		List<CampVO> list = new ArrayList<CampVO>();
		try {
			String sql = "SELECT * FROM TBL_CAMP ORDER BY CNO";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CampVO vo = new CampVO();
				vo.setCno(rs.getString("cno"));
				vo.setCname(rs.getString("cname"));
				vo.setCjuso(rs.getString("cjuso"));
				vo.setCtel(rs.getString("cteL"));
				list.add(vo);
			}

		} catch (Exception e) {
			System.out.println("캠핑장 목록 오류 : " + e.toString());
		}
		return list;
	}
	
	public CampVO search(String cno) {
		CampVO vo = new CampVO();
		try {
			String sql = "SELECT * FROM TBL_CAMP WHERE CNO=? ORDER BY CNO";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setCno(rs.getString("cno"));
				vo.setCname(rs.getString("cname"));
				vo.setCjuso(rs.getString("cjuso"));
				vo.setCtel(rs.getString("ctel"));
			}
		} catch (Exception e) {
			System.out.println("캠핑장 조회 오류 : " + e.toString());
		}
		return vo;
	}
	
	public String getNcno() {
		String cno = "";
		try {
			String sql = "SELECT MAX(CNO)+1 NCNO FROM TBL_CAMP";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) cno = rs.getString("NCNO");
		}catch(Exception e) {
			System.out.println("숫자받기 오류 : " + e.toString());
		}
		
		return cno;
	}
	
	public void insert(CampVO vo) {
		try {
			String sql = "INSERT INTO TBL_CAMP(CNO,CNAME,CJUSO,CTEL) VALUES(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCno());
			ps.setString(2, vo.getCname());
			ps.setString(3, vo.getCjuso());
			ps.setString(4, vo.getCtel());
			ps.execute();
		}catch(Exception e) {
			System.out.println("캠핑장 삽입 오류 : " + e.toString());
		}
	}	
	
	public void update(CampVO vo) {
		try {
			String sql = "UPDATE TBL_CAMP SET CNAME=?, CJUSO=?, CTEL=? WHERE CNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCname());
			ps.setString(2, vo.getCjuso());
			ps.setString(3, vo.getCtel());
			ps.setString(4, vo.getCno());
			ps.execute();
		}catch(Exception e) {
			System.out.println("캠핑장 삽입 오류 : " + e.toString());
		}
	}
}
