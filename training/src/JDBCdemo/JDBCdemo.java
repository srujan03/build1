package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; 
	static final String DB_URL = "jdbc:mysql://localhost/databasename";

	//	DB credentials : 
	//	step 1
	static final String username = "username";
	static final String password = "password";
	
	
	
	public static void main(String[] args) {
	
		Statement stmt = null;
		
//		step 2 - registering the JDBC Driver
		Class.forName(JDBC_DRIVER);
		
//		step 3 - open a connection
		Connection conn = DriverManager.getConnection(DB_URL,username,password);
	
//		Autocommit = false
		conn.setAutoCommit(false);
		
//		step 4 - Create a statement
		stmt = conn.createStatement();
		String sql = "SELECT * FROM shippers";
		ResultSet rs = stmt.executeQuery(sql);		
				
		while(rs.next()) {
			int ID = rs.getInt("id");
			String name = rs.getString("name");
			String country = rs.getString("country");	
		
			}
//		To update 
		String sqlUpdate = "UPDATE shippers SET country = 'INDIA' WHERE shipperID = 4";
		rs = stmt.executeQuery(sqlUpdate);
		
//		Checking for errors if any
		conn.commit();
		
		
//		if there are any errors then we rollback the changes made
//		conn.rollback();
		
		
//		closing / cleanUp
		rs.close();
		stmt.close();
		
	}
}