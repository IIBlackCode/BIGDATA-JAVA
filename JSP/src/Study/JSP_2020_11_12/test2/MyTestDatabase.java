package Study.JSP_2020_11_12.test2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/20201112MyTestDatabase")
public class MyTestDatabase extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String mariaDB = "org.mariadb.jdbc.Driver";
			
			String dataBaseUrl = "jdbc:mysql://49.50.166.134:3306/CORONA?serverTimezone=UTC";
			String dataBaseId = "root";
			String dataBasePw = "1234";
			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.10.14.125:1521:company", "scott","1234");
			Class.forName(mariaDB);
			Connection conn = DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
			// SELECT * FROM dept;
//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM dept");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM member");
			ResultSet rs = ps.executeQuery();
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();
			pw.println("<html><body>");
			while (rs.next()) {
				//pw.println(rs.getInt("DEPT_ID") + ",");
				//pw.println(rs.getString("DEPT_NAME") + ",");
				//pw.println(rs.getInt("LOC_ID") + "<br>");
				pw.println(rs.getString("MEMBER_ID") + ",");
				pw.println(rs.getString("MEMBER_PASSWORD") + ",");
				pw.println(rs.getString("MEMBER_NAME") + ",");
				pw.println(rs.getString("MEMBER_ADRESS") + ",");
				pw.println(rs.getString("MEMBER_RANK") + ",");
				pw.println(rs.getString("MEMBER_PHONE") + ",");
				pw.println(rs.getString("MEMBER_SELFRESULT") + ",");
				pw.println(rs.getString("MEMBER_JOINDATE") + ",");
				pw.println(rs.getString("DELETE_YN") + ",");
				pw.println(rs.getString("ip") + "<br>");
			}
			rs.close();
			pw.println("</body></html>");
			pw.close();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			System.out.println(e);
		}
	}
}
