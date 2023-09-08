package j2dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMD {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student");
			ResultSet rs = pstmt.executeQuery();
			
			//getting meta info
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Total Columns: " + rsmd.getColumnCount());
			System.out.println("Column Name of 2nd column: " + rsmd.getColumnName(2));
			System.out.println("Column Type Name of 2nd column: " + rsmd.getColumnTypeName(2));
			System.out.println("Table Name: " + rsmd.getTableName(3));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*


Methods of ResultSetMetaData: 

1. public int getColumnCount()
2. public String getColumnName(int index)
3. public String getColumnTypeName(int index)
4. public String getTableName(int index)

*/