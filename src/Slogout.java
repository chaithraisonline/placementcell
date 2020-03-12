

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Slogout
 */
public class Slogout extends HttpServlet {
	
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
			
			HttpSession sn=request.getSession();
			sn.invalidate();
			response.sendRedirect("/registration/Slogin.html");
		
	}

}
