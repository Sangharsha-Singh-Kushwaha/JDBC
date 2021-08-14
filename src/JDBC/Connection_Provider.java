package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Provider {
	
	 static Connection connection;
		
		public static Connection creatC() {
			
			// load driver
					try {
						Class.forName("com.mysql.jdbc.Driver");
						
						//create the connection 
						String url="jdbc:mysql://localhost:3307/student_manage?autoReconnect=true&useSSL=false";
						String user="root";
						String password="123";
						connection=DriverManager.getConnection(url, user, password);
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return connection;
						
		}

}
