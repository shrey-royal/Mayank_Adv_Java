import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/upload")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		String filePath = "C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Mayank_Adv_Java\\First_App\\WebContent\\uploads";
		
		int maxFileSize = 1024 * 50000;	//50 MBs
		
		@SuppressWarnings("unused")
		MultipartRequest m = new MultipartRequest(req, filePath, maxFileSize);
		
		res.getWriter().print("File Uploaded Successfully!! \n");
	}
}
