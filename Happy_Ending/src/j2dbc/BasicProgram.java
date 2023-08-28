package j2dbc;

import java.sql.*;
import java.util.Scanner;

public class BasicProgram {
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/mayank";
	static final String JDBC_USER = "root";
	static final String JDBC_PASSWORD = "root";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			Statement statement = connection.createStatement();
			
			createTable(statement);
			
			boolean exit = false;
			while(!exit) {
				switch(displayMenuAndGetChoice()) {
					case 1:
						insertData(statement);
						break;
					
					case 2:
						updateData(statement);
						break;
					
					case 3:
						deleteData(statement);
						break;
					
					case 4:
						retrieveAllData(statement);
						break;
					
					case 5:
						exit = true;
						System.out.println("Exiting the Program. Goodbye!");
						break;
					
					default:
						System.out.println("Invalid Choice. Please select a valid option.");
				}
			}
			
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Create the "Student" Table
	private static void createTable(Statement statement) throws SQLException {		
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" +
	            "id INT PRIMARY KEY, " +
	            "name VARCHAR(50), " +
	            "age INT, " +
	            "grade VARCHAR(2))";
		statement.executeUpdate(createTableSQL);
	}
	
	// Display menu and get user's choice
	private static int displayMenuAndGetChoice() {
		System.out.println("\nMENU: ");
		System.out.println("1. Insert Data");
		System.out.println("2. Update Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Retrieve All Data");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	private static void insertData(Statement statement) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student details: ");
		System.out.println("ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Grade: ");
		String grade = sc.nextLine();
		
		String insertQuery = "INSERT INTO Student (id, name, age, grade) VALUES ("+id+",'"+name+"', "+age+", '"+grade+"')";
		
		try {
			int rowsAffected = statement.executeUpdate(insertQuery);
			if(rowsAffected > 0) {
				System.out.println("Data inserted successfully.");
			} else {
				System.out.println("Failed to insert data.");
			}
		} catch (SQLException e) {
			System.out.println("Error inserting data: " + e.getMessage());
		}
		
	}

	private static void deleteData(Statement statement) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student ID to delete: ");
		int idToDelete = sc.nextInt();
		
		String deleteQuery = "DELETE FROM Student WHERE id = " + idToDelete;
		
		try {
			int rowsAffected = statement.executeUpdate(deleteQuery);
			if(rowsAffected > 0) {
				System.out.println("Data deleted successfully.");
			} else {
				System.out.println("No matching records found for delete.");
			}
		} catch (SQLException e) {
			System.out.println("Error deleting data: " + e.getMessage());
		}
		
	}

	private static void updateData(Statement statement) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student ID to update: ");
		int idToUpdate = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new Student details: ");
		System.out.println("Name: ");
		String newName = sc.nextLine();
		
		System.out.println("Age: ");
		int newAge = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Grade: ");
		String newGrade = sc.nextLine();
		
		String updateQuery = "UPDATE Student SET name= '"+newName+"', age = "+newAge+", grade = '"+newGrade+"' WHERE id = " + idToUpdate;
		
		try {
			int rowsAffected = statement.executeUpdate(updateQuery);
			if(rowsAffected > 0) {
				System.out.println("Data updated successfully.");
			} else {
				System.out.println("No matching records found for update.");
			}
		} catch (SQLException e) {
			System.out.println("Error updating data: " + e.getMessage());
		}
	}

	private static void retrieveAllData(Statement statement) throws SQLException {
		String selectQuery = "SELECT * FROM Student";
		
		try {
			ResultSet rs = statement.executeQuery(selectQuery);
			System.out.println("\nStudent Data: ");
			while (rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");
				
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
				
			}
		} catch (SQLException e) {
			System.out.println("Error retrieving data: " + e.getMessage());
		}
		
	}
	
}

/*
**Problem Statement: Java JDBC Menu-Driven Database Application**

You have been tasked with creating a menu-driven Java program that interacts with a MySQL database using JDBC. The program should allow users to perform the following operations: insert, update, delete, and retrieve data from a specific table. The table will be created within the Java program itself.

**Requirements:**

1. **Table Creation:**
   Create a table named "Student" with the following columns:
   - `id` (INT, PRIMARY KEY)
   - `name` (VARCHAR)
   - `age` (INT)
   - `grade` (VARCHAR)

2. **Menu-Driven Interface:**
   Implement a menu-driven interface with the following options:
   - **1. Insert Data:** Prompt the user to input values for name, age, and grade. Insert these values into the "Student" table.
   - **2. Update Data:** Prompt the user to input the student's ID whose information needs to be updated. Then, allow the user to update name, age, and grade for that student.
   - **3. Delete Data:** Prompt the user to input the student's ID whose information should be deleted from the table.
   - **4. Retrieve All Data:** Fetch and display all records from the "Student" table.
   - **5. Exit:** Terminate the program.

3. **Database Connection:**
   - Use the `DriverManager` class to establish a connection to the MySQL database.
   - Ensure to provide the appropriate JDBC URL, username, and password for connecting to your MySQL database.

4. **Statement Execution:**
   - Use the `Statement` interface to execute SQL queries for insert, update, and delete operations.
   - Use a `ResultSet` to retrieve and display data for the "Retrieve All Data" option.

5. **Error Handling:**
   - Implement proper error handling for database connection issues, query execution errors, etc. Display meaningful error messages to the user.

**Instructions:**

- Provide clear and concise user prompts and messages to guide the user through the various options.
- Use prepared statements or parameterized queries to prevent SQL injection vulnerabilities.
- Display appropriate success messages after successful data manipulation operations.
- Ensure that the program continues to display the menu after each operation until the user chooses the "Exit" option.

**Note:**
Before running the program, make sure you have the MySQL JDBC driver added to your project's classpath, and you have a MySQL database set up with the appropriate credentials. You will need to modify the JDBC URL, username, and password in the program to match your database configuration.

Remember to test your program thoroughly to ensure that it performs all operations correctly and handles errors gracefully.




*/