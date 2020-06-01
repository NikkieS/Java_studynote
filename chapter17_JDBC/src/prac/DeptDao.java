package prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {
	// DAO = Data Access Object
	// 데이터베이스 처리 하는 클래스
	
	// MVC = Model, View, Controller
	// model : Service, DAO
	// 데이터베이스 
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void deptInsert(){	
		System.out.println("-----------------------");
		System.out.println("부서 정보를 입력해주세요.");
		System.out.println("-----------------------");
		System.out.println("부서 번호");
		int deptno = kb.nextInt();
		
		System.out.println("부서 이름");
		kb.nextLine();
		String dname = kb.nextLine().toUpperCase();
		
		System.out.println("위치");
		String loc = kb.nextLine().toUpperCase();
		
		try {
			//3. SQL 처리
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
			} else {
				System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	public void deptEdit(){
		System.out.println("-----------------------");
		System.out.println("수정하실 부서의 정보를 입력해주세요.");
		System.out.println("-----------------------");
		
		System.out.println("찾으실 부서 이름");
		kb.nextLine();
		String dname = kb.nextLine().toUpperCase();
		
		System.out.println("수정하실 이름");
		String editName = kb.nextLine().toUpperCase();
		
		System.out.println("부서 번호");
		int deptno = kb.nextInt();
		
		System.out.println("위치");
		kb.nextLine();
		String loc = kb.nextLine().toUpperCase();
		
		try {
			//3. SQL 처리
			String sql = "update dept set deptno = ?, dname = ?, loc = ? where dname = '"+dname+"'";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, editName);
			pstmt.setString(3, loc);	
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("부서정보 "+resultCnt + "개가 정상적으로 수정되었습니다.");
			} else {
				System.out.println(dname+"에 대한 정보를 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	public void deptDelete() {
		System.out.println("-----------------------");
		System.out.println("삭제하실 부서의 번호를 입력해주세요.");
		System.out.println("-----------------------");
		
		int deptno = kb.nextInt();
		
		try {
			//3. SQL 처리
			stmt = conn.createStatement();
			String sql = "delete from dept where deptno ="+deptno;
			
			int resultCnt = stmt.executeUpdate(sql);
			
			if(resultCnt>0) {
				System.out.println(deptno+"의 부서정보가 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("부서를 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	public List<Dept> deptList() {
		// VO : Value Object
		// DTO : Data Transfer Object
		
		// DAO 클래스 추가
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<Dept> deptList = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			//3. SQL 처리
			String sql = "select rownum, deptno, dname, loc from dept order by deptno asc";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			System.out.println("부서번호\t      부서이름\t          위치\t");
			System.out.println("-----------------------------------------");		
			
			while(rs.next()) {
				Dept dept = new Dept(
						rs.getInt("deptno"),
						rs.getString("dname"),
						rs.getString("loc"));
				
				deptList.add(dept);
				
//				System.out.print(rs.getInt("rownum") + "\t");
//				System.out.print(rs.getInt("deptno") + "\t");
//				System.out.printf("%11s", rs.getString("dname") + "\t");
//				System.out.printf("%10s", rs.getString("loc") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return deptList;
	}
	
	public void deptSearch() {
		System.out.println("-----------------------");
		System.out.println("검색하실 부서의 이름을 입력해주세요.");
		System.out.println("-----------------------");
		kb.nextLine();
		String dname = kb.nextLine().toUpperCase();
		
		try {
			//3. SQL 처리
			String sql = "select * from dept where dname like '%'||?||'%'";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  dname);
			
			rs = pstmt.executeQuery();
			int resultCnt = 0;
			
			System.out.println("부서번호\t 부서이름\t\t  위치\t");
			System.out.println("----------------------------------");		
			
			while(rs.next()) {
				System.out.printf(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}
