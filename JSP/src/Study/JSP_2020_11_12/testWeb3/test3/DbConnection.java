package Study.JSP_2020_11_12.testWeb3.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("org.mariadb.jdbc.Driver");
		String dataBaseUrl = "jdbc:mysql://49.50.166.134:3306/CORONA?serverTimezone=UTC";
		String dataBaseId = "root";
		String dataBasePw = "1234";		
		Connection conn = 
//			DriverManager.getConnection("jdbc:oracle:thin:@10.10.14.125:1521:company","scott","1234");
			DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
		return conn;
	}
}
