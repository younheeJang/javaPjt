package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class jdbcEx10 {

	public static void main(String[] args) throws SQLException, IOException {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));// ������Ƽ��� �μ�Ʈ ���� ��.
			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");

			int i = pstmt.executeUpdate();
			System.out.println(i + "�� ���� �߰��Ǿ����ϴ�.");

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

	}

}
