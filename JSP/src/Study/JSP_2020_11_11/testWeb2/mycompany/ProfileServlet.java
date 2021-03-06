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

@WebServlet("/20201111/work02/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		String path = "/PAGE/20201111/testWeb2/work02/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		System.out.println("[20201111_사용자 정보 조회] :");
		
		System.out.println(link);
//		request.getRequestDispatcher("link.html").include(request, response);
		request.getRequestDispatcher(link).include(request, response);
		
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			String name = (String)session.getAttribute("name");
			pw.print("<b>당신의 정보 : </b>");
			pw.print(name);
		} else {
			pw.println("다시 로그인 해주세요.");
			System.out.println(login);
//			request.getRequestDispatcher("login.html").include(request, response);
			request.getRequestDispatcher(login).include(request, response);
		}
		
//		Cookie[] cks = request.getCookies();
//		if(cks != null) {
//			String name = cks[0].getValue();
//			pw.print("<b>당신의 정보 : </b>");
//			pw.print(name);
//		} else {
//			pw.println("다시 로그인 해주세요.");
//			request.getRequestDispatcher("login.html").include(request, response);
//		}
		pw.close();
	
	}

}
