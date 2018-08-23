package com.dbex;

import java.sql.*;

public class ConnUtil {

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");	
	}

}
