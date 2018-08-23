package com.dbex;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx5 {

	public static void main(String[] args) {
		// preparedStatement �������̽��� ���
		// ? (���ε������� ó����) �� ��񿡼� sql ����ÿ� ���������� ��ü��
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?, ?, ?, ?, ?, sysdate, ?, ?)"); // ���ͳ� �Խ��ǿ� ���� �ø� ��, �ڵ����� �����Ǵ�
		// ������ ��¥���� ���������� ����ڰ� �Է��ϱ� ������ ���̴�.
		// ���� ��¥�� �A �������� ��� ���ε� ������ ó���Ͽ� ���� ������ ������ ����� ����,
		// �������彺����Ʈ��Ʈ�� �¸޼ҵ带 �̿��� ���� ���� �Է��Ѵ�.
		// ���������� ��Ƽ�� �� �� ���� �߰��Ǵ� ����
		// ó�� ���ε������� ó���Ǿ� �ִ� ������ ���� ������, �������彺����Ʈ��Ʈ �������̽��� �� �޼ҵ带 �̿���
		// ���� ���� ������� �� �����͵��� ������Ʈ�ϴ� �������� ���� �߰��ϰ� �ȴ�.

		// Ŀ�ؼ� �������̽��� ��ü �����
		Connection con = null;
		// �������彺����Ʈ��Ʈ �������̽��� ��ü �����
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// PreparedStatement ��ü ���
			pstmt = con.prepareStatement(sql.toString());

			// �Ķ���� �� ����
			// ������ ?(���ε� ����) ���� ������� ��ü�ϴ� ��
			// �ý�����Ʈ�� ó���ϱ� ������ ���� �Է����ش�.
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "����");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);

			// ���� ����
			int i = pstmt.executeUpdate();
			out.println(i + "���� ���� �߰��Ǿ����ϴ�.");

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
