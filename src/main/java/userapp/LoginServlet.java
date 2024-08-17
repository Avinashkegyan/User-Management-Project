package userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pword");
		
		UserBean ub = new LoginDAO().login(username, password);
		if(ub==null)
		{
			req.setAttribute("msg", "invalid Login Process...");
			req.getRequestDispatcher("Failed.jsp").forward(req, res);
			
		}
		else {
			ServletContext sc = getServletContext();//Accessing ServletContext-Object reference
			sc.setAttribute("ubean", ub);//Adding bean to servletContext
			
			Cookie ck = new Cookie("name", ub.getName());
			res.addCookie(ck);//Adding Cookie
			req.getRequestDispatcher("LoginSuccess.jsp").forward(req, res);
		}		
	}
}
