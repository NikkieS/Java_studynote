package prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ERPManager {
	static Scanner kb = new Scanner(System.in);
	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. EMP");
		System.out.println("2. DEPT");
		System.out.println("-----------------------");
		
		int choice = kb.nextInt();
		
		switch(choice) {
		case 1:
			empManager();
			break;
		case 2:
			deptManager();
			break;
		}
		
		kb.close();
	}
	
	private static void empManager() {		
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = kb.nextInt();
		switch(choice) {
		case 1:
			empInsert();
			break;
		case 2:
			empEdit();
			break;
		case 3:
			empDelete();
			break;
		case 4:
			empList();
			break;
		case 5:
			empSearch();
			break;
		}
	}
	
	private static void empInsert(){	
		System.out.println("-----------------------");
		System.out.println("사원 정보를 입력해주세요.");
		System.out.println("-----------------------");
		System.out.println("사원 번호");
		int empno = kb.nextInt();
		
		System.out.println("사원 이름");
		kb.nextLine();
		String ename = kb.nextLine().toUpperCase();
		
		System.out.println("직급");
		String job = kb.nextLine().toUpperCase();
		
		System.out.println("관리자 사원번호");
		int mgr = kb.nextInt();
		
		System.out.println("입사일");
		kb.nextLine();
		String hiredate = kb.nextLine();
		
		System.out.println("급여");
		int sal = kb.nextInt();
		
		System.out.println("성과금");
		int comm = kb.nextInt();
		
		System.out.println("부서번호");
		int deptno = kb.nextInt();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) "
					+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setString(5, hiredate);
			pstmt.setInt(6, sal);
			pstmt.setInt(7, comm);
			pstmt.setInt(8, deptno);
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
			} else {
				System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	
	private static void empEdit(){
		System.out.println("-----------------------");
		System.out.println("수정하실 사원의 정보를 입력해주세요.");
		System.out.println("-----------------------");
		
		System.out.println("찾으실 사원 이름");
		kb.nextLine();
		String ename = kb.nextLine().toUpperCase();
		
		System.out.println("수정하실 이름");
		String editName = kb.nextLine().toUpperCase();
		
		System.out.println("부서");
		int deptno = kb.nextInt();
		
		System.out.println("급여");
		int sal = kb.nextInt();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "update emp set ename = ?, deptno = ?, sal = ? where ename = '"+ename+"'";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, editName);
			pstmt.setInt(2, deptno);
			pstmt.setInt(3, sal);	
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("사원정보 "+resultCnt + "개가 정상적으로 수정되었습니다.");
			} else {
				System.out.println(ename+"에 대한 정보를 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	private static void empDelete() {
		System.out.println("-----------------------");
		System.out.println("삭제하실 사원의 이름을 입력해주세요.");
		System.out.println("-----------------------");
		kb.nextLine();
		String ename = kb.nextLine().toUpperCase();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "delete from emp where ename =?";
			

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  ename);
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println(ename+"의 사원정보가 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("사원을 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	
	private static void empList() {
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "select rownum, ename, job, mgr, hiredate, sal, comm, deptno from emp";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			System.out.println("번호\t 이름\t     직급\t\t관리자\t    입사일\t\t급여\t성과금\t부서번호\t");
			System.out.println("-----------------------------------------------------------------------");		
			
			while(rs.next()) {
				System.out.print(rs.getInt("rownum") + "\t");
				System.out.printf("%6s", rs.getString("ename") + "\t");
				System.out.printf("%9s", rs.getString("job") + "\t");
				System.out.print(rs.getInt("mgr") + "\t");
				System.out.print(rs.getString("hiredate").substring(0, 10) + "\t");
				System.out.print(rs.getInt("sal") + "\t");
				System.out.print(rs.getInt("comm") + "\t");
				System.out.print(rs.getInt("deptno") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	private static void empSearch() {
		System.out.println("-----------------------");
		System.out.println("검색하실 사원의 이름을 입력해주세요.");
		System.out.println("-----------------------");
		kb.nextLine();
		String ename = kb.nextLine().toUpperCase();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "select * from emp where ename like '%'||?||'%'";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  ename);
			
			rs = pstmt.executeQuery();
			int resultCnt = 0;
			
			System.out.println("이름\t부서\t급여\t");
			System.out.println("-----------------------");		
			
			while(rs.next()) {
				System.out.printf(rs.getString("ename") + "\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getInt("sal") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	
	private static void deptManager() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = kb.nextInt();
		switch(choice) {
		case 1:
			deptInsert();
			break;
		case 2:
			deptEdit();
			break;
		case 3:
			deptDelete();
			break;
		case 4:
			deptList();
			break;
		case 5:
			deptSearch();
			break;
		}
	}
	
	private static void deptInsert(){	
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
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
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
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	
	private static void deptEdit(){
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
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "update dept set deptno = ?, dname = ?, loc = ? where ename = '"+dname+"'";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);	
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("사원정보 "+resultCnt + "개가 정상적으로 수정되었습니다.");
			} else {
				System.out.println(dname+"에 대한 정보를 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	private static void deptDelete() {
		System.out.println("-----------------------");
		System.out.println("삭제하실 부서의 이름을 입력해주세요.");
		System.out.println("-----------------------");
		kb.nextLine();
		String dname = kb.nextLine().toUpperCase();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "delete from emp where ename = ?";
			

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  dname);
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println(dname+"의 사원정보가 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("사원을 찾지 못하였습니다. 확인후 재 시도해주세요.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	
	private static void deptList() {
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "select rownum, deptno, dname, loc from dept";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			System.out.println("번호     부서번호\t     부서이름\t       위치\t");
			System.out.println("-----------------------------------------");		
			
			while(rs.next()) {
				System.out.print(rs.getInt("rownum") + "\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.printf("%11s", rs.getString("dname") + "\t");
				System.out.printf("%10s", rs.getString("loc") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
	private static void deptSearch() {
		System.out.println("-----------------------");
		System.out.println("검색하실 부서의 이름을 입력해주세요.");
		System.out.println("-----------------------");
		kb.nextLine();
		String dname = kb.nextLine().toUpperCase();
		
		try {
			//1. 데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			String sql = "select * from dept where dname like '%'||?||'%'";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  dname);
			
			rs = pstmt.executeQuery();
			int resultCnt = 0;
			
			System.out.println("부서번호\t 부서이름\t 위치\t");
			System.out.println("-----------------------");		
			
			while(rs.next()) {
				System.out.printf(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			kb.close();
		}
	}
}