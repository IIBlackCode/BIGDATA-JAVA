// Dao(Data Access Object)
package Study.JSP_2020_11_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dataBaseUrl = "jdbc:mysql://49.50.166.134:3306/CORONA?serverTimezone=UTC";
			String dataBaseId = "root";
			String dataBasePw = "1234";
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.10.14.125:1521:company","scott","1234");
			conn = DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static Login getPoItemByNo(int EmpNo) { 
		Connection conn = getConnection();
		String strSql = "SELECT * FROM PO_EMPLOYEER WHERE EMP_NO = ?";
		Login ib = new Login();
		try {
			PreparedStatement ps = conn.prepareStatement(strSql);
			ps.setInt(1, EmpNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				ib.setName(rs.getString("EMP_NO"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ib;
	
	}
}
