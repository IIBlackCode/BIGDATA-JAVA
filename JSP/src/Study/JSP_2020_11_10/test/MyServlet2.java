package Study.JSP_2020_11_10.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/20201110_MyServlet2")
public class MyServlet2 extends HttpServlet {
	
	
	
	public MyServlet2() {
		super();
		System.out.println("MyServlet2");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println(userName);
		pw.close();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		userName = config.getInitParameter("userName");
	}
	String userName;
}
