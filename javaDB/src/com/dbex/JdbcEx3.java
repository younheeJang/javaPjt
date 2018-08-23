package com.dbex;

import java.sql.*;
import static java.lang.System.out;

public class JdbcEx3 {

	public static void main(String[] args) {

		String sql = "delete department where dname = '전자계산학과' ";

		Connection con = null;
		Statement stmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			out.println(i + "개의 행이 삭제되었습니다.");

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();

		} catch (SQLException se) {
			se.printStackTrace();

		} finally {

			
			
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
