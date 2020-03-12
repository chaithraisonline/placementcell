

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.Regmodal;

/**
 * Servlet implementation class ChangeStenth
 */
public class ChangeStenth extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{  
		String tenth=request.getParameter("tenth");
		HttpSession sn=request.getSession();
		String username=(String) sn.getAttribute("username");
		//System.out.println(tenth);
		//System.out.println(username);

		
		Regmodal m=new Regmodal();
		m.setusername(username);
		m.settenth(tenth);
		
		int x=m.changetenth();
		//System.out.println(x);
		if(x==1)
		{
			response.sendRedirect("sucesschangeTenth.html");
		}
		else
		{
			response.sendRedirect("changeincomple.html");
		}
	}

}
