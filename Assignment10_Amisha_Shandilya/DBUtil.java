
import java.sql.*;

public class DBUtil {
	static Connection cn = null;
	
	private DBConnectionUtil() {
		
	}

	static String url="jdbc:mysql://localhost:3306/movie";
	static String username = "root";
	static String pass = "";
	
	public static Connection getConnection() {
		if(cn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				cn = DriverManager.getConnection(url,username,pass);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return cn;
	}
	
	public static void closeConnection(){
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}	
