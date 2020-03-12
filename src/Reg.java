

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.Regmodal;


@SuppressWarnings("serial")
public class Reg extends HttpServlet {
	
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String cname=request.getParameter("c_name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Regmodal m = new Regmodal();
		m.setc_name(cname);
		m.setusername(username);
		m.setpassword(password);
		int x=m.register();
		System.out.println(x);
		if(x==1)
		{
			response.sendRedirect("/registration/sucess.html");
		}
		else
		{
			response.sendRedirect("/registration/fail.html");
			
		}
		
		
		
	}

}