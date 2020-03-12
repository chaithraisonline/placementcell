

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.Regmodal;

/**
 * Servlet implementation class Changepwd
 */
public class Changepwd extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String password=request.getParameter("password");
	
		HttpSession sn=request.getSession();
		String username=(String) sn.getAttribute("username");
		
		Regmodal r=new Regmodal();
		r.setpassword(password);
		r.setusername(username);
		//System.out.println(password);
		//System.out.println(username);

		
		
		int x=r.changepwd();
		System.out.println(x);
		if(x==1)
		{
		  response.sendRedirect("/registration/pwdchanged.html");
		}
		else
		{
			response.sendRedirect("registration/pwdincomplete.html");
		}
	}

}
