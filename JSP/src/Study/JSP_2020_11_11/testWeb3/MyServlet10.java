package Study.JSP_2020_11_11.testWeb3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 web.xml에 서블릿 등록시 @WebServlet에서 등록하면 중복된다.
 서블릿 3.0부터 web.xml에 따로 등록하지 않아도 된다.
 */
//@WebServlet("/MyServlet10")
public class MyServlet10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>MyServlet10</h1>");
		pw.println("안녕하세요. 반가워요.");
		pw.close();
	}

}
