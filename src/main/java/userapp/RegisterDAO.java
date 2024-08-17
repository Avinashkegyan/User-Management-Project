package userapp;
import java.sql.*;

public class RegisterDAO 
{
	public int k =0;
	public int register(UserBean ub)
	{
		try
		{
			
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
			("insert into userApp values(?,?,?,?,?,?)");
			
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getName());
			ps.setString(3, ub.getMobile());
			ps.setString(4, ub.getAddr());
			ps.setString(5, ub.getEmail());
			ps.setString(6, ub.getPassword());
			k = ps.executeUpdate();
						
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
