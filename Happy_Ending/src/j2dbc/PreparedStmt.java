package j2dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmt {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");
			
//			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student(id, name, age, grade) VALUES(?, ?, ?, ?)");
//			
//			pstmt.setInt(1, 420);
//			pstmt.setString(2, "Yashlo");
//			pstmt.setInt(3, 21);
//			pstmt.setString(4, "F");
//			
//			System.out.println(pstmt.executeUpdate() + " records inserted...");
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student");
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("ID\tName\tAge\tGrade\n");
			while(rs.next()) {
//				System.out.println("Id: " + rs.getInt("id") + "\tName: " + rs.getString("name") + "Age: " + rs.getInt("age") + "\tGrade: " + rs.getString("grade"));
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("age") + "\t" + rs.getString("grade"));
			}
			
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
/*

Statement query: "INSERT INTO user(id, name, email) VALUES("+ id +", "+ name +", "+ email +")";

Prepared Statement: "INSERT INTO user(id, name, email) VALUES(?, ?, ?)";

*/