package Study.JSP_2020_11_11.testWeb3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/MyFilter")
//@WebFilter("/20201111/testWeb3/MyFilter")
public class MyFilter implements Filter {

    public MyFilter() {}
	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>MyFilter</h1>");
		pw.println("doFilter<br>");
		pw.println("Web.xml에 등록된 MyFilter<br>");
		pw.println("Filter에 MyServlet10경로에 등록되었기 때문에 MyServlet10경로로 접근시 필터를 거친다.");
		pw.println("<hr>");
		chain.doFilter(request, response);
		pw.close();
	}	
	public void init(FilterConfig fConfig) throws ServletException {}

}
