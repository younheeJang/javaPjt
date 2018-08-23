package com.dbex;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx5 {

	public static void main(String[] args) {
		// preparedStatement 인터페이스를 사용
		// ? (바인딩변수로 처리함) 는 디비에서 sql 실행시에 실제값으로 대체됨
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?, ?, ?, ?, ?, sysdate, ?, ?)"); // 인터넷 게시판에 글을 올릴 때, 자동으로 지정되는
		// 오늘의 날짜말고 나머지들은 사용자가 입력하기 나름일 것이다.
		// 따라서 날짜를 뺸 나머지를 모두 바인딩 변수로 처리하여 행의 데이터 공간을 만들어 놓고,
		// 프리페어드스테이트먼트의 셋메소드를 이용해 직접 값을 입력한다.
		// 최종적으로 인티저 행 을 통해 추가되는 값은
		// 처음 바인딩변수로 처리되어 있던 데이터 저장 공간에, 프리페어드스테이트먼트 인터페이스의 셋 메소드를 이요해
		// 값을 직접 집어넣은 그 데이터들을 업데이트하는 형식으로 행을 추가하게 된다.

		// 커넥션 인터페이스의 개체 만들기
		Connection con = null;
		// 프리페어드스테이트먼트 인터페이스의 개체 만들기
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// PreparedStatement 객체 얻기
			pstmt = con.prepareStatement(sql.toString());

			// 파라미터 값 세팅
			// 쿼리의 ?(바인딩 변수) 실제 디비값으로 대체하는 값
			// 시스데이트로 처리하기 때문에 빼고 입력해준다.
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전임");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);

			// 쿼리 실행
			int i = pstmt.executeUpdate();
			out.println(i + "개의 행이 추가되었습니다.");

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
