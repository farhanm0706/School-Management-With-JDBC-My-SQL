package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	

	public static Connection getConnection() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","root");
			if(con!=null) {
				return con;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
