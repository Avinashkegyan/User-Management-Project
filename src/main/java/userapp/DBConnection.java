package userapp;
import java.sql.*;
import static userapp.DBinfo.*;
public class DBConnection
{
	private static Connection con =null;
	private DBConnection() {}
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl,user,pword);
						
		}catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getCon()
	{
		return con;
	}
	
	
	
	
}
