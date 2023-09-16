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
			pstmt.setDouble(4, car.getPrice());
			
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
				car.setPrice(rs.getDouble("price"));
				cars.add(car);
			}
			conn.close();
			return cars;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public CarBean getCarById(int id) {
		try {
			String selectQuery = "SELECT * FROM car WHERE id = ?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				CarBean car = new CarBean();
				car.setId(rs.getInt("id"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));
				car.setYear(rs.getInt("year"));
				car.setPrice(rs.getDouble("price"));
				return car;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void deleteCar(int id) {
		try {
			
			String deleteQuery = "DELETE FROM car WHERE id = ?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, id);
			
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Car Deleted Successfully");
			} else {
				System.out.println("Failed to delete car");
			}
			pstmt.close();
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateCar(CarBean carBean) {
		try {
			String updateQuery = "UPDATE car SET make=?, model=?, year=?, price=? WHERE id=?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, carBean.getMake());
			pstmt.setString(2, carBean.getModel());
			pstmt.setInt(3, carBean.getYear());
			pstmt.setDouble(4, carBean.getPrice());
			pstmt.setInt(5, carBean.getId());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("Car Details Updated Successfully!");
			} else {
				System.out.println("Failed to Update Car Details!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
