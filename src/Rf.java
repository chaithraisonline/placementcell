

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Rf
 */
public class Rf implements Filter {

    /**
     * Default constructor. 
     */
    public Rf() {
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
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		
		if(cname.length()!=0 && username.length()!=0 && password.length()!=0 && cpassword.length()!=0)
		{
			if(password.equals(cpassword))
			{
				chain.doFilter(request, response);
			}
			else
			{
				((HttpServletResponse) response).sendRedirect("/registration/missmatch.html");
			}
			
			
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/registration/incomplete.html");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		// TODO Auto-generated method stub
	}

}
