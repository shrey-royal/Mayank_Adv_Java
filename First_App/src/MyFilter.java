import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	FilterConfig config;
	
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		
		String s = config.getInitParameter("not_ready");

		if(s.equals("yes")) {
			out.print("This page is Under Construction");
		} else {
			chain.doFilter(req, res);
		}
	}
	
	public void destroy() {}
}
