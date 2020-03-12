

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Sregfilter
 */
public class Sregfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Sregfilter() {
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
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		String age=request.getParameter("age");
		String tenth=request.getParameter("tenth");
		String puc=request.getParameter("puc");
		String be=request.getParameter("be");
		String skill=request.getParameter("skill");
		if(name.length()!=0 && username.length()!=0 && password.length()!=0 && cpassword.length()!=0 && age.length()!=0 && tenth.length()!=0 && puc.length()!=0 && be.length()!=0 && skill.length()!=0)
		{
			if(password.equals(cpassword))
			{
				chain.doFilter(request, response);
					
			}
			else
			{
				((HttpServletResponse) response).sendRedirect("/registration/passerror.html");
				
			
		    }
			
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/registration/errorSlogin.html");
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
