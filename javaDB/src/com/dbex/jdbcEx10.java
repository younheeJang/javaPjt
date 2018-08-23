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
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));// 프로펄티즈에서 인서트 구문 겟.
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");

			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이 추가되었습니다.");

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
