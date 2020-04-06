package it.corso.java.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
/* in @WebFilter è necessario specificare i percorsi da intercettare. con /* verrà intercettato qualsiasi percorso.
 * è anche possibile specificare degli attributi. avendo specificato l'urlPattern nel web.xml, posso anche rimuoverlo da qui
 * */
@WebFilter(filterName = "login", urlPatterns = "/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		/* cast per type mismatch tra req e request */
		HttpServletRequest req = (HttpServletRequest) request;
		req.setAttribute("log", "sono il FilterLog"); 

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
