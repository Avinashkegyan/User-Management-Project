package userapp;
import java.sql.*;

public class LoginDAO 
{
	public UserBean ub = null;
	
	public UserBean login(String un,String pw)
	{
		try {
			
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
			("select * from userApp where uname=? and password=?");
			
			ps.setString(1, un);
			ps.setString(2, pw);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
				ub = new UserBean();
				ub.setUname(rs.getString(1));
				ub.setName(rs.getString(2));
				ub.setMobile(rs.getString(3));
				ub.setAddr(rs.getString(4));
				ub.setEmail(rs.getString(5));
				ub.setPassword(rs.getString(6));
				
			}
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		return ub;
	}
	

}
