package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CarBean;
import com.dao.CarDao;


public class ListAllCars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CarDao carDao = new CarDao();
		ArrayList<CarBean> cars = carDao.listAll();
		for (CarBean carBean : cars) {
			System.out.println("Car: " + carBean.getId());
			System.out.println("Make: " + carBean.getMake());
			System.out.println("Model: " + carBean.getModel());
			System.out.println("Year" + carBean.getYear());
			System.out.println("Price" + carBean.getPrice() + "\n");
		}
		
		req.setAttribute("cars", cars);
		RequestDispatcher rd = req.getRequestDispatcher("ListAllCars.jsp");
		rd.forward(req, res);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
