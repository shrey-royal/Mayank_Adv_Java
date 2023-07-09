import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic_Servlet extends GenericServlet {
//	private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = -2764225725690782847L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>My First Page</title></head>");
		out.println("<body><center><h2>This is my first web page using Generic servlet</h2></center>"
				+ "<br>"
				+ "<b>Life cycle of Servlet:</b>"
				+ "<br>"
				+ "1. Servlet class is loaded."
				+ "<br>"
				+ "2. Servlet instance is created."
				+ "<br>"
				+ "3. init method is invoked."
				+ "<br>"
				+ "4. service method is invoked."
				+ "<br>"
				+ "5. destroy method is invoked."
				+ "<br>"
				+ "</body>");
		out.println("</html>");
	}
}
