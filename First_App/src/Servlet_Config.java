

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Config extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_Config() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		ServletConfig config = getServletConfig();
		
		System.out.println(config.getInitParameter("name"));
		
		Enumeration<String> init_params = config.getInitParameterNames();
		
		String str = "";
		while(init_params.hasMoreElements()) {
			str = init_params.nextElement();
			
			out.print("<br>Name: " + str);
			out.print(" Value: " + config.getInitParameter(str));
		}
		ServletContext context = getServletContext();
		out.print("<br>Param Value: " + config.getInitParameter("Mayank"));
		out.print("<br>Param Value: " + context.getInitParameter("Mayank"));
		out.print("<br> Servlet Name: " + config.getServletName());
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
