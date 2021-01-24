package Study.JSP_2020_11_11.testWeb3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
@WebServlet("/20201111/testWeb3/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		/*기존 경로와 달라 추가된 소스*/
		System.out.println("req.getContextPath() : "+request.getContextPath());
		String path = "/PAGE/20201111/testWeb3/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		System.out.println("[20201111_POST 방식 로그인_로그인] :");
		
		String name = request.getParameter("name");
		if(name.equals("admin")) {
			System.out.println("[로그인 성공]");
//			RequestDispatcher rp = request.getRequestDispatcher("Test"); 성공 but, 구분을 위해 변경
			RequestDispatcher rp = request.getRequestDispatcher("/20201111/testWeb3/Test");
			rp.forward(request, response);
		} else {
			System.out.println("[로그인 실패]");
			pw.println("로그인이 실패하였습니다.");
//			RequestDispatcher rp = request.getRequestDispatcher("login.html");
			RequestDispatcher rp = request.getRequestDispatcher(login);
			rp.include(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		/*기존 경로와 달라 추가된 소스*/
		System.out.println("req.getContextPath() : "+request.getContextPath());
		String path = "/PAGE/20201111/testWeb3/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		System.out.println("[20201111_GET 방식 로그인_로그인] :");
		
		String name = request.getParameter("name");
		if(name.equals("admin")) {
			System.out.println("[로그인 성공]");
//			RequestDispatcher rp = request.getRequestDispatcher("Test"); 성공 but, 구분을 위해 변경
			RequestDispatcher rp = request.getRequestDispatcher("/20201111/testWeb3/Test");
			rp.forward(request, response);
		} else {
			System.out.println("[로그인 실패]");
			pw.println("로그인이 실패하였습니다.");
//			RequestDispatcher rp = request.getRequestDispatcher("login.html");
			RequestDispatcher rp = request.getRequestDispatcher(login);
			rp.include(request, response);
		}
	}

}
