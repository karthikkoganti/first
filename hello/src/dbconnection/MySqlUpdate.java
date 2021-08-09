package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlUpdate {
	public static void main(String args[])
	{  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");   
			Statement st = con.createStatement();
			
			int noOfRowsAffected=st.executeUpdate("Update trans set type='PRIJEM' where trans_id=3750");
			System.out.println(noOfRowsAffected);	
					
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}

}
