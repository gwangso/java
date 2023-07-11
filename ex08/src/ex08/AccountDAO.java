package ex08;

import java.sql.*;
import java.util.*;

public class AccountDAO {
	Connection con = Database.connect();
	
	public List<AccountVO> list(){
		List<AccountVO> list = new ArrayList<AccountVO>();
		try {
			String sql = "SELECT * FROM TBL_ACCOUNT";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AccountVO vo = new AccountVO();
				vo.setAno(rs.getInt("ano"));
				vo.setAname(rs.getString("aname"));
				vo.setBalance(rs.getInt("balance"));
				list.add(vo);
			}			
		}catch(Exception e) {
			System.out.println("계좌목록 조회 오류" + e.toString());
		}
		return list;
	}
	
	//계좌정보 조회
	public AccountVO search(int ano){
		AccountVO vo = new AccountVO();
		try {
			String sql = "SELECT * FROM TBL_ACCOUNT WHERE ANO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ano);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setAno(rs.getInt("ano"));
				vo.setAname(rs.getString("aname"));
				vo.setBalance(rs.getInt("balance"));
			}			
		}catch(Exception e) {
			System.out.println("계좌 조회 오류" + e.toString());
		}
		return vo;
	}//search method
	
	public int insert(AccountVO vo) {
		int ano=0;
		try {
			String sql = "INSERT INTO TBL_ACCOUNT(ANO,ANAME,BALANCE) VALUES (SEQ_ANO.NEXTVAL,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getAname());
			ps.setInt(2, vo.getBalance());
			ps.execute();
			
			sql = "Select Seq_ano.currval ano from dual";
			ps=con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) ano=rs.getInt("ano");
		}catch (Exception e) {
			System.out.println("계좌 생성 오류  : " + e.toString());
		}
		return ano;
	}
	
	public void update(AccountVO vo) {
		try {
			String sql = "UPDATE TBL_ACCOUNT SET BALANCE=? WHERE ANO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getBalance());
			ps.setInt(2, vo.getAno());
			ps.execute();
		}catch (Exception e) {
			System.out.println("계좌 잔액 업데이트 오류  : " + e.toString());
		}
	}
}
