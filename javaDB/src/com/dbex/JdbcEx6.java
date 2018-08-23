package com.dbex;

import java.sql.*;
import static java.lang.System.out;

public class JdbcEx6 {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();
		sql.append("update professor ");
		sql.append("set sal = ?");
		sql.append("where name = ?");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// ���� ��.
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 500);
			pstmt.setString(2, "ȫ�浿");

			int i = pstmt.executeUpdate();
			out.println(i + "���� ���� �����Ǿ����ϴ�.");

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
