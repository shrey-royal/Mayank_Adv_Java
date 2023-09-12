package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mayank";
		String user = "root";
		String pass = "root";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, pass);
			
			if(conn == null) {
				System.out.println("Database Failed to connect...");
			} else {
				System.out.println("Database connected successfully...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
//	public static void main(String[] args) {
//		DBConnection.getConnection();
//	}
}
