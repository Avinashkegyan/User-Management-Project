package userapp;
import java.sql.*;

public class UpdateProfileDAO
{
	int k = 0;
	
	public int Update(UserBean ub)
	{
		try {
			
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("update userapp set Address=?,Email=?,Mobile=? where uname=? and password=?");
			
			ps.setString(1, ub.getAddr());
			ps.setString(2, ub.getEmail());
			ps.setString(3, ub.getMobile());
			ps.setString(4, ub.getUname());
			ps.setString(5, ub.getPassword());
			k = ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
	}
}
