package com.dbex;

import java.sql.*;
import static java.lang.System.out;

public class JdbcEx4 {

	public static void main(String[] args) {

		String sql = "select deptno, dname, college, loc from department ";

		Connection con = null;
		Statement stmt = null;

		// select ������ ���������հ� ������տ��� �����͸� ������ �� �ִ� �޼ҵ带 ���� ��ü
		ResultSet rs = null;

		try {

			// ����Ʈ�±��� ��ü �ϳ� �� �þ ��Ȳ ����ó���� ������ ��� �ϳ�.
			// jdbc����̺� �޸𸮿� �ε� ��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Ŀ�ؼ� ��ü ���� url user password�� ������ ���� ������ �ش�.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// out.println("Database Connection Succsess!");

			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);
			// resultSet ��ü�κ��� �����͸� ���� -> next()�޼ҵ带 �̿��Ͽ� ���������� �̵���Ų��.
			// �̵��� ��ġ�� row�� �����ϸ� true, row�� �������� ������ false�� ��ȯ�Ѵ�.
			// rs.next()�޼ҵ尡 ���� ���� �����͸� ����.

			while (rs.next()) {// ���� �����Ѵٸ� Ŀ���� ��ġ�� row ������ column���� ������
								// ���� ������ �� getXXX() �޼ҵ带 �̿���
				int i = rs.getInt(1);// re,getInt("deptno")�� ���� �÷����� �־��൵ �ȴ�.
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
