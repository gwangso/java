package ex07;

import java.util.*;
import java.sql.*;

public class ProductDAOimpl implements ProductDAO{
	Connection con = Database.connect();
	
	@Override //재정의하겠다
	public void insert(ProductVO vo) throws Exception {
		String sql = "insert into Products(Pcode,pname,Pprice) VALUES(SEQ_PCODE.NEXTVAL,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPname());
		ps.setInt(2, vo.getPprice());
		ps.execute();
	}

	@Override
	public void update(ProductVO vo) throws Exception {
		String sql = "UPDATE Products set pname=? ,Pprice=? where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPname());
		ps.setInt(2, vo.getPprice());
		ps.setInt(3, vo.getPcode());
		ps.execute();
	}

	@Override
	public void delete(int pcode) throws Exception {
		String sql = "Delete from Products where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ps.execute();
	}

	@Override
	public ProductVO search(int pcode) throws Exception {
		ProductVO vo = new ProductVO();
		String sql = "SELECT * FROM PRODUCTS WHERE PCODE=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			vo.setPcode(rs.getInt("pcode"));
			vo.setPname(rs.getString("pname"));
			vo.setPprice(rs.getInt("pprice"));
		}
		return vo;
	}

	@Override
	public List<ProductVO> list() throws Exception {
		List<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "SELECT * FROM PRODUCTS ORDER BY PCODE ";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ProductVO vo = new ProductVO();			
			vo.setPcode(rs.getInt("pcode"));
			vo.setPname(rs.getString("pname"));
			vo.setPprice(rs.getInt("pprice"));
			list.add(vo);
		}
		return list;
	}
}
