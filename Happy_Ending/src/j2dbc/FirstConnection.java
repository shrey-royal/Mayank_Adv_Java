package j2dbc;

import java.sql.*;

public class FirstConnection {
	public static void main(String[] args) {
		try {
			//Register Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Get Conenction
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");
			
			//Create Statement
			Statement stmt = conn.createStatement();
			
			//Execute Query
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
			
			//Close Connection
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*

Create table employee(id int(10), name varchar(40), age int(3));

*/