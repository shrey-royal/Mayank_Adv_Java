import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class Servlet_API implements Servlet {
	
	ServletConfig config = null;
	
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is Initialized");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>My First Page</title></head>");
		out.println("<body><center><h2>This is my first web page using servlet</h2></center></body>");
		out.println("</html>");
	}
	
	public void destroy() {
		System.out.println("Servlet is Destroyed");	
	}
	
	public ServletConfig getServletConfig() { return config; }
	
	public String getServletInfo() { return "copyright 2000-2023"; }

}