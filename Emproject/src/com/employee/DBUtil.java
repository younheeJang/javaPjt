package com.employee;
import java.sql.*;
//에스큐엘 연계

public class DBUtil {

	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	static String id = "scott";
	static final String pw = "tiger";
	
	public static Connection getConnection() throws Exception{
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		return con;
	}
}
