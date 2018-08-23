package com.dbex;

import java.sql.*;
import static java.lang.System.out;

public class JdbcEx3 {

	public static void main(String[] args) {

		String sql = "delete department where dname = '���ڰ���а�' ";

		Connection con = null;
		Statement stmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			out.println(i + "���� ���� �����Ǿ����ϴ�.");

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
