package Study.JSP_2020_11_09.test3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/20201109_Second")
public class Second extends HttpServlet {
	public void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException {		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<html><body>Hello Servlet</body></html>");
		pw.close();
		
	}
}
