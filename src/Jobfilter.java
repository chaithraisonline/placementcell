

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import registration.Regmodal;

/**
 * Servlet Filter implementation class Jobfilter
 */
public class Jobfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Jobfilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 String cname=request.getParameter("c_name");
		   String mail=request.getParameter("mail");
		   String role=request.getParameter("role");
		   String tenth=request.getParameter("tenth");
		   String puc=request.getParameter("puc");
		   String be=request.getParameter("be");
		   String skill=request.getParameter("skill");
		   String salary=request.getParameter("salary");
		   String location=request.getParameter("location");
		   if(cname.length()!=0 && mail.length()!=0 && role.length()!=0 && tenth.length()!=0 && puc.length()!=0 && be.length()!=0 && skill.length()!=0 && salary.length()!=0 && location.length()!=0)
		   {
			   chain.doFilter(request, response); 
		   }
		   else
		   {
			   ((HttpServletResponse) response).sendRedirect("/registration/jobdetail.html");
		   }
		   
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
