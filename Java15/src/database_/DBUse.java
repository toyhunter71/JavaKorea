package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUse {
	public static void main(String[] args) {
		
		MyQuery mq = new MyQuery();
		
		mq.connect();
		mq.insert();
	}
}

class MyQuery{
	//데이터베이스는 기본적으로 읽기, 쓰기, 수정, 삭제 CRUD
	//프로그래밍 언어에서 database를 사용하기 위해서는 두가지 방법이 있음
	//Statement : 쉬움, 보안취약점
	//PreparedStatement : 어려움, 보안
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";    //"jdbc:mysql://127.0.0.1:3307/스키마이름";
	
	//생성자
	public MyQuery() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver"
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db 라이브러리 로드 실패");
		}
	}
	
	//DB연결
	public void connect() {
		
		try {
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("db연결 실패");
		}
	}
	
	//DB 입력 : insert into 테이블명 value 값;
	public void insert() {
		PreparedStatement pstmt = null;
		String sql_query = "INSERT INTO COMPANY.EMPLOYEE VALUE (?,?,?)";
		
		try {
			//pstmt에다가 sql_query를 넣기
			pstmt = conn.prepareStatement(sql_query);
			
			//? 채우기
			pstmt.setInt(1, 4);                 //첫번째 ?
			pstmt.setString(2, "아무개");
			pstmt.setString(3, "남자");
			
			//sql쿼리를 db서버에 전송한다
			int result = pstmt.executeUpdate();
			
			//성공 여부를 판별한다
			if(result > 0) {
				System.out.println("db입력 성공");
			}else {
				System.out.println("db입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("db수행 실패");
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}