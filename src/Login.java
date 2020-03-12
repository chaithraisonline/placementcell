

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.Regmodal;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet
{
	
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		

		Regmodal r=new Regmodal();
		r.setusername(username);
		r.setpassword(password);
		
		int x=r.login();
		System.out.println(x);
		if(x==1)
		{
		String c_name = r.getc_name();
		
		HttpSession sn=request.getSession(true);
		sn.setAttribute("c_name", c_name);
		sn.setAttribute("username", username);
	
		response.sendRedirect("/registration/loginsucess.jsp");
		
		}
		else
		{
			response.sendRedirect("/registration/loginfail.html");
		}
	
	}

}
