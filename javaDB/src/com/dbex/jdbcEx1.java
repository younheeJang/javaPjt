package com.dbex;

import static java.lang.System.out;
import java.sql.*;

public class jdbcEx1 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		// 드라이브가 없는 경우를 할당을 해 줘야 하기 때문에 트라이캐치로 예외를 잡아준다.

		try {
			// jdbc드라이브 메모리에 로드 함
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 객체 생성 url user password의 순으로 값을 지정해 준다.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			//out.println("Database Connection Succsess!");
			
			//쿼리 작성
			
			stmt = con.createStatement();
			//스테이트먼트 생성 후 쿼리문 작성 후 활용
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department "); //앞 문자열에서 만약에 띄어쓰기가 없다면 뒤 벨류즈 첫 시작에서 띄어쓰기
			//해 줘야 함. 스트링 버퍼는 띄어쓰기로 구분을 해 주지 않으면 인식을 제대로 못 함
			sql.append("values( 202, '컴퓨터공학과', 500, '8호관' )");
		
			//쿼리 실행
			//쿼리 실행은 한번만 할 수 있다. 기본키는 중복될 수
			int result = stmt.executeUpdate(sql.toString());
			out.println(result + "개의 행이 추가되었습니다.");
			

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
