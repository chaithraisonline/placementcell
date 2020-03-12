

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Changepwdfilter
 */
public class Changepwdfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Changepwdfilter() {
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
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		//System.out.println(password);
		//System.out.println(cpassword);

		
			if(password.equals(cpassword))
			{
				chain.doFilter(request, response);
			}
			
			else
			{
				((HttpServletResponse)response).sendRedirect("/registration/pwdincomplete.html");
			}
	}
		

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
