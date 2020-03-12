

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.Regmodal;

/**
 * Servlet implementation class ChangeSpu
 */
public class ChangeSpu extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String puc=request.getParameter("puc");
		HttpSession sn=request.getSession();
		String username=(String) sn.getAttribute("username");
		
		Regmodal m=new Regmodal();
		m.setusername(username);
		m.setpuc(puc);
		
		int x=m.changepu();
		//System.out.println(x);
		if(x==1)
		{
			response.sendRedirect("/registration/sucesschangeTenth.html");
		}
		else
		{
			response.sendRedirect("/registration/changeincomplete.html");

		}
		
	}

}
