

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Context extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_Context() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		ServletContext context = getServletContext();
//		ServletConfig config = getServletConfig();
		
		out.print("Param Value: " + context.getInitParameter("Mayank"));
//		out.print("Param Value: " + config.getInitParameter("Mayank"));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
