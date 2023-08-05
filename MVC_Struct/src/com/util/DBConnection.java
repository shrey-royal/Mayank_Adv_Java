package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/oss";
		String userName = "root";
		String password = "root";
		
		try {
			//load driver
			Class.forName(driver);
			
			//jdbc api open connection
			conn = DriverManager.getConnection(url, userName, password);
			
			if (conn == null) {
				System.out.println("DB Not Connected...");
			} else {
				System.out.println("DB is Connected...");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void disconnect(Connection conn) {
		try {
			if(conn != null || !conn.isClosed()) {
				conn.close();
				System.out.println("DB Connection closed successfully...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		
		Connection conn = DBConnection.getConnection();
		
		System.out.println(conn);
		DBConnection.disconnect(conn);
	}
	
	
}
