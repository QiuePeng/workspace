package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; datebaseName=Northwind ; encrypt=false", "qiupeng", "1234");) 
		{
			System.out.println("OK");	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
