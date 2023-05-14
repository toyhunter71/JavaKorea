package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUse {
	public static void main(String[] args) {
		
		MyQuery mq = new MyQuery();
		
//		mq.connect();
//		mq.insert();
		
//		mq.connect();
//		mq.update();
		
//		mq.connect();
//		mq.delete();
		
//		mq.connect();
//		mq.selectAll();
//		
//		mq.disconnect();
	
		//1.전체 결과를 보고 2.아무개를 추가한다음 3.여자로 바꿔서 4.다시 검색
		
		System.out.println("===========================================================");
		mq.connect();
		mq.selectAll();
		System.out.println("===========================================================");
		mq.insert();
		mq.selectAll();
		System.out.println("===========================================================");
		mq.update();
		mq.selectAll();
		System.out.println("===========================================================");
		mq.delete();
		mq.selectAll();
		System.out.println("===========================================================");
		mq.disconnect();
		
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
	
	//DB 조회 : SELECT
	public void selectAll() {
		PreparedStatement pstmt = null;
		String sql_query = "SELECT * FROM EMPLOYEE "; 
		ResultSet rs = null;
		
		ArrayList<Integer> no = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> gender = new ArrayList<>();
		
		try {
			//1.pstmt에 sql_query 넣기
			pstmt = conn.prepareStatement(sql_query);
			
			//2.? 채워넣기 생략
			
			//3.sql쿼리 전송하고 그 결과를 변수에 담는다
			rs = pstmt.executeQuery();
			
			//4. 적절하게 배치
			//맨 윗줄부터 한 줄씩 가져온다
			while(rs.next()) {
				no.add(rs.getInt(1));
				name.add(rs.getString("name"));
				gender.add(rs.getString(3));
			}
			
			for(int i=0;i<no.size();i++) {
				System.out.println(no.get(i)+", "+name.get(i)+", "+gender.get(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.정리
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수행 실패");
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//DB 수정(UPDATE 테이블명 SET WHERE 조건)
	public void update() {
		PreparedStatement pstmt = null;
		String sql_query = "UPDATE COMPANY.EMPLOYEE SET GENDER = ? WHERE NAME = ?";
		
		try {
			//1.pstmt에 sql 문자열을 담는다
			pstmt = conn.prepareStatement(sql_query);
			
			//2.pstmt의 ?를 넣는다
			pstmt.setString(1, "여자");
			pstmt.setString(2, "아무개");
			
			//3.DB로 전송한다
			int result = pstmt.executeUpdate();
			
			//4.결과를 확인한다
			if(result > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.더이상 사용하지 않을 자원은 정리한다
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//DB 삭제(DELETE FROM 테이블명 WHERE 조건)
	public void delete() {
		PreparedStatement pstmt = null;
		String sql_query = "DELETE FROM EMPLOYEE WHERE NAME = ?";
		
		try {
			//1.pstmt에 sql 문자열을 담는다
			pstmt = conn.prepareStatement(sql_query);
			
			//2.pstmt의 ?를 넣는다
			pstmt.setString(1, "아무개");
			
			//3.DB로 전송한다
			int result = pstmt.executeUpdate();
			
			//4.결과를 확인한다
			if(result > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.더이상 사용하지 않을 자원은 정리한다
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//DB 연결 해제
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}