

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Object;

import registration.Regmodal;

/**
 * Servlet implementation class Searchjob
 */
public class Searchjob extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
				
		HttpSession sn=request.getSession();
		String tenth=(String) sn.getAttribute("tenth");
		String puc=(String) sn.getAttribute("puc");
		String be=(String) sn.getAttribute("be");
		System.out.println(tenth+" "+puc+" "+be);
		PrintWriter pw=response.getWriter();
		
		Regmodal r=new Regmodal();
		r.settenth(tenth);
		r.setpuc(puc);
		r.setbe(be);
		int x=r.searchjob();
		//PrintWriter pw=response.getWriter();
		ArrayList l=r.l;
	System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			pw.println(itr.next());
			
		}
		
		
			 
		
		
		
		

		//doGet(request, response);
	
	}

}
