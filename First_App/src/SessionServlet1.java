

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SessionServlet1() {
        super();
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			String name = req.getParameter("uname");
			out.println("Welcome " + name);
			
			HttpSession session = req.getSession();
			session.setAttribute("uname", name);
			
			out.print("<a href='SessionServlet2'>Visit</a>");
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
