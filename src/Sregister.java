

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import registration.Regmodal;

/**
 * Servlet implementation class Sregister
 */
public class Sregister extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String age=request.getParameter("age");
		String tenth=request.getParameter("tenth");
		String puc=request.getParameter("puc");
		String be=request.getParameter("be");
		String skill=request.getParameter("skill");
		
		Regmodal m=new Regmodal();
		m.setname(name);
		m.setusername(username);
		m.setpassword(password);
		m.setage(age);
		m.settenth(tenth);
		m.setpuc(puc);
		m.setbe(be);
		m.setskill(skill);
		int x=m.Sregister();
		System.out.println(x);
		if(x==1)
		{
			response.sendRedirect("/registration/Ssucess.html");
		}
		else
		{
			response.sendRedirect("/registration/fail.html");
		}
	
	
	
	}

}
