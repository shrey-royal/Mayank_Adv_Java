import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download")
public class DownloadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String fileName = "andreas-gucklhorn-mawU2PoJWfU-unsplash.jpg";
		String filePath = "C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Mayank_Adv_Java\\First_App\\WebContent\\uploads\\";
		
		res.setContentType("APPLICATION/OCTET-STREAM");
		res.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		FileInputStream fis = new FileInputStream(filePath + fileName);
		
		int i;
		while((i = fis.read()) != -1) {
			out.write(i);
		}
		
		fis.close();
		out.close();		
	}
}
