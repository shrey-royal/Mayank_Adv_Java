

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ValidateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println("Email: " + email + "\nPassword: " + password);
		
		if (email.trim().length() <= 0 || password.trim().length() <= 0) {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
//			out.close();
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, res);
			out.println("<br><br><br>Incorrect Credentials...");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/home.html");
			rd.forward(req, res);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
