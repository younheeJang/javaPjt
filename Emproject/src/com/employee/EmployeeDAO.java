package com.employee;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.crypto.spec.PSource;

/*
 *  데이터 처리를 위한 클래스로직에서 자료를 받아 데이터베이스에 입력과 조회를 수행한다.
 */

public class EmployeeDAO {

	// 작성되는 메소드들은 공통적으로 preparedStatement()메소드를 호출하여 쿼리를 실행시켜 데이터베이스를 조작할
	// preparedStatement
	// 객체를 얻음

	// 신규 사용자 등록 처리
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {

		// 데이터 처리를 위한 쿼리문 작성  개발자 몫
		String dml = "insert into employee(no, name, jobGrade,  department,email) "
				+ "values(employee_seq.nextval, ?,?,?,?)";
		Connection con = null;
		PreparedStatement pStatement = null;
		EmployeeVO returnValue = null;

		try {
			// DBUtil클래스의 getConnectiion()메소드로 데이터베이스와 연결
			con = DBUtil.getConnection(); // 연결 끝.

			// 입력받은 사용자 정보를 처리하기 위한 쿠러ㅣ문 생성
			pStatement = con.prepareStatement(dml);

			// setter를 이용해 집어넣어 준다. 번호 빼고 네 개 가져온다. 번호는 시퀀스를 통해 자동으로 가져오기 때문
			pStatement.setString(1, evo.getName());
			pStatement.setString(2, evo.getJobGrade());
			pStatement.setInt(3, evo.getDepartment());
			pStatement.setString(4, evo.getEmail());
			
			// sql 쿼리문 수행 후 처리 결과를 얻어옴
			int i = pStatement.executeUpdate();
			returnValue = new EmployeeVO();

			// sql쿼리문 수행 후 수행결과를
			returnValue.setStatus(i + " ");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 디비와 연결되었던 오브젝트를 모두 해제함
				if (pStatement != null)
					pStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return returnValue;
	}

	// 사원 번호와 이름을 입력받아 사원 정보를 조회

	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {
		String dml = "select * from employee where no = ? and name = ?";
		Connection con = null;
		PreparedStatement psStatement = null;
		ResultSet resultSet = null;
		EmployeeVO returnValue = null;

		try {
			con = DBUtil.getConnection();
			psStatement = con.prepareStatement(dml);
			psStatement.setInt(1, no);
			psStatement.setString(2, name);
			resultSet = psStatement.executeQuery();
			if (resultSet.next()) {
				returnValue = new EmployeeVO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getInt(4), resultSet.getString(5));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (psStatement != null)
					psStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return returnValue;
	}

	// 사원 번호를 입력받아 정보를 조회
	public EmployeeVO getEmployeeNo(int no) throws Exception {

		// 쿼리문 날리고
		String dml = "select * from employee where no = ?";

		// 커넥션, 스테이트먼트, 지정, 리턴 벨류
		Connection con = null;
		PreparedStatement psStatement = null;
		ResultSet resultSet = null;
		EmployeeVO returnValue = null;
		try {
			con = DBUtil.getConnection();
			psStatement = con.prepareStatement(dml);
			psStatement.setInt(1, no);
			resultSet = psStatement.executeQuery();
			if (resultSet.next()) {
				returnValue = new EmployeeVO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getInt(4),  resultSet.getString(5));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (psStatement != null)
					psStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return returnValue;
	}

	// 사원의 이름을 입력받아 정보를 조회
	public EmployeeVO getEmployeeName(String name) throws Exception {

		// 쿼리문 날리고
		String dml = "select * from employee where name = ?";

		// 커넥션, 스테이트먼트, 지정, 리턴 벨류
		Connection con = null;
		PreparedStatement psStatement = null;
		ResultSet resultSet = null;
		EmployeeVO returnValue = null;
		try {
			con = DBUtil.getConnection();
			psStatement = con.prepareStatement(dml);
			psStatement.setString(1, name); // 여기에서 하는 정보 조회이기 때문에 인덱스 번호는 무조건 일번이다. 하나만 조회하고 있으므로
			resultSet = psStatement.executeQuery();
			if (resultSet.next()) {
				returnValue = new EmployeeVO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getInt(4), resultSet.getString(5)) ;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (psStatement != null)
					psStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return returnValue;
	}

//전체 사원 조회
	public ArrayList<EmployeeVO> getEmployeetotal(){
		ArrayList<EmployeeVO> arrayList = new ArrayList<EmployeeVO>();
		String dml = "select * from employee";
		
		Connection con = null;
		PreparedStatement psStatement = null;
		ResultSet resultSet = null;
		EmployeeVO returnValue = null;

		try {
			con = DBUtil.getConnection();
			psStatement = con.prepareStatement(dml);
			//psStatement.setString(1, name); // 여기에서 하는 정보 조회이기 때문에 인덱스 번호는 무조건 일번이다. 하나만 조회하고 있으므로
			resultSet = psStatement.executeQuery();

			while (resultSet.next()) {
				returnValue = new EmployeeVO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
			
						resultSet.getInt(4), resultSet.getString(5) );
				arrayList.add(returnValue);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (psStatement != null)
					psStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return arrayList;
		
	}

	//컬럼 이름으로 .
	
		public ArrayList<String> getColumnName() {
				ArrayList<String> ColumnName = new ArrayList<String>();
				String sql = "select * from employee";

				Connection con = null;
				PreparedStatement psStatement = null;
				ResultSet resultSet = null;
				ResultSetMetaData rsmd = null;
				
				try {
					con = DBUtil.getConnection();
					psStatement = con.prepareStatement(sql);
					resultSet = psStatement.executeQuery();
					rsmd = resultSet.getMetaData();

					int cols = rsmd.getColumnCount();
					for(int i = 1; i<=cols; i++) {
						ColumnName.add(rsmd.getColumnName(i));
					}
				} catch (SQLException se) {
					se.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (resultSet != null)
							resultSet.close();
						if (psStatement != null)
							psStatement.close();
						if (con != null)
							con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return ColumnName;
			}
}
