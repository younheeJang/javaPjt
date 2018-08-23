package com.dbex;

import static java.lang.System.out;
import java.sql.*;

public class jdbcEx2 {
	// update����

	public static void main(String[] args) {
		// ������Ʈ ���̺�� �� �ʵ��
		String sql = "update department set loc = '5ȣ��' where deptno = 205";
		/*
		 * StringBuffer sql = new StringBuffer(); sql.append("")
		 */

		Connection con = null;
		Statement stmt = null;

		try {
			// jdbc����̺� �޸𸮿� �ε� ��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Ŀ�ؼ� ��ü ���� url user password�� ������ ���� ������ �ش�.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// out.println("Database Connection Succsess!");
			stmt = con.createStatement();

			// update������ �ۼ�
			// update���� executeUpdate() �޼ҵ� ���

			int result = stmt.executeUpdate(sql);

			out.println(result + "���� ���� �����Ǿ����ϴ�.");

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
