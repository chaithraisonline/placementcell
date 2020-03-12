

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet Filter implementation class Loginfilter
 */
public class Loginfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Loginfilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.length()!=0&&password.length()!=0)
		{
			chain.doFilter(request, response);

		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/registration/incompletelogin.html");
			
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
