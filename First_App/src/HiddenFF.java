import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenFF")
public class HiddenFF extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String naam = req.getParameter("name");
		
		PrintWriter out = res.getWriter();
		out.print("<form action='HiddenFF2' method='post'>");
		out.print("<input type='text' value="+naam+" disabled>");
		out.print("<input type='hidden' name='naam' value="+naam+"><input type='submit'></form>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
