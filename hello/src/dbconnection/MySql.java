package dbconnection;
import java.sql.*;

public class MySql {
	public static void main(String args[])
	{  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");   
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from trans");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
}