package dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableClass {
	public static void main(String[] args) throws Exception{  
		  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");
		  
		CallableStatement stmt=(CallableStatement) con.prepareCall("{call Insertautoincrements(?)}");  
	
		stmt.setString(1,"Karthik");    
		stmt.execute();  
		  
		System.out.println("success");  
		          
		}  
}
