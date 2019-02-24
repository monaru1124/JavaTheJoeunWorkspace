package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBHelper {
	
	public void runDB() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("***** 메뉴 선택 *****");
		System.out.println(" 1. 학생 목록 조회");
		System.out.println(" 2. 강의 목록 조회");
		System.out.println(" 3. 수강 현황 조회");
		System.out.println("********************");
		System.out.print(" 메뉴 입력 : ");
		int userInput = scan.nextInt();
		
		if(userInput == 1) {
//			메쏘드
			findAllStudents();
		}
		else if(userInput == 2) {
//			메쏘드
			findAllLecture();
		}
		else if(userInput==3) {
			findAllUserLectures();
		}
		
		
	}
	
	public void findAllStudents() {
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://db-test.c8tmbn1lurqs.ap-northeast-2.rds.amazonaws.com/db_test";
			
			conn = DriverManager.getConnection(url, "dbtest", "dbpassword");
			
			String sql = "SELECT * FROM users";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String userName = rs.getString("name");
				String userEmail = rs.getString("email");
				String userGender = rs.getString("gender");
				
				System.out.println(String.format("%s : %s, %s", userName, userEmail, userGender));
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public void findAllLecture() {
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://db-test.c8tmbn1lurqs.ap-northeast-2.rds.amazonaws.com/db_test";
			
			conn = DriverManager.getConnection(url, "dbtest", "dbpassword");
			
//			String sql = "SELECT * FROM lectures";
			String sql = "SELECT * FROM lectures JOIN users ON lectures.teacher_id = users.id";
			
//			 SELECT posts.title, posts.content, posts.created_at 
//			 FROM posts JOIN users ON posts.user_id = users.id
//					 WHERE users.name = '조경진' ;
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String lectureTitle = rs.getString("title");
				String lectureTeacher = rs.getString("users.name");
				String lectureBegin = rs.getString("start");
				String lectureEnd = rs.getString("end");
				
				System.out.println(String.format("%s : %s, %s, %s", lectureTitle, lectureTeacher, lectureBegin, lectureEnd));
				
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void findAllUserLectures() {
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://db-test.c8tmbn1lurqs.ap-northeast-2.rds.amazonaws.com/db_test";
			
			conn = DriverManager.getConnection(url, "dbtest", "dbpassword");
			
			String sql = "SELECT l.title, u.name FROM user_lecture AS ul "
					+ "JOIN users AS u ON ul.student_id = u.id "
					+ "JOIN lectures AS l ON ul.lecture_id = l.id";
			

			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String lectureTitle = rs.getString("l.title");
				String student = rs.getString("u.name");
				
				System.out.println(String.format("%s : %s", lectureTitle, student));
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
