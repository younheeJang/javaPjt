package com.dbex;

import java.sql.*;
import java.io.*;

public class jdbcEx9 {

	public static void main(String[] args) throws IOException {

		/*
		 * MetaData : �������� ������Ҹ� ��Ÿ�� , �ȿ� �ִ� �������� ��Ÿ�� ResultSetMetaData �� ResultSet��
		 * �����ϴ� ��� ��Ҹ� �˾Ƴ� �� �ִ� �޼ҵ带 ������
		 * 
		 */

		// Ű����� ����� ��Ʈ�� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("sql �Է�:");
		String sql = br.readLine();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// ���� ���� ��� ������ �ΰ������� ������ �ִ�
			// ResultSetMetaData ���
			rsmd = rs.getMetaData();
			System.out.println("�÷��� ���� :" + rsmd.getColumnCount());
			int colCnt = rsmd.getColumnCount();
			while (rs.next()) {

				for (int colNum = 1; colNum <= colCnt; colNum++) {
					int colType = rsmd.getColumnType(colNum);

					switch (colType) {
					case Types.NUMERIC:
						System.out.println(rs.getInt(colNum) + "\t");
						break;
					case Types.VARCHAR:
						System.out.println(rs.getString(colNum) + "\t");
						break;
					case Types.DATE:
						System.out.println(rs.getDate(colNum) + "\t");
						break;
					}
				}
				System.out.println();
			}

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
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}