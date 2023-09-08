package j2dbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DBMetaData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank", "root", "root");
			
			DatabaseMetaData dbmd = conn.getMetaData();
			
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			
			System.out.println("User Name: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*

Database meta data:


Methods:

public String getDriverName()throws SQLException: it returns the name of the JDBC driver.
public String getDriverVersion()throws SQLException: it returns the version number of the JDBC driver.
public String getUserName()throws SQLException: it returns the username of the database.
public String getDatabaseProductName()throws SQLException: it returns the product name of the database.
public String getDatabaseProductVersion()throws SQLException: it returns the product version of the database.
public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types)throws SQLException: it returns the description of the tables of the specified catalog. The table type can be TABLE, VIEW, ALIAS, SYSTEM TABLE, SYNONYM etc.



*/