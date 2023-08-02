package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static final String DB_PROPERTIES_PATH = "/resources/db.properties";
	
	public static Connection getConnection() throws SQLException {
		try {
			Properties properties = new Properties();
			properties.load(DBConnection.class.getResourceAsStream(DB_PROPERTIES_PATH));
			
			String url = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");
			
			return DriverManager.getConnection(url, username, password);			
		} catch (Exception e) {
			throw new SQLException("Error establishing database Connection.", e);
//			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}