package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			pstmt.setString(4, customerBean.getName());
			pstmt.setString(5, customerBean.getPassword());
			pstmt.setString(6, customerBean.getMobile());
			pstmt.setString(7, customerBean.getPincode());
			
			int i = pstmt.executeUpdate();
			if(i > 0) {
				System.out.println("Data Inserted Successfully");
			} else {
				System.out.println("Failed to Insert Data");
			}
			DBConnection.disconnect(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<CustomerBean> getCustomers() {
		try {
			String listQuery = "SELECT * FROM tblcustomer";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(listQuery);
			ResultSet rs = pstmt.executeQuery();
			
			ArrayList<CustomerBean> customers = new ArrayList<CustomerBean>();
			while(rs.next()) {
				CustomerBean c = new CustomerBean();
				c.setId(rs.getInt("id"));
				c.setAddress(rs.getString("address"));
				c.setAdded_date(rs.getString("added_date"));
				c.setEmail(rs.getString("email"));
				c.setGender(rs.getString("gender"));
				c.setName(rs.getString("name"));
				c.setPassword(rs.getString("password"));
				c.setMobile(rs.getString("phone"));
				c.setPincode(rs.getString("pin_code"));
				customers.add(c);
			}
			DBConnection.disconnect(conn);
			return customers;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
