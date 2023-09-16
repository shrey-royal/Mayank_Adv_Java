package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CarBean;
import com.dao.CarDao;

public class DeleteCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		CarBean carBean = new CarBean();
		CarDao carDao = new CarDao();
		
		carBean = carDao.getCarById(id);
		
		System.out.println("Following are the car details that will be deleted: ");
		System.out.println("Make: " + carBean.getMake() + "\nModel: " + carBean.getModel() + "\nYear: " + carBean.getYear() + "\nPrice: " + carBean.getPrice());
		
		
		carDao.deleteCar(id);
		
		RequestDispatcher rd = req.getRequestDispatcher("listall");
		rd.forward(req, res);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
