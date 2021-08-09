package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaDataTable {


		public static void main(String[] args) {
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");   
				 PreparedStatement prpstmt = con.prepareStatement("select * from trans");
		            ResultSet rs = prpstmt.executeQuery();
		            ResultSetMetaData rsmd = rs.getMetaData();
		            rsmd.getColumnClassName(1);
		            rsmd.getColumnTypeName(2);
                    System.out.println(rsmd);
		            con.close(); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}

	}


