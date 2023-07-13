import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attr")
public class Attributes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("key_1", "value_1");
		req.setAttribute("key_2", "value_2");
		req.setAttribute("key_3", "value_3");
		req.setAttribute("key_4", "value_4");
		req.setAttribute("key_5", "value_5");
		
		RequestDispatcher rd = req.getRequestDispatcher("attr_1");
		rd.forward(req, res);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
