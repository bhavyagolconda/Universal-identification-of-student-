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
		Connection conn =null; //  //Creating connection object
		try
		{
			 Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the jdbc driver class
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ADMINI", "14255gnits"); // Storing the connection details in Conn object
			 if(conn!=null) // checking if conn object is null or not
			 {
				 System.out.println("The Connection has established Succesfully");
				 System.out.println(conn);

		         }
		
			else
			{
					System.out.println("The Connection has  not established ");
				
			}
		}
		catch (ClassNotFoundException  cse) // Exception to handle if  class is not found
		{
			System.out.println("classnotfound");
		}
		catch (SQLException sql)  // to handle sql Exception
		{
			System.out.println("sqlexception");
		}
		finally
		{
			try
			{
			
				conn.close(); // closing the conn connection object 

			}
			catch (SQLException sql1)  // if any error while closing this  connection object so this catch block handles the exceptionn
			{
				System.out.println("connection error while closing");
			}
		}
		}
}
