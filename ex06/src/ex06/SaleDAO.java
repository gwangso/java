package ex06;

import java.sql.*;
import java.util.*;

public class SaleDAO {
	Connection con = Database.connect();

	public List<SaleVO> list(int pcode) {
		List<SaleVO> list = new ArrayList<SaleVO>();
		try {
			String sql = "SELECT * FROM SALE WHERE Pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setQnt(rs.getInt("qnt"));
				vo.setSprice(rs.getInt("sprice"));
				vo.setSdate(rs.getTimestamp("sdate"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("판매정보 목록 출력 오류 : " + e.toString());
		}
		return list;
	}

	public void sInsert(SaleVO vo){
		try {
			String sql = "INSERT INTO SALE(SCODE,PCODE,QNT,SPRICE) VALUES (SEQ_SCODE.NEXTVAL,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getPcdoe());
			ps.setInt(2, vo.getQnt());
			ps.setInt(3, vo.getSprice());
			ps.execute();
		} catch (Exception e) {
			System.out.println("상품등록 오류 : " + e.toString());
		}
	}
}