package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.CustomerBean;
import com.util.DBConnection;

public class CustomerDao {	//DAO - Data Access Objects
	
	private Connection conn = null;
	
	public void insertCustomer(CustomerBean customerBean) {
		try {
			String insertQuery = "INSERT INTO tblcustomer(address,email,gender,name,password,phone,pin_code) VALUES(?, ?, ?, ?, ?, ?, ?)";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			
			pstmt.setString(1, customerBean.getAddress());
			pstmt.setString(2, customerBean.getEmail());
			pstmt.setString(3, customerBean.getGender());
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
