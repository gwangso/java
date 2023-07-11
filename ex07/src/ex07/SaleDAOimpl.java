package ex07;

import java.sql.*;
import java.util.*;

public class SaleDAOimpl implements SaleDAO{
	Connection con = Database.connect();
	
	@Override 
	public List<SaleVO> list(int pcode) throws Exception {
		List<SaleVO> list = new ArrayList<SaleVO>();
		String sql = "SELECT * FROM SALE where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			SaleVO vo = new SaleVO();
			vo.setScode(rs.getInt("scode"));
			vo.setPcdoe(rs.getInt("pcode"));
			vo.setQnt(rs.getInt("qnt"));
			vo.setSprice(rs.getInt("sprice"));
			vo.setSdate(rs.getTimestamp("sdate"));
			list.add(vo);
		}
		return list;
	}
	
	@Override 
	public void insert(SaleVO vo) throws Exception{
		String sql = "INSERT INTO SALE(SCODE,PCODE,QNT,SPRICE) VALUES(SEQ_SCODE.NEXTVAL,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getPcdoe());
		ps.setInt(2, vo.getQnt());
		ps.setInt(3, vo.getSprice());
		ps.execute();
	}
	
	@Override 
	public List<SaleVO> sum_list() {
		List<SaleVO> list = new ArrayList<SaleVO>();
		try {
			String sql = "SELECT PCODE, PNAME, SUM(QNT) sum_qnt, SUM(SSUM) sum_price FROM VIEW_SALE GROUP BY PCODE, PNAME ORDER BY PCODE";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setPcdoe(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setQnt(rs.getInt("sum_qnt"));
				vo.setSprice(rs.getInt("sum_price"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("상품별 판매현황 오류 : " + e.toString());
		}
		return list;
	}
}
