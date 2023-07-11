package ex06;

import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;


public class ProductDAO {
	Connection con = Database.connect();

	//상품 목록
	public List<ProductVO> list(){
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			String sql = "select * from products order by pcode desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("목록 출력 오류 : " + e.toString());
		}
		return list;
	}
	
	public List<ProductVO> searchName(String pname) {
		List<ProductVO> sList = new ArrayList<ProductVO>();
		ProductVO vo = new ProductVO();
		try {
			String sql = "select * from products where pname like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%"+pname+"%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo= new ProductVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
				sList.add(vo);
			}
		}catch(Exception e) {
			System.out.println("조회 출력 오류 : " + e.toString());
		}
		return sList;
	}
	
	public ProductVO searchCode(int pcode) {
		ProductVO vo = new ProductVO();
		try {
			String sql = "select * from products where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo= new ProductVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
			}
		}catch(Exception e) {
			System.out.println("조회 출력 오류 : " + e.toString());
		}
		return vo;
	}
	
	public void insult(ProductVO vo) {
		try {
			String sql = "insert into Products(pcode,pname,pprice) values(pcode_seq.nextval,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getPprice());
			ps.execute();
			System.out.println("'" + vo.getPname() + "' 상품이 등록되었습니다.");
		}catch(Exception e) {
			System.out.println("상품등록 오류 : " + e.toString());
		}
	}
	
	public void delete(int code) throws Exception { // Exception이 발생시 일단 넘기고 밖에서 받겠다는 의미
		String sql = "delete from Products where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, code);
		ps.execute();
		System.out.println("상품이 삭제되었습니다.");
	}
	
	public void update(ProductVO vo) {
		try {
			String sql = "update Products set pname=?, pprice=? where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(3, vo.getPcode());
			ps.setInt(2, vo.getPprice());
			ps.execute();
			System.out.println("'" + vo.getPname() + "' 상품이 등록되었습니다.");
		}catch(Exception e) {
			System.out.println("상품등록 오류 : " + e.toString());
		}
	}
}
