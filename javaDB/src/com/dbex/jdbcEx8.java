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

			// 하나의 논리 작업단위 시작
			con = ConnUtil.getConnection();
			// 오토 커미트 기능 비활성화 시키기
			con.setAutoCommit(false);
			// 1번 작업 시작
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 300);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();

			// 1번 작업 종료

			pstmt = con.prepareStatement(sql2.toString());

			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();

			// 2번 작업 종료

			// 쿼리가 정상적으로 실행된 경우에 데이터베이스에 반영됨

			con.commit();
			System.out.println("데이터베이스에 정상적으로 반영되었습니다.");

		} catch (SQLException se) {
			try {
				con.rollback();
				System.out.println("데이터베이스에 반영된 작업이 취소되었습니다.");
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
