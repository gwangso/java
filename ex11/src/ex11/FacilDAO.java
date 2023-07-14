package ex11;

import java.sql.*;
import java.util.*;

public class FacilDAO {
	Connection con = Database.connect();
	
	// 시설물 종류
	public List<FacilVO> list(){
		List<FacilVO> list = new ArrayList<FacilVO>();
		try {
			String sql = "SELECT * FROM TBL_FACILITY ORDER BY FNO";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FacilVO vo = new FacilVO();
				vo.setFno(rs.getInt("fno"));
				vo.setFname(rs.getString("fname"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println("시설 목록 오류 : " + e.toString());
		}
		return list;
	}
	
	public FacilVO search(int fno) {
		FacilVO vo = new FacilVO();
		try {
			String sql = "SELECT * FROM TBL_FACILITY where fno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, fno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setFno(rs.getInt("fno"));
				vo.setFname(rs.getString("fname"));
			}
		} catch (Exception e) {
			System.err.println("시설 조회 오류 : " + e.toString());
		}
		return vo;
	}
	
//	public int getNfno() {
//		int fno = 0;
//		try {
//			String sql = "SELECT MAX(FNO)+1 NFNO FROM TBL_FACILITY";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ResultSet rs =ps.executeQuery();
//			if(rs.next()) {
//				fno = rs.getInt("NFNO");
//			}
//		} catch (Exception e) {
//			System.out.println("시설 추가 오류 : " + e.toString());
//		}
//		return fno;
//	}
//	
//	public void insert(FacilVO vo) {
//		try {
//			String sql = "INSERT INTO TBL_FACILITY VALUES(?,?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, vo.getFno());
//			ps.setString(2, vo.getFname());
//			ps.execute();
//		} catch (Exception e) {
//			System.out.println("시설 추가 오류 : " + e.toString());
//		}
//	}
	
	//특정캠프의 시설물리스트
	public List<CampFacilVO> cflist(String cno){
		List<CampFacilVO> list = new ArrayList<CampFacilVO>();
		try {
			String sql = "SELECT * FROM VIEW_CFACIL WHERE CNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CampFacilVO vo = new CampFacilVO();
				vo.setCno(rs.getString("cno"));
				vo.setFno(rs.getInt("fno"));
				vo.setFname(rs.getString("fname"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println("시설 목록 오류 : " + e.toString());
		}
		return list;
	}
	
	public void cfinsert(String cno, int fno) {
		try {
			String sql = "INSERT INTO TBL_CAMP_FACIL(CNO,FNO) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, fno);
			ps.execute();
		} catch (Exception e) {
			System.out.println("시설 추가 오류 : " + e.toString());
		}
	}
	
	public void delete(String cno, int fno) {
		try {
			String sql = "DELETE FROM TBL_CAMP_FACIL WHERE CNO=? AND FNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, fno);
			ps.execute();
		} catch (Exception e) {
			System.out.println("시설 삭제 오류 : " + e.toString());
		}
	}
	
	
}