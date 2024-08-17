package userapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException
	{
		Cookie c[] = req.getCookies();
		
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Failed.jsp").forward(req, res);
			
		}
		else
		{
			String fname= c[0].getValue();
			req.setAttribute("fname", fname);
			UserBean ub = (UserBean)req.getServletContext().getAttribute("ubean");
			ub.setAddr(req.getParameter("addr"));
			ub.setEmail(req.getParameter("mid"));
			ub.setMobile(req.getParameter("phno"));
			int k = new UpdateProfileDAO().Update(ub);
			if(k>0)
			{
				req.setAttribute("msg", "Profile Updated Successfully...");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
		}
	}
}
