package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CarBean;
import com.dao.CarDao;

public class UpdateCarDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String make = req.getParameter("make");
		String model = req.getParameter("model");
		int year = Integer.parseInt(req.getParameter("year"));
		double price = Double.parseDouble(req.getParameter("price"));
		
		System.out.println("Updated Car Details: ");
		System.out.println("Id: " + id + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nPrice: " + price);
		
		CarBean carBean = new CarBean();
		carBean.setId(id);
		carBean.setMake(make);
		carBean.setModel(model);
		carBean.setYear(year);
		carBean.setPrice(price);
		
		CarDao carDao = new CarDao();
		
		carDao.updateCar(carBean);
	
		RequestDispatcher rd = req.getRequestDispatcher("listall");
		rd.forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
