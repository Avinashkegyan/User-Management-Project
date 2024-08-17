package userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub = new UserBean();
		
		ub.setUname(req.getParameter("uname"));
		ub.setName(req.getParameter("name"));
		ub.setMobile(req.getParameter("mob"));
		ub.setAddr(req.getParameter("addr"));
		ub.setEmail(req.getParameter("mid"));
		ub.setPassword(req.getParameter("pword"));
		
		int k = new RegisterDAO().register(ub);
		if(k>0)
		{
			req.setAttribute("msg", "User Register Successfully...<br>");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
			
		}
		
		
	}
}
