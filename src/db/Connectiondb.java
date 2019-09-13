package db;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectiondb {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		Connection conn =null;
		try
		{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ADMINI", "14255gnits");
			 if(conn!=null)
			 {
				 System.out.println("The Connection has established Succesfully");
				 System.out.println(conn);

		 }
		
			else
				{
					System.out.println("The Connection has  not established ");
				
				}
		}
		catch (ClassNotFoundException  cse)
		{
			System.out.println("classnotfound");
		}
		catch (SQLException sql)
		{
			System.out.println("sqlexception");
		}
		finally
		{
			try
			{
			
				conn.close();

			}
			catch (SQLException sql1)
			{
				System.out.println("connection error while closing");
			}
		}
		}
}