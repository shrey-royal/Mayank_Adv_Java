

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form_Attrs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		String age = req.getParameter("age");
//		String slider = req.getParameter("slider");
//		String date = req.getParameter("date");
//		String time = req.getParameter("time");
		
//		System.out.println("Name: " + name);
//		System.out.println("Email: " + email);
//		System.out.println("Age: " + age);
//		System.out.println("Slider: " + slider);
//		System.out.println("Date: " + date);
//		System.out.println("Time: " + time);
		
		Enumeration<String> obj = req.getParameterNames();
		while (obj.hasMoreElements()) {
			String param = obj.nextElement();
			System.out.println(param + ": " + req.getParameter(param));
		}
		
		PrintWriter out = res.getWriter();
		out.print("<a href='URL_ReWrite?uname="+req.getParameter("name")+"'>Visit</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
