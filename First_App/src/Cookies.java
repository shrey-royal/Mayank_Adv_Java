

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cookies() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	
    	String name = req.getParameter("userName");
    	out.println("Welcome " + name);
    	
    	Cookie ck = new Cookie("user", name);
    	res.addCookie(ck);
    	
    	//creating submit button
    	out.println("<form action='CookiesNext'>");
    	out.println("<input type='submit' value='Go Next'></form>");
    	out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
