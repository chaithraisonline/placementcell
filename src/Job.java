

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.Regmodal;

/**
 * Servlet implementation class Job
 */
public class Job extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   String cname=request.getParameter("c_name");
	   String mail=request.getParameter("mail");
	   String role=request.getParameter("role");
	   String tenth=request.getParameter("tenth");
	   String puc=request.getParameter("puc");
	   String be=request.getParameter("be");
	   String skill=request.getParameter("skill");
	   String salary=request.getParameter("salary");
	   String location=request.getParameter("location");

	   Regmodal m=new Regmodal();
	   m.setc_name(cname);
	   m.setmail(mail);
	   m.setrole(role);
	   m.settenth(tenth);
	   m.setpuc(puc);
	   m.setbe(be);
	   m.setskill(skill);
	   m.setsalary(salary);
	   m.setlocation(location);
	   
	   System.out.println(cname+" "+mail+" "+role+" "+tenth+" "+puc+" "+be+" "+skill+" "+salary+" "+location);

	   
	   int x=m.jobreg();
	   System.out.println(x);
	   if(x==1)
	   {
		   response.sendRedirect("/registration/Jobloaded.html");
	   }
	   else
	   {
		   response.sendRedirect("/registration/Failjob.html");
	   }
	}

}
