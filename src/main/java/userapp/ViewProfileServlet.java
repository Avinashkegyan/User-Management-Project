package userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException
	{
		Cookie c[] = req.getCookies();
		if(c == null)
		{
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Failed.jsp").forward(req, res);
						
		}
		else
		{
			
			String name = c[0].getValue();
			req.setAttribute("name", name);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
			
		}
	}
}
