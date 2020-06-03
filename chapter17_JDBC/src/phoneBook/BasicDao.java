package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prac.ConnProvider;

public class BasicDao {
	
	String getKey() {
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String key = null;
		
		try {
			conn = ConnProvider.getConnection();
			
			stmt = conn.createStatement();
			String sql = "select phonebook_pidx_seq.nextval from dual";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				key = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}

		return key;
	}
	
	public int Insert(Basic info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		String sql = null;
	
		String type = info.getPtype();
		
		try {
			conn = ConnProvider.getConnection();
			
			switch(type) {
			case "basic":
				sql = "insert into phonebook (pidx, pname, pnum, padd, pemail) "
						+ " values (?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, info.getPidx());
				pstmt.setString(2, info.getPname());
				pstmt.setString(3, info.getPnum());
				pstmt.setString(4, info.getPadd());
				pstmt.setString(5, info.getPemail());
				
				break;
			case "univ":
				sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pumajor, puyear) "
						+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, info.getPidx());
				pstmt.setString(2, info.getPname());
				pstmt.setString(3, info.getPnum());
				pstmt.setString(4, info.getPadd());
				pstmt.setString(5, info.getPemail());
				pstmt.setString(6, "univ");
				pstmt.setString(7, ((Univ) info).getPumajor());
				pstmt.setInt(8, ((Univ) info).getPuyear());
				
				break;
			case "com":
				sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pcomname, pcomdept, pcomjob) "
						+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, info.getPidx());
				pstmt.setString(2, info.getPname());
				pstmt.setString(3, info.getPnum());
				pstmt.setString(4, info.getPadd());
				pstmt.setString(5, info.getPemail());
				pstmt.setString(6, "com");
				pstmt.setString(7, ((Com) info).getPcomname());
				pstmt.setString(8, ((Com) info).getPcomdept());
				pstmt.setString(9, ((Com) info).getPcomjob());
				
				break;
			case "cafe":
				sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pcafename, pcafenickname) "
						+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, info.getPidx());
				pstmt.setString(2, info.getPname());
				pstmt.setString(3, info.getPnum());
				pstmt.setString(4, info.getPadd());
				pstmt.setString(5, info.getPemail());
				pstmt.setString(6, "com");
				pstmt.setString(7, ((Cafe) info).getPcafename());
				pstmt.setString(8, ((Cafe) info).getPcafenickname());
			}
	
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return resultCnt;
	}
	
	public int Edit() {
		return 0;
	}
	
	public int Delete() {
		return 0;
	}
	
	public List<Basic> Search(){
		List<Basic> list = new ArrayList<>();
		
		return list;
	}
	
	public List<Basic> basicList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<Basic> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pidx, ptype, pname, pnum, padd, pemail from phonebook";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				list.add(new Basic(rs.getString("pidx"),
										rs.getString("ptype"),
										rs.getString("pname"),
										rs.getString("pnum"),
										rs.getString("padd"),
										rs.getString("pemail")));
				resultCnt++;
			}
			
			if(resultCnt<1) {
				System.out.println("저장된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
