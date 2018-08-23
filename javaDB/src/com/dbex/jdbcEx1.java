package com.dbex;

import static java.lang.System.out;
import java.sql.*;

public class jdbcEx1 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		// ����̺갡 ���� ��츦 �Ҵ��� �� ��� �ϱ� ������ Ʈ����ĳġ�� ���ܸ� ����ش�.

		try {
			// jdbc����̺� �޸𸮿� �ε� ��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Ŀ�ؼ� ��ü ���� url user password�� ������ ���� ������ �ش�.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			//out.println("Database Connection Succsess!");
			
			//���� �ۼ�
			
			stmt = con.createStatement();
			//������Ʈ��Ʈ ���� �� ������ �ۼ� �� Ȱ��
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department "); //�� ���ڿ����� ���࿡ ���Ⱑ ���ٸ� �� ������ ù ���ۿ��� ����
			//�� ��� ��. ��Ʈ�� ���۴� ����� ������ �� ���� ������ �ν��� ����� �� ��
			sql.append("values( 202, '��ǻ�Ͱ��а�', 500, '8ȣ��' )");
		
			//���� ����
			//���� ������ �ѹ��� �� �� �ִ�. �⺻Ű�� �ߺ��� ��
			int result = stmt.executeUpdate(sql.toString());
			out.println(result + "���� ���� �߰��Ǿ����ϴ�.");
			

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
