package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBSdemo2 {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/databasename";

	static final String username = "username";
	static final String password = "password";
	
	
	
	public static void main(String[] args) {
	
		Statement stmt = null;
		
		Class.forName(JDBC_DRIVER);
//		step 1 connection to DB
		Connection conn = DriverManager.getConnection(DB_URL,username,password);
		
//		step 2 creating a prepared statement 
		String sqlStatement = "INSERT INTO shippers VALUES (?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sqlStatement);
		
//		step 3 setting up the values
		pstmt.setString(1, "Shady");
		
		
//		inserting blob type
		InputSteam in = new FileInputSteam("D:\\VM\\training\\JDBSdemo");
		pstmt.setBlob(2, in);
		
//		step 4 execution
		pstmt.execute();
		
		
		
}
}