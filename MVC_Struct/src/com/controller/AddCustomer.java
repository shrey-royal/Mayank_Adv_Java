package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;

@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 5415553219998788984L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Retrieving values from the frontend
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("mobile");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");
        String pincode = req.getParameter("pincode");
        
        System.out.println("Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Mobile: " + mobile + "\n" +
                "Gender: " + gender + "\n" +
                "Address: " + address + "\n" +
                "Pincode: " + pincode);
        
        CustomerBean customerBean = new CustomerBean();
        
        
        
        
	}
}