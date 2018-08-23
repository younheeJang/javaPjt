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
			// 연결 끝.
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");

			int i = pstmt.executeUpdate();
			out.println(i + "개의 행이 수정되었습니다.");

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
