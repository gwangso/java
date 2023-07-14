package ex11;

import java.util.*;
import java.sql.*;

public class TypeDAO {
	Connection con = Database.connect();
	
	public List<TypeVO> list(){
		List<TypeVO> list = new ArrayList<TypeVO>();
		try {
			String sql = "select * from tbl_type order by tno";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TypeVO vo = new TypeVO();
				vo.setTno(rs.getInt("tno"));
				vo.setTname(rs.getString("Tname"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("유형 목록 오류 : " + e.toString());
		}
		
		return list;
	}
	
	public TypeVO search(int tno) {
		TypeVO vo = new TypeVO();
		try {
			String sql = "SELECT * FROM TBL_TYPE where tno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setTno(rs.getInt("tno"));
				vo.setTname(rs.getString("tname"));
			}
		} catch (Exception e) {
			System.err.println("유형 조회 오류 : " + e.toString());
		}
		return vo;
	}
	
	public List<CampTypeVO> ctlist(String cno){
		List<CampTypeVO> list = new ArrayList<CampTypeVO>();
		try {
			String sql = "SELECT * FROM VIEW_CTYPE WHERE CNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CampTypeVO vo = new CampTypeVO();
				vo.setCno(rs.getString("cno"));
				vo.setTno(rs.getInt("tno"));
				vo.setTname(rs.getString("tname"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println("유형 목록 오류 : " + e.toString());
		}
		return list;
	}
	
	//걸러지는문
	public List<TypeVO> leftlist(String cno){
		List<TypeVO> list = new ArrayList<TypeVO>();
		try {
			String sql = "SELECT * FROM TBL_TYPE WHERE TNO NOT IN (SELECT DISTINCT TBL_TYPE.TNO\r\n"
					+ "  FROM TBL_CAMP_TYPE\r\n"
					+ "  INNER JOIN TBL_TYPE\r\n"
					+ "  ON TBL_TYPE.TNO=TBL_CAMP_TYPE.TNO\r\n"
					+ "  WHERE CNO=?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TypeVO vo = new TypeVO();
				vo.setTno(rs.getInt("tno"));
				vo.setTname(rs.getString("Tname"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println("유형 목록 오류 : " + e.toString());
		}
		return list;
	}
	
	public void ctinsert(String cno, int tno) {
		try {
			String sql = "INSERT INTO TBL_CAMP_TYPE(CNO,TNO) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, tno);
			ps.execute();
		} catch (Exception e) {
			System.out.println("시설 추가 오류 : " + e.toString());
		}
	}
	
	public void delete(String cno, int tno) {
		try {
			String sql = "DELETE FROM TBL_CAMP_TYPE WHERE CNO=? AND TNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, tno);
			ps.execute();
		} catch (Exception e) {
			System.out.println("시설 삭제 오류 : " + e.toString());
		}
	}

	public CampTypeVO ctsearch(String dcno, int dtno) {
		CampTypeVO vo = new CampTypeVO();
		try {
			String sql = "SELECT * FROM VIEW_CTYPE where cno=? and tno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dcno);
			ps.setInt(2, dtno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setCno("cno");
				vo.setTno(rs.getInt("tno"));
				vo.setTname(rs.getString("tname"));
			}
		} catch (Exception e) {
			System.err.println("유형 조회 오류 : " + e.toString());
		}
		return vo;
	}
}
