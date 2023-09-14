package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.CarBean;
import com.util.DBConnection;

public class CarDao {
	private Connection conn = null;
	
	public void insertCar(CarBean car) {
		try {
			String insertQuery = "INSERT INTO car(id, make, model, year, price) VALUES(0,?,?,?,?)";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, car.getMake());
			pstmt.setString(2, car.getModel());
			pstmt.setInt(3, car.getYear());
			pstmt.setFloat(4, car.getPrice());
			
			if (pstmt.executeUpdate() == 1) {
				System.out.println("New Car Added Successfully!");
			} else {
				System.out.println("Failed to Add Car!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<CarBean> listAll() {
		try {
			String listQuery = "SELECT * FROM car";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(listQuery);
			ResultSet rs = pstmt.executeQuery();
			
			ArrayList<CarBean> cars = new ArrayList<CarBean>();
			while(rs.next()) {
				CarBean car = new CarBean();
				car.setId(rs.getInt("id"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));
				car.setYear(rs.getInt("year"));
				car.setPrice(rs.getFloat("price"));
				cars.add(car);
			}
			return cars;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
