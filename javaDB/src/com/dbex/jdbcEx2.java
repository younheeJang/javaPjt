package com.dbex;

import static java.lang.System.out;
import java.sql.*;

public class jdbcEx2 {
	// update예제

	public static void main(String[] args) {
		// 업데이트 테이블명 셋 필드명
		String sql = "update department set loc = '5호실' where deptno = 205";
		/*
		 * StringBuffer sql = new StringBuffer(); sql.append("")
		 */

		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc드라이브 메모리에 로드 함
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 객체 생성 url user password의 순으로 값을 지정해 준다.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// out.println("Database Connection Succsess!");
			stmt = con.createStatement();

			// update쿼리문 작성
			// update문은 executeUpdate() 메소드 사용

			int result = stmt.executeUpdate(sql);

			out.println(result + "개의 행이 수정되었습니다.");

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
