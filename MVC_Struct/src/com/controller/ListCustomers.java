package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;
import com.dao.CustomerDao;

@WebServlet("/list")
public class ListCustomers extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerDao cdao = new CustomerDao();
		ArrayList<CustomerBean> cbean = cdao.getCustomers();
		req.setAttribute("customers", cbean);
		RequestDispatcher rd = req.getRequestDispatcher("ListCustomer.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
