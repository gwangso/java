package ex08;

import java.sql.*;
import java.util.*;

public class DetailDAO {
	Connection con = Database.connect();

	// 계좌의 거래내역 조회
	public List<DetailVO> list(int ano) {
		List<DetailVO> list = new ArrayList<DetailVO>();
		try {
			String sql = "SELECT * FROM TBL_DETAIL WHERE ANO=? ORDER BY DNO DESC";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ano);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				DetailVO vo = new DetailVO();
				vo.setDno(rs.getInt("dno"));
				vo.setAno(rs.getInt("ano"));
				vo.setAmount(rs.getInt("amount"));
				vo.setDtype(rs.getString("dtype"));
				vo.setDdate(rs.getTimestamp("ddate"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("거래내역 오류 : " + e.toString());
		}
		return list;
	}
	
	public void insert(DetailVO vo) {
		try {
			String sql = "INSERT INTO TBL_DETAIL(DNO,ANO,AMOUNT,DTYPE) VALUES(SEQ_DNO.NEXTVAL,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getAno());
			ps.setInt(2, vo.getAmount());
			ps.setString(3, vo.getDtype());
			ps.execute();
		}catch(Exception e) {
			System.out.println("거래내역 입력 오류 : " + e.toString());
		}
	}
}
