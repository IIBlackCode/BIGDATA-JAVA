package Study.JSP_2020_11_11.testWeb2.mycompany;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/work02/LogoutServlet")
@WebServlet("/20201111/work02/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String path = "/PAGE/20201111/testWeb2/work02/";
		String link = path +"link.html";
		
		System.out.println("[20201111_로그아웃] :");
		
//		request.getRequestDispatcher("link.html").include(request, response);
		request.getRequestDispatcher(link).include(request, response);
		
//		Cookie ck = new Cookie("name","");
//		ck.setMaxAge(0);
//		response.addCookie(ck);
		HttpSession session = request.getSession();
		session.invalidate();
		pw.println("당신은 로그아웃하였습니다.");
		pw.close();
	}

}
