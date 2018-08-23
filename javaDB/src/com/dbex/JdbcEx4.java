package com.dbex;

import java.sql.*;
import static java.lang.System.out;

public class JdbcEx4 {

	public static void main(String[] args) {

		String sql = "select deptno, dname, college, loc from department ";

		Connection con = null;
		Statement stmt = null;

		// select 쿼리의 수행결과집합과 결과집합에서 데이터를 추출할 수 있는 메소드를 가진 객체
		ResultSet rs = null;

		try {

			// 리절트셋까지 객체 하나 더 늘어난 상황 예외처리에 적용해 줘야 하낟.
			// jdbc드라이브 메모리에 로드 함
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 객체 생성 url user password의 순으로 값을 지정해 준다.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// out.println("Database Connection Succsess!");

			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);
			// resultSet 객체로부터 데이터를 추출 -> next()메소드를 이용하여 다음행으로 이동시킨다.
			// 이동된 위치는 row가 존재하면 true, row가 존재하지 않으면 false를 반환한다.
			// rs.next()메소드가 참인 동안 데이터를 추출.

			while (rs.next()) {// 행이 존재한다면 커서가 위치한 row 각각의 column값을 추출함
								// 값을 추출할 때 getXXX() 메소드를 이용함
				int i = rs.getInt(1);// re,getInt("deptno")와 같이 컬럼명을 넣어줘도 된다.
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				/*out.print(i + "\t" +s1+ "\t" + j + "\t" + s2+"\t");*/
				out.print(i + "\t" +s1+ "\t" + j + "\t" + s2+"\t");
	
			}

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();

		} catch (SQLException se) {
			se.printStackTrace();

		} finally {

			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

	}
}
