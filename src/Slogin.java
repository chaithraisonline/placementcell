

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import registration.Regmodal;

/**
 * Servlet implementation class Slogin
 */
public class Slogin extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Regmodal r=new Regmodal();
		r.setusername(username);
		r.setpassword(password);
	
		int x=r.Slogin();
		System.out.println(x);
		if(x==1)
		{
		
		HttpSession sn=request.getSession(true);
		sn.setAttribute("username", username);
		
		String tenth=r.gettenth();
		sn.setAttribute("tenth", tenth);
		String puc=r.getpuc();
		sn.setAttribute("puc", puc);
		String be=r.getbe();
		sn.setAttribute("be", be);
		
		/*String skill=r.getskill();
		sn.setAttribute("skill",skill);
		String name=r.getname();
		sn.setAttribute("name", name);
		String age=r.getage();
		sn.setAttribute("age", age);*/
	
		System.out.println(tenth+" "+puc+" "+be);
		response.sendRedirect("/registration/sucess.jsp");
		
		}
		else
		{
			response.sendRedirect("/registration/fail.html");
		}
	
		
	}

}
