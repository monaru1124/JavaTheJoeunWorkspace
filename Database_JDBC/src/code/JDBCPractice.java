package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {

//	단순히 DB서버에 연결만 해보기
	public void connectPractice() {
		
//		연결을 관리하는 인터페이스 변수.
//		java.sql 패키지에 포함되어 있는것을 선택.
		Connection conn = null;
		

		try {
//			JDBC 드라이버는 외부 라이브러리라서, 별개로 로드하는 과정 필요.
			Class.forName("com.mysql.jdbc.Driver");
			
//			연결 정보 담는 url 생성.
//			양식 : "jdbc:mysql://서버주소/DB이름"
			String url = "jdbc:mysql://delivery.c0ctoatt9tr3.ap-northeast-2.rds.amazonaws.com/tjeit";
			
//			실제 연결 시도.
			
			conn = DriverManager.getConnection(url,"delivery","dbpassword");
			
//			여기까지 왔다! => 연결에 성공했다고 간주.
			System.out.println("DB 연결 성공!");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 드라이버 로딩 실패");
			System.out.println("JDBC를 제대로 추가했는지 확인해주세요.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 서버 연결 실패");
			System.out.println("DB 서버가 접속이 가능한 상태인지 확인.");
			System.out.println("접속 정보를 틀리지 않고 입력했는지 코드 검토.");
		}
		finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	} // connectPractice()
	
//	SELECT 문 실행 연습
	public void selectPractive(String id, String pw) {
		
//		연결을 관리하는 인터페이스 변수.
//		java.sql 패키지에 포함되어 있는것을 선택.
		Connection conn = null;
		

//		쿼리 수행을 전담해주는 클래스인 Statement를 객체화.
//		java.sql에 들어있는 클래스 선택
		Statement stmt = null;
		
//		쿼리 결과를 저장하는데 쓰이는 ResultSet 클래스 객체화.
//		java.sql에 들어있는 클래스 선택
		ResultSet rs = null;
		
		

		try {
//			JDBC 드라이버는 외부 라이브러리라서, 별개로 로드하는 과정 필요.
			Class.forName("com.mysql.jdbc.Driver");
			
//			연결 정보 담는 url 생성.
//			양식 : "jdbc:mysql://서버주소/DB이름"
			String url = "jdbc:mysql://delivery.c0ctoatt9tr3.ap-northeast-2.rds.amazonaws.com/tjeit";
			
//			실제 연결 시도.
			
			conn = DriverManager.getConnection(url,"delivery","dbpassword");
			
//			여기까지 왔다! => 연결에 성공했다고 간주.
			System.out.println("DB 연결 성공!");
			
			
//			DB를 통해 실행할 쿼리를 작성.
			
			String sql = String.format("SELECT email, name, phone_num "
					+ "FROM users "
					+ "WHERE email='%s' AND password='%s'", id, pw);
			
//			작성한 쿼리를 stmt를 이용해서 실제로 실행. 결과를 rs 변수에 저장
//			stmt 객체를 생성
			stmt = conn.createStatement();
//			stmt에게 쿼리 실행 요청, rs에 저장
			rs = stmt.executeQuery(sql);
						
//			rs에 담겨있는 결과 출력 => 파일 입출력에서 FileReader와 유사한 기법.
			
			while(rs.next()) {
//				조회 결과가 있어서, 읽으러 들어옴!
				
				String name = rs.getString(rs.findColumn("name"));
				
				System.out.println(name + "님, 환영합니다!");
				
				
			} // while(rs.next())
			
		
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 드라이버 로딩 실패");
			System.out.println("JDBC를 제대로 추가했는지 확인해주세요.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 서버 연결 실패");
			System.out.println("DB 서버가 접속이 가능한 상태인지 확인.");
			System.out.println("접속 정보를 틀리지 않고 입력했는지 코드 검토.");
		}
		finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

		
		
	} //selectPractive()
}
