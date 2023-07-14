package ex09;

import java.sql.*;
import java.util.*;

public class UserDAO {
	Connection con = Database.connect();

	// 사용자 목록
	public List<UserVO> list() {
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			String sql = "SELECT * FROM TBL_USERS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setUname(rs.getString("uname"));
				vo.setPoint(rs.getInt("point"));
				vo.setPhone(rs.getString("phone"));
				list.add(vo);
			}

		} catch (Exception e) {
			System.out.println("사용자 목록 출력 오류 : " + e.toString());
		}
		return list;
	}
	
	//사용자조회
	public UserVO search(String id) {
		UserVO vo = new UserVO();
		try {
			String sql = "SELECT * FROM TBL_USERS WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setUname(rs.getString("uname"));
				vo.setPoint(rs.getInt("point"));
				vo.setPhone(rs.getString("phone"));
			}
		} catch (Exception e) {
			System.out.println("사용자 조회 오류 : " + e.toString());
		}
		return vo;
	}
	
	//사용자 등록
	public void insert(UserVO vo) {
		try {
			String sql = "INSERT INTO TBL_USERS(ID,UNAME,PHONE) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getUname());
			ps.setString(3, vo.getPhone());
			ps.execute();
		} catch (Exception e) {
			System.out.println("사용자 등록 오류 : " + e.toString());
		}
	}
	
	//사용자 수정
	public void update(UserVO vo) {
		try {
			String sql = "UPDATE TBL_USERS SET UNAME=?, PHONE=? WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUname());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getId());
			ps.execute();
		} catch (Exception e) {
			System.out.println("사용자 정보수정 오류 : " + e.toString());
		}
	}
	
	public void delete(String id) {
		try {
			String sql = "DELETE FROM TBL_USERS WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.execute();
		} catch (Exception e) {
			System.out.println("사용자 삭제 오류 : " + e.toString());
		}
	}
	
	public void updatepoint(String id) {
		try {
			String sql = "UPDATE TBL_USERS SET Point=Point+10 WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.execute();
		} catch (Exception e) {
			System.out.println("포인트 업데이트 오류 : " + e.toString());
		}
	}
}
