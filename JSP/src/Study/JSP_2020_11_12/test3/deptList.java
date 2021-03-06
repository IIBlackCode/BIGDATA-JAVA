package Study.JSP_2020_11_12.test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/20201112deptList")
public class deptList extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SELECT * FROM dept ORDER BY dept_id DESC");
		try {
			Connection conn = DbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM dept ORDER BY dept_id DESC");
			ResultSet rs = ps.executeQuery();
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			pw.println("<a href='deptAdd.html'>추가</a>");
			pw.println("<html><body>");
			pw.println("<table border=1>");		
			while(rs.next()) {
				pw.println("<tr>");
				pw.println("<td>" + rs.getInt("DEPT_ID") + "</td>");
				pw.println("<td><a href='20201112deptView?DEPT_ID=" 
						+ rs.getInt("DEPT_ID") + "'>" 
						+ rs.getString("DEPT_NAME") + "</a></td>");
				pw.println("<td>" + rs.getInt("LOC_ID") + "</td>");
				pw.println("</tr>");
			}
			rs.close();
			pw.println("</table>");		
			pw.println("</body></html>");
			pw.close();
			conn.close();
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				System.out.println(e);
			}
	
	}
}
