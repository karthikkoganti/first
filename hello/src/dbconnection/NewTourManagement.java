package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class NewTourManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tour_travel_management","root","Karthik143@");   
			Statement stmt=con.createStatement(); 
//			String sql="insert into category values(5,'SeaSide Tour')";
//			stmt.execute(sql);
			String sql1="insert into category values(6,'HillSide Tour')";
			stmt.execute(sql1);
			String sql2="insert into category values(7,'Destination Wedding Tour')";
			stmt.execute(sql2);
			String sql3="insert into category values(8,'Sports Tour')";
			stmt.execute(sql3);
			String sql4="insert into category values(9,'Adventurous Tour')";
			stmt.execute(sql4);
			String sql5="insert into category values(10,'Heritage Tour')";
			stmt.execute(sql5);

	}
		catch(Exception e)
			{
				System.out.println(e);
			} 
			
		}

}

