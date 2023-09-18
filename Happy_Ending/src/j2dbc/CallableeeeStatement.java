package j2dbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableeeeStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");
			
			CallableStatement stmt = conn.prepareCall("{call insertemployee(0,?,?)}");
			stmt.setString(1, "Mayankbhai");
			stmt.setInt(2, 23);
			
			stmt.execute();
			
			System.out.println("Success");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
