package LoginC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	public static Statement giveStatement() {
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			 statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return statement;

	}
	
	/*public static Statement  giveStatement() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement statement=null;
		return statement;	
	}*/
	
}
