package Study.JSP_2020_11_12.testWeb3.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
@WebServlet("/20201112Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		/*기존 경로와 달라 추가된 소스*/
		System.out.println("req.getContextPath() : "+request.getContextPath());
		String path = "/PAGE/20201112/testWeb3/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		String name = request.getParameter("name");
		if(name.equals("admin")) {
			RequestDispatcher rp = request.getRequestDispatcher("Test");
			rp.forward(request, response);
		} else {
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
		String path = "/PAGE/20201112/testWeb3/";
		String link = path +"link.html";
		String login = path +"login.html";
		
		String name = request.getParameter("name");
		if(name.equals("admin")) {
			RequestDispatcher rp = request.getRequestDispatcher("Test");
			rp.forward(request, response);
		} else {
			pw.println("로그인이 실패하였습니다.");
//			RequestDispatcher rp = request.getRequestDispatcher("login.html");
			RequestDispatcher rp = request.getRequestDispatcher(login);
			rp.include(request, response);
		}
	}

}
