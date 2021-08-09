package dbconnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchedClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learning","root","Karthik143@");   
			PreparedStatement pstmt=con.prepareStatement("insert into tbl_country values(?,?,?)");  
			  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			while(true){  
			  
			System.out.println("enter countryid");  
			String s=br.readLine();  
			int countryid=Integer.parseInt(s);  
			  
			System.out.println("enter countrycode");  
			String countrycode=br.readLine();  
			  
			System.out.println("enter countryname");  
			String countryname=br.readLine();  
			  
			pstmt.setInt(1,countryid);  
			pstmt.setString(2,countrycode);  
			pstmt.setString(3,countryname);  
			  
			pstmt.addBatch(); 
			
		  
			pstmt.executeBatch();  
			  
			System.out.println("New records added successfully");  
			  
			con.close();  
			}
		}
			catch(Exception e)
		{
				System.out.println(e);
				}  
		}
			  
			} 