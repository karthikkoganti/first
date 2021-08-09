package dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.*;
public class BatchClassPrepareStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");   
			
			String sql = "INSERT INTO tbl_country (countryid,countrycode, countryname) VALUES (?, ?, ?)";
	            PreparedStatement statement = con.prepareStatement(sql);
	          
	            String[] data = split(",");
	            String countryid = data[0];
                String countrycode = data[1];
                String countryname = data[2];
                
                statement.setString(4,countryid );
                statement.setString(5,countrycode );
                statement.setString(6, countryname);
    
                statement.addBatch();
                con.close();
                

}
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
	}
}
