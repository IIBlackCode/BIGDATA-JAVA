package Study.JSP_2020_11_10.mycompany;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/20201110_LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		
		/*기존 경로와 달라 추가된 소스*/
		System.out.println("req.getContextPath() : "+req.getContextPath());
		String path = "/PAGE/20201110/testWeb2/work02/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		System.out.println("[20201110_로그인] :");
		
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		if(password.equals("1234") && name.equals("admin")) {
			pw.println("로그인 하셨습니다. 감사합니다.");
			Cookie ck = new Cookie("name", name);
			resp.addCookie(ck);			
		} else {
			pw.println("로그인 정보를 다시 확인해주세요.");
//			req.getRequestDispatcher("login.html").include(req, resp);
			req.getRequestDispatcher(login).include(req, resp);
		}
		pw.close();
	}

}
