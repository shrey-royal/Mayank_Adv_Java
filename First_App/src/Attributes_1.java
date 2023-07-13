import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attr_1")
public class Attributes_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		req.removeAttribute("key_1"); // if removed returns null
		
		out.print("<br>" + req.getAttribute("key_1"));
		out.print("<br>" + req.getAttribute("key_2"));
		out.print("<br>" + req.getAttribute("key_3"));
		out.print("<br>" + req.getAttribute("key_4"));
		out.print("<br>" + req.getAttribute("key_5"));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
