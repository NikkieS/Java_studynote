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

	public int basicInsert(Basic info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			if (info.getPemail().isEmpty()) {
				String sql = "insert into phonebook (pidx, pname, pnum) "
						+ " values (?, ?, ?)";
			}
			String sql = "insert into phonebook (pidx, pname, pnum) "
					+ " values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
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
	
	public List<Basic> basicList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<Basic> basicList = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pname, pnum, padd, pemail from phonebook";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				basicList.add(new Basic(rs.getString("pname"),
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
		return basicList;
	}
}
