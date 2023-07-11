package ex03;

import java.sql.*;
import java.util.*;

public class StudentDAO {
	//데이터베이스 관련작업
	//Database 클레스의 connect메서드에서 리턴값을 받음
	Connection con = Database.connect();
	
	//학생목록
	public List<StudentVO> list(){
		List<StudentVO> array = new ArrayList<StudentVO>();
		try{
			String sql = "select * from tbl_jusso";
			//잠깐 넣어줄 공간 PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) { //rs의 next에 값이 있으면 실행, 아니면 
				StudentVO vo = new StudentVO();
				vo.comeSno(rs.getString("sno")); //rs의 인트값을 
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생목록 실패 : " + e.toString());
		}
		return array;
	}
	
	//조회
	public StudentVO search(String no) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "select * from tbl_jusso where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				vo.comeSno(rs.getString("sno")); //rs의 인트값을 
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
			}
		}catch(Exception e) {
			System.out.println("학생 조회 실패 : " + e.toString());
		}
		return vo;
	}
	
	//삽입
	public void insult(StudentVO vo) {
		try {
			String sql = "insert into tbl_jusso(sno,name,address,phone) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSno());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getPhone());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생 삽입 실패 : " + e.toString());
		}
	}
	
	//삭제
	public void delete(String no) {
		try {
			String sql = "delete from tbl_jusso where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no);
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생 삭제 실패 : " + e.toString());
		}
	}
	
	//수정
	public void update(StudentVO vo) {
		try {
			String sql = "update tbl_jusso set name=?, address=?, phone=? where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getSno());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생 삭제 실패 : " + e.toString());
		}
	}
}