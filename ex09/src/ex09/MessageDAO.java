package ex09;

import java.util.*;
import java.sql.*;

public class MessageDAO {
	Connection con = Database.connect();
	
	public List<MessageVO> receiveList(String id){
		List<MessageVO> list = new ArrayList<MessageVO>();
		try {
			String sql = "SELECT M.*, U.UNAME FROM TBL_MESSAGES M, TBL_USERS U WHERE M.RECEIVER=? AND U.ID=M.Sender AND RDEL=0 order by mid";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setSdate(rs.getTimestamp("sdate"));
				vo.setMessage(rs.getString("message"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("받은 메시지 출력 오류 : " + e.toString());
		}
		
		return list;
	}
	
	public List<MessageVO> sendList(String id){
		List<MessageVO> list = new ArrayList<MessageVO>();
		try {
			String sql = "SELECT M.*, U.UNAME FROM TBL_MESSAGES M, TBL_USERS U WHERE M.SENDER=? AND M.RECEIVER=U.ID AND SDEL=0 order by mid";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setSdate(rs.getTimestamp("sdate"));
				vo.setMessage(rs.getString("message"));
				list.add(vo);
			}
		}catch (Exception e) {
			System.out.println("보낸 메시지 출력 오류 : " + e.toString());
		}
		return list;
	}
	
	public MessageVO receivesearch(int num,String id) {
		MessageVO vo = new MessageVO();
		try {
			String sql = "SELECT M.*, U.UNAME FROM TBL_MESSAGES M, TBL_USERS U WHERE M.MID=? and receiver=? and rdel=0";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setSdate(rs.getTimestamp("sdate"));
				vo.setMessage(rs.getString("message"));
			}
		}catch (Exception e) {
			System.out.println("보낸 메시지 출력 오류 : " + e.toString());
		}
		return vo;
	}
	
	public MessageVO sendsearch(int num,String id) {
		MessageVO vo = new MessageVO();
		try {
			String sql = "SELECT M.*, U.UNAME FROM TBL_MESSAGES M, TBL_USERS U WHERE M.MID=? and sender=? and sdel=0";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setSdate(rs.getTimestamp("sdate"));
				vo.setMessage(rs.getString("message"));
			}
		}catch (Exception e) {
			System.out.println("보낸 메시지 출력 오류 : " + e.toString());
		}
		return vo;
	}
	
	
	public void insert(MessageVO vo) {
		try {
			String sql = "INSERT INTO TBL_MESSAGES(MID,SENDER,RECEIVER,MESSAGE) VALUES (SEQ_MID.NEXTVAL,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);		
			ps.setString(1, vo.getSender());
			ps.setString(2, vo.getReceiver());
			ps.setString(3, vo.getMessage());
			ps.execute();
		}catch(Exception e) {
			System.out.println("보낸 메시지 출력 오류 : " + e.toString());
		}
	}
	
	//받은 메세지 삭제
	public void recieveDel(int mid) {
		try {
			String sql = "UPDATE TBL_MESSAGES SET RDEL=1 WHERE MID=?";
			PreparedStatement ps = con.prepareStatement(sql);		
			ps.setInt(1, mid);
			ps.execute();
		}catch(Exception e) {
			System.out.println("받은 메시지 삭제 오류 : " + e.toString());
		}
	}
	
	//보낸 메세지 삭제
	public void sendDel(int mid) {
		try {
			String sql = "UPDATE TBL_MESSAGES SET SDEL=1 WHERE MID=?";
			PreparedStatement ps = con.prepareStatement(sql);		
			ps.setInt(1, mid);
			ps.execute();
		}catch(Exception e) {
			System.out.println("보낸 메시지 삭제 오류 : " + e.toString());
		}
	}
	
	public List<MessageVO> trash(String id){
		List<MessageVO> list = new ArrayList<MessageVO>();
		try {
			String sql = "SELECT M.* FROM TBL_MESSAGES M WHERE (Sender=? and SDEL=1) or (Receiver=? and RDEL=1) order by mid";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setSdate(rs.getTimestamp("sdate"));
				vo.setMessage(rs.getString("message"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("받은 메시지 출력 오류 : " + e.toString());
		}
		return list;
	}
}
