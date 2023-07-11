package ex04;

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
//			System.out.println("서치완료");
			while(rs.next()) { //rs의 next에 값이 있으면 실행, 아니면 
				StudentVO vo = new StudentVO();
				vo.setSno(rs.getInt("sno")); //rs의 인트값을 
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생목록 : " + e.toString());
		}
		return array;
	}

	//학생등록
	public void insert(StudentVO vo) {
		try {
			String sql="insert into tbl_jusso(sno, name, address, phone) values(?,?,?,?)";
			//sql문은 PreparedStatement에 넣어야 실행할 수 있다.
			PreparedStatement ps = con.prepareStatement(sql);
			//실행할 sql이란 변수를 ps에 넣어준다.
			ps.setInt(1, vo.getSno()); //ps의 첫번째 칸에 sno를 집어넣었다.
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getPhone());
			ps.execute();//데이터베이스에 저장
		}catch(Exception e) {
			System.out.println("학생등록 : " + e.toString());
		}
	}
	
	//학생 조회
	public StudentVO read(int no) {
		StudentVO vo = new StudentVO();
		try{
			String sql = "select * from tbl_jusso where sno=?";
			//잠깐 넣어줄 공간 PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); //매서드의 매개변수로 받은 sno를 받아오는것
			ResultSet rs = ps.executeQuery();
//			System.out.println("서치완료");
			if(rs.next()) { //rs의 next에 값이 있으면 실행, 아니면 
				vo.setSno(rs.getInt("sno")); //rs의 인트값을 
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
			}
		}catch(Exception e) {
			System.out.println("학생조회 : " + e.toString());
		}
		return vo;
	}
	
	//학생 삭제
	public void delete(int no) {
		try {
			String sql="delete from tbl_jusso where sno=?";
			//sql문은 PreparedStatement에 넣어야 실행할 수 있다.
			PreparedStatement ps = con.prepareStatement(sql);
			//실행할 sql이란 변수를 ps에 넣어준다.
			ps.setInt(1, no); //ps의 첫번째 칸에 sno를 집어넣었다.
			ps.execute();//데이터베이스에 저장
		}catch(Exception e) {
			System.out.println("학생삭제 : " + e.toString());
		}
	}
	
	//학생 수정
	public void update(StudentVO vo) {
		try {
			String sql="update tbl_jusso set name=?, address=?, phone=? where sno=?";
			//sql문은 PreparedStatement에 넣어야 실행할 수 있다.
			PreparedStatement ps = con.prepareStatement(sql);
			//실행할 sql이란 변수를 ps에 넣어준다.
			ps.setInt(4, vo.getSno()); //ps의 첫번째 칸에 sno를 집어넣었다.
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getPhone());
			ps.execute();//데이터베이스에 저장
		}catch(Exception e) {
			System.out.println("학생수정 : " + e.toString());
		}
	}
	
}