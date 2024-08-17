package userapp;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException
	{
		Cookie c[] = req.getCookies();
		
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Failed.jsp").forward(req, res);
			
		}
		else
		{
			String fName = c[0].getValue();
			req.setAttribute("fname", fName);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, res);
			
		}
		
		
		
	}
}
