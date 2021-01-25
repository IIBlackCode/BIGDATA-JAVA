package Study.JSP_2020_11_10.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/20201110_MyServlet")
public class MyServlet extends HttpServlet {
	
	

	public MyServlet() {
		super();
		System.out.println("/20201110/MyServlet");
	}

	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
		System.out.println(arg0.getMethod());
	}

	@Override
	public void destroy() {}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}

}
