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
 *  ������ ó���� ���� Ŭ������������ �ڷḦ �޾� �����ͺ��̽��� �Է°� ��ȸ�� �����Ѵ�.
 */

public class EmployeeDAO {

	// �ۼ��Ǵ� �޼ҵ���� ���������� preparedStatement()�޼ҵ带 ȣ���Ͽ� ������ ������� �����ͺ��̽��� ������
	// preparedStatement
	// ��ü�� ����

	// �ű� ����� ��� ó��
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {

		// ������ ó���� ���� ������ �ۼ�  ������ ��
		String dml = "insert into employee(no, name, jobGrade,  department,email) "
				+ "values(employee_seq.nextval, ?,?,?,?)";
		Connection con = null;
		PreparedStatement pStatement = null;
		EmployeeVO returnValue = null;

		try {
			// DBUtilŬ������ getConnectiion()�޼ҵ�� �����ͺ��̽��� ����
			con = DBUtil.getConnection(); // ���� ��.

			// �Է¹��� ����� ������ ó���ϱ� ���� ���ӹ� ����
			pStatement = con.prepareStatement(dml);

			// setter�� �̿��� ����־� �ش�. ��ȣ ���� �� �� �����´�. ��ȣ�� �������� ���� �ڵ����� �������� ����
			pStatement.setString(1, evo.getName());
			pStatement.setString(2, evo.getJobGrade());
			pStatement.setInt(3, evo.getDepartment());
			pStatement.setString(4, evo.getEmail());
			
			// sql ������ ���� �� ó�� ����� ����
			int i = pStatement.executeUpdate();
			returnValue = new EmployeeVO();

			// sql������ ���� �� ��������
			returnValue.setStatus(i + " ");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ���� ����Ǿ��� ������Ʈ�� ��� ������
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

	// ��� ��ȣ�� �̸��� �Է¹޾� ��� ������ ��ȸ

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

	// ��� ��ȣ�� �Է¹޾� ������ ��ȸ
	public EmployeeVO getEmployeeNo(int no) throws Exception {

		// ������ ������
		String dml = "select * from employee where no = ?";

		// Ŀ�ؼ�, ������Ʈ��Ʈ, ����, ���� ����
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

	// ����� �̸��� �Է¹޾� ������ ��ȸ
	public EmployeeVO getEmployeeName(String name) throws Exception {

		// ������ ������
		String dml = "select * from employee where name = ?";

		// Ŀ�ؼ�, ������Ʈ��Ʈ, ����, ���� ����
		Connection con = null;
		PreparedStatement psStatement = null;
		ResultSet resultSet = null;
		EmployeeVO returnValue = null;
		try {
			con = DBUtil.getConnection();
			psStatement = con.prepareStatement(dml);
			psStatement.setString(1, name); // ���⿡�� �ϴ� ���� ��ȸ�̱� ������ �ε��� ��ȣ�� ������ �Ϲ��̴�. �ϳ��� ��ȸ�ϰ� �����Ƿ�
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

//��ü ��� ��ȸ
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
			//psStatement.setString(1, name); // ���⿡�� �ϴ� ���� ��ȸ�̱� ������ �ε��� ��ȣ�� ������ �Ϲ��̴�. �ϳ��� ��ȸ�ϰ� �����Ƿ�
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

	//�÷� �̸����� .
	
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
