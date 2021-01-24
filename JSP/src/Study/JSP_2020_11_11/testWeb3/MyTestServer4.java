package Study.JSP_2020_11_11.testWeb3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyTestServer4")
@WebServlet("/20201111/testWeb3/MyTestServer4")
public class MyTestServer4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		//폰트가 깨져 utf-8로 세팅
		//response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		
		//web.xml에 등록된 context-param 호출
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1>MyTestServer4</h1>");
		pw.println("<p>web.xml에 등록된 <context-param>의 name값을 불러온다.</p>");
		pw.println("<p>web.xml에 등록된 context-param의 name : "+name+"</p>");
		
		String str = "";
		Enumeration<String> names = context.getInitParameterNames();
		while(names.hasMoreElements()) {
			str = names.nextElement();
			pw.println(context.getInitParameter(str));
		}
		pw.close();			
	}
}





