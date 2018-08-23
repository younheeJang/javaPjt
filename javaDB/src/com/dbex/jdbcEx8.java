package com.dbex;

import java.sql.*;

public class jdbcEx8 {

	public static void main(String[] args) {
		StringBuffer sql1 = new StringBuffer();

		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");

		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc=? ");

		sql2.append("where deptno=?");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// �ϳ��� �� �۾����� ����
			con = ConnUtil.getConnection();
			// ���� Ŀ��Ʈ ��� ��Ȱ��ȭ ��Ű��
			con.setAutoCommit(false);
			// 1�� �۾� ����
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 300);
			pstmt.setString(4, "9ȣ��");
			pstmt.executeUpdate();

			// 1�� �۾� ����

			pstmt = con.prepareStatement(sql2.toString());

			pstmt.setString(1, "������а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();

			// 2�� �۾� ����

			// ������ ���������� ����� ��쿡 �����ͺ��̽��� �ݿ���

			con.commit();
			System.out.println("�����ͺ��̽��� ���������� �ݿ��Ǿ����ϴ�.");

		} catch (SQLException se) {
			try {
				con.rollback();
				System.out.println("�����ͺ��̽��� �ݿ��� �۾��� ��ҵǾ����ϴ�.");
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
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
